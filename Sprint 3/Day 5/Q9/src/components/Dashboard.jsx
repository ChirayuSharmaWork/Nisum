import React from 'react';
import UserProfile from './UserProfile';
import Notifications from './Notifications';

const Dashboard = () => {
  const user = {
    name: 'Chirayu Sharma',
    email: 'chirayu@mail.com',
    avatarUrl: '',
    bio: 'Frontend Engineer'
  };

  const notifications = [
    { message: 'Project deadline tomorrow!', date: '2025-07-19', read: false },
    { message: 'Weekly meeting at 10am', date: '2025-07-18', read: true }
  ];

  return (
    <div>
      <UserProfile {...user} />
      <Notifications list={notifications} />
    </div>
  );
};

export default Dashboard;
