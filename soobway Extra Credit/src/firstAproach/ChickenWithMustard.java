package firstAproach;

public class ChickenWithMustard extends Chicken {
    public ChickenWithMustard() {
        description = "Chicken with Mustard";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.75;
    }
}