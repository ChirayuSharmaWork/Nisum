import React from 'react';
import StatusBadge from './components/StatusBadge';

function App() {
  return (
    <div>
      <StatusBadge status="success" />
      <StatusBadge status="error" />
      <StatusBadge status="warning" />
    </div>
  );
}

export default App;
