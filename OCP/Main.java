package OCP;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Starting of Cart 1");


        Product product1 = createProduct("Pizza" , new BigDecimal("400"));

        Product product2 = createProduct("Burger" , new BigDecimal("70"));

        Cart cart1 = createCart(List.of(product1 , product2));

        cart1.productList().add(new Product("fsdf" , new BigDecimal("6788")));

        System.out.println("Calculating the total amount of the cart : " + cart1.calculateTotal());;

        PrintInvoice printInvoice1 = new PrintInvoice(cart1);
        printInvoice1.printInvoice(cart1);


//        System.out.println("Saving the cart in the mysqlDB --> this is in the main function.");

        SaveToDb saveToMySql = new SaveToMySqlDB();
        saveToMySql.save(cart1);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


//        System.out.println("Saving the cart1 in the mongoDB.");

        SaveToDb saveToMongoDB = new SaveToMongoDB();
        saveToMongoDB.save(cart1);



        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        SaveToCasandraDB saveToCasandraDB = new SaveToCasandraDB();
        saveToCasandraDB.save(cart1);

        System.out.println("End of the Cart 1.");

        System.out.println("Starting of the Cart 2.");

    }


    private static Cart createCart(List<Product> products){
        System.out.println("Creating the list of products : " + products);
        return new Cart(products);
    }

    private static Product createProduct(String name , BigDecimal price){
        System.out.println("Product is created with name : " + name + " and price : " + price);
        return new Product(name , price);
    }
}
