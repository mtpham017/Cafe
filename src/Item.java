enum ItemType {
    Drink,
    Pastry,
    Special,
    Other,
    Food,
}
public class Item  {

    private ItemType type;
    private String name;
    private double price;

    public Item(ItemType ItemType, String Name, double Price){
        type = ItemType;
        name = Name;
        price = Price;
    }

    public ItemType getType() {
        return type;
    }

    public void setPrice(double itemPrice){
        price = itemPrice;

    }

    public void printCard(){
        System.out.printf("%s, Price: $%.2f\n",name, price);
    }

}





