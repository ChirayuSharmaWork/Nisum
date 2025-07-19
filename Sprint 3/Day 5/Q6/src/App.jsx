import React from 'react';
import TodoList from './components/TodoList';

function App() {
  const tasks = ['Learn React', 'Build Components', 'Practice Props'];

  return (
    <div>
      <h2>My Todos</h2>
      <TodoList todos={tasks} />
    </div>
  );
}

export default App;
