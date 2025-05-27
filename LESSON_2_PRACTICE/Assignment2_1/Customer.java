package Assignment2_1;

public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private String billingAddress;
    private String shippingAddress;

    public Customer(String firstName, String lastName, String socSecurityNum, String billingAddress, String shippingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getSocSecurityNum() {
        return socSecurityNum;
    }
    public String getBillingAddress() {
        return billingAddress;
    }
    public String getShippingAddress() {
        return shippingAddress;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socSecurityNum='" + socSecurityNum + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                '}';
    }
}
