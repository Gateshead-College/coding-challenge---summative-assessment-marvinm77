import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    // creates the names
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        Product jeans = new Product("1","Levis","jeans",1,34.99, "Trousers","1234");
        Product shirt = new Product("2","Levis","shirt",1,34.99, "Shirt","1234");
        Product jacket = new Product("3","Levis","jacket",1,34.99, "Puffer","1234");
        productList.add(jeans);
        productList.add(shirt);
        productList.add(jacket);
        // new instance of menu class
        Scanner scn  = new Scanner(System.in);


        System.out.println("Welcome to M's clothes store!");
        System.out.println("What are you to looking to buy today?");

        // while in the for loop  "p" is the current product
        for(Product p : productList){
            System.out.println(p.getID() + "" + p.getName());
        }
        String selection = scn.nextLine();
        System.out.println("Your selection was " + selection );

       Product selectedItem = null;
        for (Product p : productList){
            if (p.getID().equals(selection)){
                selectedItem = p;
            }
        }
        assert selectedItem != null;
        System.out.println("The price for this is " + selectedItem.getPrice());
        System.out.println("Are you sure you want to buy this item? Y/N");
        String confirmation = scn.nextLine();

        if(confirmation.equals("Y")){
            System.out.println("Purchased Item");
        } else {
            System.out.println("Didn't Purchase Item");
        }


        // for loop that will run while i is less than the size of the array
//        for (int i = 0; i < m.products.length; i++) {
//            System.out.println(m.products[i]);
//        }
//        private void getItem() {
//            System.out.println("What are you looking for?");
//            String query = scn.nextLine();
//
//            private void printMenu () {
//                System.out.println("Welcome to M's clothes store!");
//                System.out.println("What are you to looking to buy today?");
//                System.out.println("1 - ");
//                System.out.println("2 - ");
//                System.out.println("3 - ");
//                System.out.println("4 - ");
//                System.out.println("5 - ");
//
//
     //       }
//        }
    }
}
