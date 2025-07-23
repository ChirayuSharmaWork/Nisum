import React, { useEffect, useState, useRef } from 'react';

const ProductList = () => {
  const [products, setProducts] = useState([]);
  const [filtered, setFiltered] = useState([]);
  const [search, setSearch] = useState('');
  const [category, setCategory] = useState('All');
  const [minPrice, setMinPrice] = useState(0);
  const [maxPrice, setMaxPrice] = useState(2000);
  const debounceRef = useRef(null);

  useEffect(() => {
    fetch('/products.json')
      .then(res => res.json())
      .then(data => {
        setProducts(data);
        setFiltered(data);
      });
  }, []);

  useEffect(() => {
    if (debounceRef.current) clearTimeout(debounceRef.current);
    debounceRef.current = setTimeout(() => {
      filterProducts();
    }, 400);
  }, [search, category, minPrice, maxPrice]);

  const filterProducts = () => {
    let filteredData = products.filter(product => {
      return (
        product.name.toLowerCase().includes(search.toLowerCase()) &&
        (category === 'All' || product.category === category) &&
        product.price >= minPrice &&
        product.price <= maxPrice
      );
    });
    setFiltered(filteredData);
  };

  return (
    <div>
      <h2>Product Filter</h2>
      <input
        type="text"
        placeholder="Search by name"
        onChange={(e) => setSearch(e.target.value)}
      />
      <select onChange={(e) => setCategory(e.target.value)}>
        <option value="All">All Categories</option>
        <option value="Mobile">Mobile</option>
        <option value="Laptop">Laptop</option>
      </select>
      <input
        type="number"
        placeholder="Min Price"
        value={minPrice}
        onChange={(e) => setMinPrice(Number(e.target.value))}
      />
      <input
        type="number"
        placeholder="Max Price"
        value={maxPrice}
        onChange={(e) => setMaxPrice(Number(e.target.value))}
      />
      <ul>
        {filtered.map(product => (
          <li key={product.id}>
            {product.name} - ${product.price} ({product.category})
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ProductList;
