import * as React from 'react';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import ProductList from './product/components/ProductList';

import './App.css';

export default (): JSX.Element => (
  <div>
    <div styleName="app">
      <div styleName="header">
        <h2>Welcome to React</h2>
      </div>
      <p styleName="intro">
        To get started, edit <code>src/client/App.js</code> and save to reload.
      </p>
    </div>
    <MuiThemeProvider>
      <ProductList />
    </MuiThemeProvider>
  </div>
);
