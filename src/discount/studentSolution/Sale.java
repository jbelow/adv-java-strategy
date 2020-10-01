package discount.studentSolution;

public class Sale implements DiscountStrategy {


    @Override
    public double discount() {
        return 0.1;
    }

}

