package OCP;

public class SaveToCasandraDB implements SaveToDb{

    @Override
    public void save(Cart cart) {
        System.out.println("Saving the cart : " + cart + " in Casandra DB.");
    }
}
