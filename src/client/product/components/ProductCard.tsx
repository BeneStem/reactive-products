import * as React from 'react';
import {Card, CardHeader} from 'material-ui/Card';

import {Product} from '../Product';

interface ProductCardProps {
  product: Product;
}

class ProductCard extends React.Component<ProductCardProps> {
  public render(): JSX.Element {
    return (
      <Card>
        <CardHeader title={this.props.product.id} />
      </Card>
    );
  }

  public shouldComponentUpdate(nextProps: ProductCardProps): boolean {
    return this.props.product.id !== nextProps.product.id;
  }
}

export default ProductCard;
