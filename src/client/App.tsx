import * as React from 'react';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import ProductList from './product/components/ProductList';

import './App.css';

export default (): JSX.Element => (
  <MuiThemeProvider>
    <ProductList />
  </MuiThemeProvider>
);
