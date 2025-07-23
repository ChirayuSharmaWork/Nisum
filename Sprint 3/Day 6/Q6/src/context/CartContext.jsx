import React, { createContext, useContext, useReducer } from 'react';

const CartContext = createContext();

const initialState = [];

const reducer = (state, action) => {
  switch (action.type) {
    case 'ADD':
      const exists = state.find(item => item.id === action.payload.id);
      if (exists) {
        return state.map(item =>
          item.id === action.payload.id ? { ...item, qty: item.qty + 1 } : item
        );
      }
      return [...state, { ...action.payload, qty: 1 }];

    case 'INCREMENT':
      return state.map(item =>
        item.id === action.payload ? { ...item, qty: item.qty + 1 } : item
      );

    case 'DECREMENT':
      return state.map(item =>
        item.id === action.payload && item.qty > 1
          ? { ...item, qty: item.qty - 1 }
          : item
      );

    case 'REMOVE':
      return state.filter(item => item.id !== action.payload);

    case 'CLEAR':
      return [];

    default:
      return state;
  }
};

export const CartProvider = ({ children }) => {
  const [cart, dispatch] = useReducer(reducer, initialState);

  const addToCart = (product) => dispatch({ type: 'ADD', payload: product });
  const increment = (id) => dispatch({ type: 'INCREMENT', payload: id });
  const decrement = (id) => dispatch({ type: 'DECREMENT', payload: id });
  const remove = (id) => dispatch({ type: 'REMOVE', payload: id });
  const clear = () => dispatch({ type: 'CLEAR' });

  return (
    <CartContext.Provider value={{ cart, addToCart, increment, decrement, remove, clear }}>
      {children}
    </CartContext.Provider>
  );
};

export const useCart = () => useContext(CartContext);
