public class BillingInformation {

    private String receiverName;

    private String receiverPhone;

    private Address deliveryAddress;

    private CreditCardInformation creditCardInfo;




    public BillingInformation(String receiverName, String receiverPhone, Address deliveryAddress, CreditCardInformation creditCardInfo) {

        this.receiverName = receiverName;

        this.receiverPhone = receiverPhone;

        this.deliveryAddress = deliveryAddress;

        this.creditCardInfo = creditCardInfo;
    }

}
