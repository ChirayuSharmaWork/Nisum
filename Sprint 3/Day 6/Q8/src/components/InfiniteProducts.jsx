import React, { useState, useEffect, useRef, useCallback } from 'react';

const fakeAPI = (page, category) => {
  const allProducts = Array.from({ length: 100 }, (_, i) => ({
    id: i + 1,
    name: `Product ${i + 1}`,
    category: i % 2 === 0 ? 'Electronics' : 'Clothing',
    price: Math.floor(Math.random() * 1000) + 100
  }));

  const filtered = category === 'All'
    ? allProducts
    : allProducts.filter(p => p.category === category);

  const perPage = 10;
  const start = (page - 1) * perPage;
  const end = page * perPage;
  const pageData = filtered.slice(start, end);

  return new Promise((resolve) => {
    setTimeout(() => {
      resolve({ products: pageData, hasMore: end < filtered.length });
    }, 500);
  });
};

const InfiniteProducts = () => {
  const [products, setProducts] = useState([]);
  const [page, setPage] = useState(1);
  const [hasMore, setHasMore] = useState(true);
  const [loading, setLoading] = useState(false);
  const [category, setCategory] = useState('All');
  const loader = useRef(null);

  const loadProducts = useCallback(async () => {
    if (!hasMore) return;
    setLoading(true);
    const { products: newProducts, hasMore: more } = await fakeAPI(page, category);
    setProducts(prev => [...prev, ...newProducts]);
    setHasMore(more);
    setLoading(false);
  }, [page, category, hasMore]);

  useEffect(() => {
    loadProducts();
  }, [loadProducts]);

  useEffect(() => {
    const observer = new IntersectionObserver(entries => {
      if (entries[0].isIntersecting && hasMore && !loading) {
        setPage(prev => prev + 1);
      }
    });
    if (loader.current) observer.observe(loader.current);
    return () => loader.current && observer.unobserve(loader.current);
  }, [hasMore, loading]);

  const handleCategoryChange = (cat) => {
    setCategory(cat);
    setProducts([]);
    setPage(1);
    setHasMore(true);
  };

  return (
    <div>
      <h2>Infinite Products</h2>
      <div>
        <button onClick={() => handleCategoryChange('All')}>All</button>
        <button onClick={() => handleCategoryChange('Electronics')}>Electronics</button>
        <button onClick={() => handleCategoryChange('Clothing')}>Clothing</button>
      </div>
      <ul>
        {products.map(p => (
          <li key={p.id}>
            {p.name} - ${p.price} ({p.category})
          </li>
        ))}
      </ul>
      {loading && <p>Loading...</p>}
      <div ref={loader} style={{ height: '30px' }}></div>
    </div>
  );
};

export default InfiniteProducts;
