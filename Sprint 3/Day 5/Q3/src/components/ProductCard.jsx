import React from 'react';
import './ProductCard.css';

const ProductCard = ({
  title = "iPhone 15",
  price = 1099,
  description = "Latest model with improved battery life."
}) => {
  const cardStyle = { border: '1px solid black', padding: '15px', margin: '10px' };

  return (
    <div className="product-card" style={cardStyle}>
      <h2>{title}</h2>
      <p>Price: ${price}</p>
      <p>{description}</p>
    </div>
  );
};

export default ProductCard;
