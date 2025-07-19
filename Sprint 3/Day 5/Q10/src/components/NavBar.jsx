import React, { useState } from 'react';
import NavItem from './NavItem';
import './NavBar.css';

const NavBar = () => {
  const [activeTab, setActiveTab] = useState('Home');
  const tabs = ['Home', 'About', 'Services', 'Contact'];

  return (
    <nav className="nav-bar">
      <ul>
        {tabs.map(tab => (
          <NavItem
            key={tab}
            label={tab}
            active={tab === activeTab}
            onClick={() => setActiveTab(tab)}
          />
        ))}
      </ul>
    </nav>
  );
};

export default NavBar;
