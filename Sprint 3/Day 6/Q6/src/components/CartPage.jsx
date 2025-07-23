import React from 'react';
import { useCart } from '../context/CartContext';

const CartPage = () => {
  const { cart, increment, decrement, remove, clear } = useCart();

  const total = cart.reduce((acc, item) => acc + item.price * item.qty, 0);

  return (
    <div>
      <h2>Your Cart</h2>
      {cart.length === 0 ? (
        <p>Cart is empty.</p>
      ) : (
        <>
          <ul>
            {cart.map(item => (
              <li key={item.id}>
                {item.name} - ${item.price} × {item.qty} = ${item.price * item.qty}
                <div>
                  <button onClick={() => decrement(item.id)} disabled={item.qty <= 1}>-</button>
                  <button onClick={() => increment(item.id)}>+</button>
                  <button onClick={() => remove(item.id)}>Remove</button>
                </div>
              </li>
            ))}
          </ul>
          <h3>Total: ${total}</h3>
          <button onClick={clear}>Clear Cart</button>
        </>
      )}
    </div>
  );
};

export default CartPage;
