import React from 'react';
import Notifications from './components/Notifications';

function App() {
  const data = [
    { message: 'New message from client', date: '2025-07-19', read: false },
    { message: 'Meeting at 3PM', date: '2025-07-18', read: true }
  ];

  return (
    <div>
      <h2>Notifications</h2>
      <Notifications list={data} />
    </div>
  );
}

export default App;
