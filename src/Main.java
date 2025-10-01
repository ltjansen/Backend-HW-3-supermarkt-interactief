import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product bread = new Product("Bread",4, 1.0);
        Product cheese = new Product("Cheese", 4, 3.0);
        Product fruit = new Product("Fruit", 4, 2.0);
        Product toiletPaper = new Product("Toilet paper", 4, 2.5);


        List<Product> productList1 = new ArrayList<>();
            productList1.add(bread);
            productList1.add(cheese);
            productList1.add(fruit);
            productList1.add(toiletPaper);

        List<Product> productList2 = new ArrayList<>();
            productList2.add(bread);
            productList2.add(cheese);
            productList2.add(fruit);
            productList2.add(toiletPaper);

        List<Product> productList3 = new ArrayList<>();
            productList3.add(bread);
            productList3.add(cheese);
            productList3.add(fruit);
            productList3.add(toiletPaper);


//        SuperMarket superMarket = new SuperMarket(bread, fruit, toiletPaper, cheese);
        Customer customer1 = new Customer("Lukas");

        SuperMarket superMarket1 = new SuperMarket("Halbert Eijn", productList1);
        SuperMarket superMarket2 = new SuperMarket("Dumbo", productList2);
        SuperMarket superMarket3 = new SuperMarket("Caldi", productList3);

        Map<String, SuperMarket> supermarketMap = new HashMap<>();
            supermarketMap.put("halbert eijn", superMarket1);
            supermarketMap.put("dumbo", superMarket2);
            supermarketMap.put("caldi", superMarket3);


        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to do?");
        System.out.println("1 - Pick a supermarket");
        System.out.println("2 - buy a product");
        System.out.println("3 - restock a product");
        System.out.println("4 - exit");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Which supermarket do you want to go to?");
                System.out.println("Pick one of the following:");
                System.out.println("- Halbert Eijn");
                System.out.println("- Dumbo");
                System.out.println("- Caldi");
                String superMarketChoice = scanner.nextLine().toLowerCase();
                customer1.goToSupermarket(supermarketMap.get(superMarketChoice));
                break;
            case 2:
                if(customer1.superMarket == null) {
                    System.out.println("Pick a supermarket first.");
                    break;
                }
                System.out.println("Which product do you want to buy from " + customer1.superMarket + "?");
                String productName = scanner.nextLine();
                System.out.println("How many do you want to buy?");
                int amount = scanner.nextInt();
                customer1.buyItem(productName, amount);
                break;
            case 3:
                System.out.println("Which supermarket do you want to restock?");
                System.out.println("Pick one of the following:");
                System.out.println("- Halbert Eijn");
                System.out.println("- Dumbo");
                System.out.println("- Caldi");
                superMarketChoice = scanner.nextLine().toLowerCase();
                supermarketMap.get(superMarketChoice);
                System.out.println("Which product do you want to restock in " + customer1.superMarket + "?");
                productName = scanner.nextLine();
                System.out.println("How many do you want to add?");
                amount = scanner.nextInt();
                supermarketMap.get(superMarketChoice).restockItem(productName, amount);
                break;
            case 4:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("This is no valid input, please select option 1, 2, 3 or 4.");
                break;
        }

//        System.out.println("Which product do you want to buy?");
//        String productName = scanner.nextLine();
//
//        System.out.println("How many do you want to buy?");
//        int amount = scanner.nextInt();

//        customer.goToSupermarket(superMarket);
//        customer.buyItem(productName, amount);


    }
}
