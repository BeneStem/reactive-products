/* tslint:disable:no-any */
import * as React from 'react';
import * as ReactDOM from 'react-dom';
import * as injectTapEventPlugin from 'react-tap-event-plugin';
import {AppContainer} from 'react-hot-loader';
import {createStore, Store} from 'redux';
import {Provider} from 'react-redux';

import rootReducer from './common/rootReducer';
import App from './App';

import './index.css';

const store: Store<any> = createStore(rootReducer);

const render = (Component: any): void => {
  const root = (
    <AppContainer>
      <Provider store={store}>
        <Component />
      </Provider>
    </AppContainer>
  );
  ReactDOM.render(root, document.getElementById('root'));
};

injectTapEventPlugin();
render(App);

declare const module: any;
if (module.hot) {
  module.hot.accept('./App', () => {
    render(App);
  });
}
