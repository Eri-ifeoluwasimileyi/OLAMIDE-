import java.util.ArrayList;

public class Customer extends User{

    private ArrayList<BillingInformation> billingInfo;
    private ShoppingCart cart;

    public Customer(String name, int age, String email, String password, String phone) {

        this.name = name;

        this.age = age;

        this.email = email;

        this.password = password;

        this.phone = phone;
    }
}
