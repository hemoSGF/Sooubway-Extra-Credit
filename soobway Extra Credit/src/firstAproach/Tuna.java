package firstAproach;

public class Tuna extends Sandwich {
    public Tuna() {
        description = "Tuna";
    }

    @Override
    public double getPrice() {
        return 5.50;
    }
}
