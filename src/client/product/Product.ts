export interface Product {
  id: string;
  brand: {
    name: string;
  };
  variations: [
    {
      id: string;
      articleNumber: number;
      productUrl: string;
      name: string;
      price: {
        sale: boolean;
        retailPrice: number;
      };
      availability: {
        code: string;
      };
      images: [
        {
          id: string;
          uriTemplate: string;
        }
        ];
      dimensions: [
        {
          type: string;
          colorName: string;
          baseColor: string;
        }
        ];
    }
    ];
  categories: [
    {
      path: string;
      assortment: string;
    }
    ];
  lastModifiedOfSource: number;
  lastModified: number;
}

export type ProductState = Product[];
