package secondAproach;

public class Chicken extends Sandwich {

    @Override
    public String getDescription() {
        return "Chicken Sandwich";
    }

    @Override
    public double getPrice() {
        return 5.00 + super.getPrice();
    }
}
