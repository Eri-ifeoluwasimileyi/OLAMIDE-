public class CreditCardInformation { // Credit card information

    private String cvv;

    private int expirationYear;

    private int expirationMonth;

    private String cardNumber;

    private String nameOnCard;

    private CardType cardType;



    public CreditCardInformation(String cvv, int expirationYear, int expirationMonth, String cardNumber, String nameOnCard, CardType cardType) {

        this.cvv = cvv;

        this.expirationYear = expirationYear;

        this.expirationMonth = expirationMonth;

        this.cardNumber = cardNumber;

        this.nameOnCard = nameOnCard;

        this.cardType = cardType;
    }
}
