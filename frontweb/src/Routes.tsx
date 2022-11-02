import Navbar from 'components/Navbar';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import Login from 'pages/Login';
import Sidebar from 'components/Siderbar';

const Routes = () => {
  return (
    <BrowserRouter>
      <Switch>
        <Route path="/login" exact>
          <Login />
        </Route>

        <Route path="/home">
          <Navbar></Navbar>
          <div className="main">
          <Sidebar/>
          </div>
        </Route>
      </Switch>
    </BrowserRouter>
  );
};

export default Routes;
