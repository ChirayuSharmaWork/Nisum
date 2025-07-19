import React from 'react';
import './UserProfile.css';

const UserProfile = ({
  name = 'John Doe',
  email = 'john@example.com',
  avatarUrl = '',
  bio = 'No bio provided.'
}) => {
  const placeholder = 'https://via.placeholder.com/100';

  return (
    <div className="user-card">
      <img src={avatarUrl || placeholder} alt={name} />
      <h3>{name}</h3>
      <p>{email}</p>
      <p>{bio}</p>
    </div>
  );
};

export default UserProfile;
