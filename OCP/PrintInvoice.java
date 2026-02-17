package OCP;

//Using the class only



//public class PrintInvoice {
//
//    public Cart cart;
//
//    PrintInvoice(){
//        this.cart = null;
//    }
//
//    PrintInvoice(Cart cart) {
//        this.cart = cart;
//    }
//
//    void printInvoice() {
//        System.out.println("Printing the invoice for the cart : " + cart);
//        double totalPrice = cart.calculateTotal();
//        double discount = 10.0;
//        System.out.println("Congrats you are getting a discount of : " + discount);
//        System.out.println("Total price of all the products are : " + (cart.calculateTotal() - discount));
//    }
//
//}
//


// using the java record

import java.math.BigDecimal;

import static OCP.Cart.DISCOUNT_AMOUNT;

//import static OCP.Cart.DISCOUNT_AMOUNT;

public record PrintInvoice(Cart cart){


    public void printInvoice(Cart cart) {

        BigDecimal total = cart.calculateTotal();
        BigDecimal finalAmount = cart.calculateFinalAmount();

        System.out.println("========== INVOICE ==========");
        System.out.println("Items: " + cart.productList().size());
        cart.productList().forEach(product ->
                System.out.printf("  - %s: $%.2f%n", product.name(), product.price())
        );
        System.out.println("-----------------------------");
        System.out.printf("Subtotal: $%.2f%n", total);
        System.out.printf("Discount: -$%.2f%n", DISCOUNT_AMOUNT);
        System.out.printf("TOTAL: $%.2f%n", finalAmount);
        System.out.println("=============================");
    }

}
