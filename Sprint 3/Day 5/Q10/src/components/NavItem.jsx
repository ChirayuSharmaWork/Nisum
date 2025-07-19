import React from 'react';

const NavItem = ({ label, active, onClick }) => {
  return (
    <li className={`nav-item ${active ? 'active' : ''}`} onClick={onClick}>
      {label}
    </li>
  );
};

export default NavItem;
