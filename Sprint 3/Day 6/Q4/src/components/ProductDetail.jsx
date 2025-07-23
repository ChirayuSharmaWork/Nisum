import React, { useEffect, useState } from 'react';
import { useParams, useNavigate, Link } from 'react-router-dom';

const ProductDetail = () => {
  const { id } = useParams();
  const navigate = useNavigate();
  const [product, setProduct] = useState(null);

  useEffect(() => {
    fetch('/products.json')
      .then(res => res.json())
      .then(data => {
        const found = data.find(p => p.id === parseInt(id));
        setProduct(found);
      });
  }, [id]);

  if (!product) return <p>Loading...</p>;

  return (
    <div>
      <nav>
        <Link to="/">Home</Link> / <Link to="/products">Products</Link> / {product.name}
      </nav>
      <h2>{product.name}</h2>
      <img src={product.image || 'https://via.placeholder.com/150'} alt={product.name} />
      <p>Price: ${product.price}</p>
      <p>Description: {product.description || 'No description available.'}</p>
      <p>Stock: {product.stock || 'In Stock'}</p>
      <button onClick={() => navigate(-1)}>Go Back</button>
    </div>
  );
};

export default ProductDetail;
