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

        for (Product product : superMarket.products) {
            if (product.equalsIgnoreCase(productName)) {
                superMarket.buyItem(product, amount);
                return;
            } else {
                System.out.println(superMarket + " does not sell " + productName);
            }
        }

//        if(product.equals("bread")){
//            superMarket.buyBread(amount);
//        } else if(product.equals("cheese")){
//            superMarket.buyCheese(amount);
//        } else if(product.equals("fruit")){
//            superMarket.buyFruit(amount);
//        } else if (product.equals("toilet paper")) {
//            superMarket.buyToiletPaper(amount);
//        } else {
//            System.out.println("We do not sell this item");
//        }
    }
}
