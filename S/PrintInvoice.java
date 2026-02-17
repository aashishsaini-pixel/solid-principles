package S;

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

public record PrintInvoice(Cart cart){

        void printInvoice() {
        System.out.println("Printing the invoice for the cart : " + cart);
        double discount = 10.0;
        System.out.println("Congrats you are getting a discount of : " + discount);
        System.out.println("Total price of all the products are : " + (cart.calculateTotal() - discount));
    }

}
