import {Action, handleActions} from 'redux-actions';

import {Product, ProductState} from './Product';
import ProductActionType from './constants/ProductActionType';

export default handleActions<ProductState, Product>({
  [ProductActionType.ADD_PRODUCT]: (state: ProductState, action: Action<Product>): ProductState => [
    ...state,
    action.payload as Product
  ]
}, []);
