package OCP;
// USING THE CLASS , CONSTRUCTOR AND GETTERS AND SETTERS


//public class Solid.Product {
//    private final String name;
//    private final Double price;
//
//    Solid.Product(String name , Double price){
//        this.name = name;
//        this.price = price;
//    }
//
//
//    String getName(){
//        return this.name;
//    }
//
//    Double getPrice(){
//        return this.price;
//    }
//
//    @Override
//    public String toString(){
//        return "Solid.Product Name : " +  this.name + " Solid.Product Price: " + this.price;
//    }
//
//
//}


// USING THE JAVA RECORDS...........:)


//public record Product(String name , Double price){
//
//    @Override
//    public String toString(){
//        return "OCP.Product Name : " + this.name + " OCP.Product Price : " + this.price;
//    }
//
//}


// improvise the Product


import java.math.BigDecimal;
import java.util.Objects;

public record Product(String name, BigDecimal price) {

    public Product {
        Objects.requireNonNull(name, "Product Name cannot be null.");
        Objects.requireNonNull(price, "Product Price cannot be null");

        if (name.isBlank()) {
            throw new IllegalArgumentException("Product name cannot be blank");
        }

        if (price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Product price cannot be negative");
        }
    }


}