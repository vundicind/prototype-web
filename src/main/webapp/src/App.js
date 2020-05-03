import React, { Component } from 'react';
//import logo from './logo.svg';
import './App.css';
//import { Table } from 'antd';
import { BrowserRouter as Router, Switch, Route, Link } from 'react-router-dom';
import HelloWorld from './components/HelloWorld';

class App extends Component {
  render() {
    return (
      <div className="App container">
        <Router>
          <div className="row">
            <div className="col-2">
              <nav>
                <ul>
                  <li><Link to="/hello-world">HelloWorld</Link></li>
                  <li><Link to="/hello-world">HelloWorld2</Link></li>
                  <li><Link to="/hello-world">HelloWorld3</Link></li>
                  <li><Link to="/hello-world">HelloWorld4</Link></li>
                  <li><Link to="/hello-world">HelloWorld5</Link></li>
                </ul>
              </nav>
            </div>
            <div className="col-10">
              <Switch>
                <Route path="/hello-world" component={HelloWorld} />
                <Route path="/hello-world2">
                  <HelloWorld />
                </Route>
                <Route path="/hello-world3">
                  <HelloWorld />
                </Route>
                <Route path="/hello-world4">
                  <HelloWorld />
                </Route>
                <Route path="/hello-world5">
                  <HelloWorld />
                </Route>
              </Switch>
            </div>
          </div> {/* end of .row */}
        </ Router>
      </div>
    );
  }
}

export default App;
