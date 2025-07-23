import React, { useReducer, useState } from 'react';

const initialState = [];

const reducer = (state, action) => {
  switch (action.type) {
    case 'ADD':
      return [...state, { id: Date.now(), text: action.payload, completed: false }];
    case 'TOGGLE':
      return state.map(todo =>
        todo.id === action.payload ? { ...todo, completed: !todo.completed } : todo
      );
    case 'DELETE':
      return state.filter(todo => todo.id !== action.payload);
    default:
      return state;
  }
};

const TodoReducer = () => {
  const [todos, dispatch] = useReducer(reducer, initialState);
  const [text, setText] = useState('');

  const handleAdd = () => {
    if (text.trim() !== '') {
      dispatch({ type: 'ADD', payload: text });
      setText('');
    }
  };

  const completed = todos.filter(todo => todo.completed).length;
  const pending = todos.length - completed;

  return (
    <div>
      <h2>Todo List</h2>
      <input
        type="text"
        placeholder="Add a todo"
        value={text}
        onChange={(e) => setText(e.target.value)}
      />
      <button onClick={handleAdd}>Add</button>
      <ul>
        {todos.map(todo => (
          <li
            key={todo.id}
            style={{ textDecoration: todo.completed ? 'line-through' : 'none' }}
          >
            {todo.text}
            <button onClick={() => dispatch({ type: 'TOGGLE', payload: todo.id })}>
              Toggle
            </button>
            <button onClick={() => dispatch({ type: 'DELETE', payload: todo.id })}>
              Delete
            </button>
          </li>
        ))}
      </ul>
      <p>Completed: {completed} | Pending: {pending}</p>
    </div>
  );
};

export default TodoReducer;
