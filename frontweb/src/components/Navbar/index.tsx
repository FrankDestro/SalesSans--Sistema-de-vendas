import './styles.css';

import logoMain from 'assets/img/logo.png';
import Profile from 'assets/img/profile2.jpg';
import Logout from 'assets/img/logout.png';
import SeetingsPerfil from 'assets/img/seetings.png';

function Navbar() {
  return (
    <nav className="navbar navbar-expand-md navbar-dark bg-primary main-nav">
      <div className="container-logo">
        <img src={logoMain} alt="Logo Main" />
        <a href="/" className="nav-logo-text">
          <h4>Sales San´s</h4>
        </a>
      </div>

      <div className="collapse navbar-collapse container-user-navbar">
        <ul className="navbar-nav offset-md-9 main-menu">
           <li>
            <div className="dropdown">
             <div className='profile-photo-container'>
              <img src={Profile} alt="profile" />
              <p>alex.brown@gmail.com</p>
              </div>
              <div className="dropdown-content">
                <a href="#"> <img src={SeetingsPerfil} alt="SeetingsPerfil" /> Opções da conta </a>
                <a href="#"> <img src={Logout} alt="Logout" /> Logout </a>
              </div>
            </div>
          </li>

        </ul>
      </div>
    </nav>
  );
}

export default Navbar;
