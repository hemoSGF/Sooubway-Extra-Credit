package firstAproach;

public class VeggieWithEgg extends Veggie {
    public VeggieWithEgg() {
        description = "Veggie with Egg";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.00;
    }
}

