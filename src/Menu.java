import java.util.*;


public class Menu {

    private ArrayList<Item> items = new ArrayList<>();

    public void addItems(Item d){
        items.add(d);
    }
    public void addAll(Item[] itemList) {
        items.addAll(Arrays.asList(itemList));
    }
    public void listDrinks(){
        PriorityQueue<Drink> arrDrinks = new PriorityQueue<>();
        for(Item item : items) {
            if(item.getType() == ItemType.Drink) {
                Drink d = (Drink) item;
                arrDrinks.add(d);
            }
        }
        while(!arrDrinks.isEmpty()) {
            Drink current = arrDrinks.poll();
            current.printCard();
        }
    }
    public void listFood() {
        for (Item d : items) {
            if (d.getType() == ItemType.Food)
                d.printCard();
        }
    }
    public void listPastry() {
        for (Item d : items) {
            if (d.getType() == ItemType.Pastry)
                d.printCard();
        }
    }





}



