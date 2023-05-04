enum DrinkType{
    Coffee,
    Special,
    Other
}

public class Drink extends Item implements Comparable<Drink> {
    private DrinkType drinkType;
    public Drink(DrinkType Drink, String Name, double Price) {

        super(ItemType.Drink, Name, Price);

        drinkType = Drink;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    @Override
    public int compareTo(Drink o) {
        return drinkType.compareTo(o.drinkType);

    }
}
