import java.util.Scanner;

public class AluminumAndGlassSystem {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome costumer! \n Please enter your credentials");

        System.out.println("Name:");
        String name = scanner.nextLine();

        System.out.println("Contact Number:");
        String contactNumber = scanner.nextLine();

        System.out.println("Address: ");
        String address = scanner.nextLine();

        System.out.println("Enter number of items:");
        int numberOfItems = scanner.nextInt();

        String[] customerItems = new String[numberOfItems];

        for (int x = 0; x < customerItems.length; x++) {
            System.out.println("Please enter items:");
            String inputItem = scanner.nextLine();
            customerItems[x] = inputItem;
        }

        Customer customer = new Customer();
        customer.setName(name);
        customer.setAddress(address);
        customer.setContactNumber(contactNumber);
        customer.setItems(customerItems);

        System.out.println("Please confirm to check-out items: ");

        System.out.println("Customer name:" + customer.getName());
        System.out.println("Customer address:" + customer.getAddress());
        System.out.println("Customer contact number:" + customer.getContactNumber());

        System.out.println("List of items:");

        for (int x = 0; x < customer.getItems().length; x++) {
            System.out.println("Item no. " + (x + 1) +" "+ customer.getItems()[x]);
        }
        System.out.println("Do you want to proceed?[Y/N]");

        String answer = scanner.next();

        if (answer.equalsIgnoreCase("y")) {
            System.out.println("Item successfully purchased. Please pay amount");
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("Item not purchased. Please ask for assistance");
        } else {
            System.out.println("Invalid input.");
        }


        // 1- bills payment , 2 - postpaid , 3 - other services



    }


}
