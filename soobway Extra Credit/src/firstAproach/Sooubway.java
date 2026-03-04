package firstAproach;

public class Sooubway {
    public static void main(String[] args) {

        Sandwich chicken = new Chicken();
        System.out.println(chicken.getDescription() + " $" + chicken.getPrice()
        );

        Sandwich ChickenWithMayonnaise = new ChickenWithMustard();
        System.out.println(ChickenWithMayonnaise.getDescription() + " $" + ChickenWithMayonnaise.getPrice()
        );
    }
}
