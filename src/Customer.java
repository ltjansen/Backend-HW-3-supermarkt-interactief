public class Customer {
    String name;
    SuperMarket superMarket;

    public Customer(String name) {
        this.name = name;
    }

    public void goToSupermarket(SuperMarket superMarket){
        this.superMarket = superMarket;
    }

    public void buyItem(String product, int amount){
        if(product.equals("bread")){
            superMarket.buyBread(amount);
        } else if(product.equals("cheese")){
            superMarket.buyCheese(amount);
        } else if(product.equals("fruit")){
            superMarket.buyFruit(amount);
        } else if (product.equals("toilet paper")) {
            superMarket.buyToiletPaper(amount);
        } else {
            System.out.println("We do not sell this item");
        }
    }
}
