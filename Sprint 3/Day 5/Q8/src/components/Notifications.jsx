import React from 'react';
import './Notifications.css';

const Notifications = ({ list }) => {
  return (
    <div className="notifications">
      {list.map((item, index) => (
        <div className={`notification ${item.read ? 'read' : 'unread'}`} key={index}>
          <p>{item.message}</p>
          <span>{item.date}</span>
          <span>{item.read ? 'Read' : 'Unread'}</span>
        </div>
      ))}
    </div>
  );
};

export default Notifications;
