import * as React from 'react';
import {Dispatch} from 'redux';
import {connect} from 'react-redux';

import {Product} from '../Product';
import ProductCard from './ProductCard';
import {addProduct} from '../productAction';

interface ProductListProps {
  products: Product[];

  dispatch: Dispatch<{}>;
}

class ProductList extends React.Component<ProductListProps> {
  public render(): JSX.Element {
    return (
      <div>
        {this.props.products.map((product: Product) => <ProductCard key={product.id} product={product} />)}
      </div>
    );
  }

  public componentDidMount(): void {
    this.loadProducts();
  }

  private loadProducts(): void {
    const count = 100;
    Rx.DOM.fromEventSource(`/products?take=${count}`)
      .take(count)
      .subscribe((product: string) => {
        this.props.dispatch(addProduct(JSON.parse(product)));
      });
  }
}

const mapStateToProps = (state: { products: Product[] }): { products: Product[] } => ({
  products: state.products
});

export default connect(mapStateToProps)(ProductList);
