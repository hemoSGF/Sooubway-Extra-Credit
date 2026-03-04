package firstAproach;

public class Steak extends Sandwich {
    public Steak() {
        description = "Steak";
    }

    @Override
    public double getPrice() {
        return 6.50;
    }
}
