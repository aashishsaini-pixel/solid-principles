package OCP;

public class SaveToMySqlDB implements SaveToDb {


    @Override
    public void save(Cart cart) {
        System.out.println("Saving the cart : " + cart + " in MySql DB.");
    }
}
