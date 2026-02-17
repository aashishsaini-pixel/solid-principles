package OCP;

public record SaveToMongoDB() implements SaveToDb {

    @Override
    public void save(Cart cart) {
        System.out.println("Saving the cart : " + cart + " to Mongo DB.");
    }

}
