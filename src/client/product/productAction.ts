import {createAction} from 'redux-actions';

import {Product} from './Product';
import ProductActionType from './constants/ProductActionType';

const addProduct = createAction<Product, Product>(ProductActionType.ADD_PRODUCT, (product: Product) => product);

export {
  addProduct
};
