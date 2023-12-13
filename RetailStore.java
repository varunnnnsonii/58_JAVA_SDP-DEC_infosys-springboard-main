public class RetailStore {
    int BillId,CustomerId,Discount;
    double BillAmount, DiscountedBillAmount ;


    public void setBillAmount(double billAmount) {
        BillAmount = billAmount;
    }
    public void setBillId(int billId) {
        BillId = billId;
    }
    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }
    public void setDiscount(int discount) {
        Discount = discount;
    }
    public void setDiscountedBillAmount(double discountedBillAmount) {
        DiscountedBillAmount = discountedBillAmount;
    }
    public double getBillAmount() {
        return BillAmount;
    }
    public int getBillId() {
        return BillId;
    }
    public int getCustomerId() {
        return CustomerId;
    }
    public int getDiscount() {
        return Discount;
    }
    public double getDiscountedBillAmount() {
        return DiscountedBillAmount;
    }
    public double CalculateBill(double billAmount,int Discount){
        double discount= Discount;

        double discountedBillAmount = billAmount - billAmount * (discount/100);


        return discountedBillAmount ;
    }


    public static void main(String[] args) {
        RetailStore t1 = new RetailStore();
        t1.setBillAmount(100);
        t1.setBillId(25);
        t1.setCustomerId(001);
        t1.setDiscount(20);
        t1.setDiscountedBillAmount(t1.CalculateBill(t1.getBillAmount(),t1.Discount));
        double result =t1.CalculateBill(t1.getBillAmount(),t1.Discount);
        System.out.println("Total Amount :"+ result);
        System.out.println("Total Amount :"+ t1.DiscountedBillAmount);
    }

}
