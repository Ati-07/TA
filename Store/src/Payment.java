package Store.src;
/** This class difine all the payment charges for product.
 * @Author: Ati patel
 * class : IST242
 * @version : 1
 * date : 02/19/2023
 */
abstract class Payment {
    /**
     * payment charge will store payment charges of product
     */
    private double paymentCharge;

    /**
     * this a counstructor for paycharge
     * @param payCharge
     */
    public Payment(double payCharge){
        paymentCharge = payCharge;
    }

    /**
     * This is getmothed for getingpayment
     * @return
     */
    public double getPaymentCharge() {
        return paymentCharge;
    }

    /**
     * this method will handle payment and turning into double
     * @param pay
     * @return
     */
    public abstract double hanlePayment(double pay);

}
