/* tslint:disable:no-any */
import {combineReducers} from 'redux';

import productReducer from '../product/productReducer';

const rootReducer = combineReducers<any>({products: productReducer});

export default rootReducer;
