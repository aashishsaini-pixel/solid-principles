package S;

import java.util.List;
import java.util.OptionalDouble;

public class Cart {

    private final List<Product> productList;

    public Cart (List<Product> productList){
        this.productList = productList;
    }

    List<Product> getProductList(){
        return this.productList;
    }

    @Override
    public String toString() {
        return "Solid.Cart{" + "productList=" + productList + '}';
    }

   public Double calculateTotal(){
       OptionalDouble totalPrice =  productList.stream().peek(product ->  {
           System.out.println("Solid.Product Name : " + product.name() + " price : " + product.price());
       }).mapToDouble(Product::price).reduce(Double::sum);
       if(totalPrice.isPresent()){
           return totalPrice.getAsDouble();
       }
        return null;
    }
}
