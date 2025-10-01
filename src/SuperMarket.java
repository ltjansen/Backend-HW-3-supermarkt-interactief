import java.util.ArrayList;
import java.util.List;

public class SuperMarket {
    List<Product> products;
    String name;

    public SuperMarket(String name, List<Product> products) {

            List<Product> fake = new ArrayList<>();
        if (products == null) {
            this.products = fake;
        } else {
            this.products = products;
        }

        this.name = name;
    }

    public void buyItem(Product product, int amount) {
        if (product.amount >= amount) {
            product.amount -= amount;
            System.out.println("You bought " + amount + " " + product.name + " for " +  product.price * amount + " euro.");
        } else {
            System.err.println("You cannot buy " + amount + " " + product.name + ", we have only " + product.amount + " " + product.name + " in stock.");
        }
    }

    public void restockItem(String productName, int amount) {
        for (Product product : this.products) {
            if (product.name.equalsIgnoreCase(productName)) {
                System.out.println("The new stock amount of " + productName + " in " + this.name + " is: " + (amount += product.amount));
                return;
            } else if (!product.name.equals(productName)) {
                continue;
            } else {
                System.out.println(this.name + " does not sell " + productName);
            }
        }

    }
}




//    Product bread;
//    Product fruit;
//    Product toiletPaper;
//    Product cheese;

//        Dit is de simpele constructor zonder null checks
//    public SuperMarket(Product bread, Product fruit, Product toiletPaper, Product cheese) {
//        this.bread = bread;
//        this.fruit = fruit;
//        this.toiletPaper = toiletPaper;
//        this.cheese = cheese;
//    }

////      Dit is de BONUS constructor waar geen null-producten kunnen worden gemaakt.
//    public SuperMarket(Product bread, Product fruit, Product toiletPaper, Product cheese) {
//
//            Product fake = new Product("fake", 0, 0);
//        if(bread == null){
//            this.bread = fake;
//        } else {
//            this.bread = bread;
//        }
//
//        if(fruit == null){
//            this.fruit = fake;
//        } else {
//            this.fruit = fruit;
//        }
//
//        if(toiletPaper == null){
//            this.toiletPaper = fake;
//        } else {
//            this.toiletPaper = toiletPaper;
//        }
//
//        if(cheese == null){
//            this.cheese = fake;
//        } else {
//            this.cheese = cheese;
//        }
//    }

//    public void buyBread(int amount){
//        buyItem(this.bread, amount);
//    }
//    public void buyFruit(int amount){
//        buyItem(this.fruit, amount);
//    }
//    public void buyToiletPaper(int amount){
//        buyItem(this.toiletPaper, amount);
//    }
//    public void buyCheese(int amount){
//        buyItem(this.cheese, amount);
//    }