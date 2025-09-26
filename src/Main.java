import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product bread = new Product("Bread",4, 1.0);
        Product cheese = new Product("Cheese", 4, 3.0);
        Product fruit = new Product("Fruit", 4, 2.0);
        Product toiletPaper = new Product("Toilet paper", 4, 2.5);
        SuperMarket superMarket = new SuperMarket(bread, fruit, toiletPaper, cheese);
        Customer customer = new Customer("Customer");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which product do you want to buy?");
        String name = scanner.nextLine();
        System.out.println("How many do you want to buy?");
        int amount = scanner.nextInt();

        customer.buyItem(name, amount);
        customer.goToSupermarket(superMarket);
        customer.buyItem(name, amount);


    }
}
