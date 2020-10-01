package discount.studentSolution;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private DiscountStrategy discountType;

    public CustomerOrder(String customerName, double billAmount, DiscountStrategy discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;
    }

    public double getBillAmount() {
        return billAmount - (billAmount * discountType.discount());
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }
}
