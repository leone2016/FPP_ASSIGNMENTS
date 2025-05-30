package Assignment2_1;


public class main {
    public static void main(String[] args) {
        //Address for chicago
        Address add3A = new Address("123 Michigan Ave", "Chicago", "IL", "60601");
        Address add3B = new Address("456 Wacker Dr", "Chicago", "IL", "60606");
        Address add4A = new Address("789 Lake Shore Dr", "Chicago", "IL", "60611");
        Address add4B = new Address("1010 State St", "Chicago", "IL", "60605");

        Customer c1 = new Customer("Jane", "Smith", "987-65-4321", add3A, add3B);
        Customer c2 = new Customer("Mike", "Johnson", "321-54-9876", add4A, add4B);

        // Print customer information

        Customer[] customers = new Customer[] {c1, c2};

        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Social Security Number: " + customer.getSocSecurityNum());
            System.out.println("Billing Address: " + customer.getBillingAddress().toString());
            System.out.println("Shipping Address: " + customer.getShippingAddress().toString());
            System.out.println();
        }
    }
}
