import React from 'react';
import { useWishlist } from '../hooks/useWishlist';

const products = [
  { id: 1, name: 'iPhone 14', price: 999 },
  { id: 2, name: 'MacBook Air', price: 1299 }
];

const ProductList = () => {
  const { toggleWishlist, isInWishlist } = useWishlist();

  return (
    <div>
      <h2>Products</h2>
      {products.map(product => (
        <div key={product.id} style={{ marginBottom: '10px' }}>
          <p>
            {product.name} - ${product.price}
            <span
              style={{ cursor: 'pointer', marginLeft: '10px', color: isInWishlist(product.id) ? 'red' : 'grey' }}
              onClick={() => toggleWishlist(product)}
            >
              ❤️
            </span>
          </p>
        </div>
      ))}
    </div>
  );
};

export default ProductList;
