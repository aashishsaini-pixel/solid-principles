package OCP;


import java.math.BigDecimal;
import java.util.*;

public record Cart(List<Product> productList) {

    public static final BigDecimal DISCOUNT_AMOUNT = new BigDecimal("10.00");

    public Cart {
        productList = List.copyOf(
                Objects.requireNonNull(productList, "Products list cannot be null")
        );
    }

    @Override
    public String toString() {
        return "Cart{products=" + productList.size() + ", total=" + calculateFinalAmount() + "}";
    }

    public BigDecimal calculateTotal() {
        return productList.stream()
                .map(Product::price).
                reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal calculateFinalAmount(){
        return calculateTotal().subtract(DISCOUNT_AMOUNT);
    }

//    @Override
//    public List<Product> productList() {
//        return productList;
////        return Collections.unmodifiableList(productList);
//    }


}
