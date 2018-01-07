import * as React from 'react';
import {shallow} from 'enzyme';
import createMockStore from 'redux-mock-store';

import ProductList from './ProductList';

it('renders without crashing', () => {
  const store = createMockStore([])();
  shallow(<ProductList />, {context: {store}});
});
