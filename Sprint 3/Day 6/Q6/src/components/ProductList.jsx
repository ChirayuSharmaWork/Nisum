import React from 'react';
import { useCart } from '../context/CartContext';

const products = [
  { id: 1, name: 'iPhone 14', price: 999 },
  { id: 2, name: 'MacBook Air', price: 1299 }
];

const ProductList = () => {
  const { addToCart } = useCart();

  return (
    <div>
      <h2>Products</h2>
      {products.map(product => (
        <div key={product.id} style={{ marginBottom: '10px' }}>
          <p>{product.name} - ${product.price}</p>
          <button onClick={() => addToCart(product)}>Add to Cart</button>
        </div>
      ))}
    </div>
  );
};

export default ProductList;
