package dp;

public class Blab implements Lab{

    Blab(){
        placeTest();
    }
    @Override
    public void placeTest() {
        System.out.println("Placing order in B" +
                " lab");
    }
}
