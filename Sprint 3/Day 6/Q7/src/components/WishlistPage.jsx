import React from 'react';
import { useWishlist } from '../hooks/useWishlist';

const WishlistPage = () => {
  const { wishlist, toggleWishlist } = useWishlist();

  return (
    <div>
      <h2>My Wishlist</h2>
      {wishlist.length === 0 ? (
        <p>No items in wishlist.</p>
      ) : (
        <ul>
          {wishlist.map(item => (
            <li key={item.id}>
              {item.name} - ${item.price}
              <button onClick={() => toggleWishlist(item)}>Remove ❤️</button>
            </li>
          ))}
        </ul>
      )}
    </div>
  );
};

export default WishlistPage;
