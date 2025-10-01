public class Customer {
    String name;
    SuperMarket superMarket;

    public Customer(String name) {
        this.name = name;
    }

    public void goToSupermarket(SuperMarket superMarket){
        this.superMarket = superMarket;
    }

    public void buyItem(String productName, int amount){

//        Check eerst of de klant al een supermarkt heeft gekozen, anders kun je niet verder
        if(superMarket == null){
            System.out.println("Select a supermarket to go to first");
            return;
        }

//        // dit heb ik uiteindelijk ook niet meer goed werkend gekregen//
        for (Product product : superMarket.products) {
            if (product.equalsIgnoreCase(productName)) {
                superMarket.buyItem(product, amount);
                return;
//            } else if (!product.equals(productName)) {
//                continue;
            } else {
                System.out.println(superMarket + " does not sell " + productName);
            }
        }

    }
}
