package S;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        // making a cart

        Product product1 = new Product("Burger" , 50.0);
        Product product2 = new Product("Pizza" , 500.0);

        Cart firstCart = new Cart(Arrays.asList(product1 , product2));

        System.out.println("Calculating the total amount of the cart : " + firstCart.calculateTotal());;

        PrintInvoice printInvoice = new PrintInvoice(firstCart);
        printInvoice.printInvoice();


        SaveToDb saveToDb = new SaveToDb(firstCart);
        saveToDb.savingToDb();



        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        // adding the second cart../.....P:)

        Product product3 = new Product("Bottle" , 570.0);
        Product product4 = new Product("Chaap" , 5450.0);


        System.out.println();

        Cart secondCart = new Cart(Arrays.asList(product3 , product4));

        System.out.println();

        System.out.println("Total amount for the second cart is : " + secondCart.calculateTotal());

        PrintInvoice secondCartInvoice = new PrintInvoice(secondCart);

        System.out.println("Printing the invoice of the second cart : " );

        System.out.println();
        System.out.println();
        System.out.println();

        secondCartInvoice.printInvoice();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        SaveToDb secondCartSave = new SaveToDb(secondCart);
        secondCartSave.savingToDb();



    }
}
