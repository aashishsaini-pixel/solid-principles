package S;
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


public record Product(String name , Double price){

    @Override
    public String toString(){
        return "Solid.Product Name : " + this.name + " Solid.Product Price : " + this.price;
    }

}