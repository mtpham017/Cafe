import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Item[] itemArray = new Item[]{
                new Drink(DrinkType.Coffee, "Americano", 4.00),
                new Drink(DrinkType.Coffee, "Cafe Latte", 4.50),
                new Drink(DrinkType.Coffee, "Matcha Latte", 5.50),
                new Drink(DrinkType.Coffee, "Chai Tea Latte", 5.00),
                new Drink(DrinkType.Coffee, "Espresso", 4.00),
                new Drink(DrinkType.Coffee, "Earl Grey Tea", 4.00),
                new Drink(DrinkType.Special, "Black Sesame Latte", 5.00),
                new Drink(DrinkType.Special, "Jamaica Soda", 5.00),
                new Drink(DrinkType.Special, "Authentic Mexican Hot Chocolate", 6.00),
                new Drink(DrinkType.Other, "Coca Cola", 3.50),
                new Drink(DrinkType.Other, "Orange Juice", 3.50),
                new Drink(DrinkType.Other, "Apple Juice", 3.50),
                new Drink(DrinkType.Coffee, "Granita", 5.10),
                new Item(ItemType.Food, "Carnitas Burrito", 12.00),
                new Item(ItemType.Food, "Chicken Burrito", 11.00),
                new Item(ItemType.Food, "Chips and Salsa", 7.00),
                new Item(ItemType.Pastry, "Tres Leches Cake", 6.00),
                new Item(ItemType.Pastry, "Carrot Cupcake", 4.80),
                new Item(ItemType.Pastry, "Matcha Anko Poundcake", 4.50),
                new Item(ItemType.Pastry, "Flan", 5.50),
                new Item(ItemType.Pastry, "Banana Bread", 5.00),
                new Item(ItemType.Pastry, "Gooey Scoos (Chocolate Chip Cookie)", 2.70),
        };
        menu.addAll(itemArray);

        Scanner input = new Scanner(System.in);
        int exit = 0;

        while (exit != 4) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("\t1- Drinks\n\t2- Food\n\t3- Pastries\n\t4- Exit");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    menu.listDrinks();
                    break;

                case 2:
                    menu.listFood();
                    break;

                case 3:
                    menu.listPastry();
                    break;

                case 4:
                    exit = 4;
                    System.out.println("Have a nice day!");
                    break;
                default:
                    System.out.println("");
                    break;
            }
        }
    }

}