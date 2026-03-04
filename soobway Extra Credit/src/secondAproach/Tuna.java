package secondAproach;

public class Tuna extends Sandwich {

    @Override
    public String getDescription() {
        return "Tuna Sandwich";
    }

    @Override
    public double getPrice() {
        return 5.50 + super.getPrice();
    }
}
