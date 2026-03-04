package firstAproach;

public class TunaWithTahini extends Tuna {
    public TunaWithTahini() {
        description = "Tuna with Tahini";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.50;
    }
}
