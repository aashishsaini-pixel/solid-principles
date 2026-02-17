package S;

public class SaveToDb {

    private Cart cart;

    public SaveToDb(Cart cart) {
        this.cart = cart;
    }

    void savingToDb(){
        System.out.println("Saving the Solid.Cart to DB : " + cart.toString());
    }

    @Override
    public String toString() {
        return this.cart + "";
    }
}
