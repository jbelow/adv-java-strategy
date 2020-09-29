package discount.studentSolution;

public class Discount implements CustomerOrderStrategy {

    private String customerName;
    private double billAmount;

    public Discount(String customerName, double billAmount) {
        this.customerName = customerName;
        this.billAmount = billAmount;
    }


    @Override
    public double newOrder(String discountType) {
        double tempBill;
        tempBill = billAmount - (billAmount * 0.5);

        return tempBill;
    }
}
