package bill;


public class DeluxPizza extends Pizza {
    public DeluxPizza(Boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    // Override to prevent adding again
    @Override
    public void addExtraCheese() {}
    
    @Override
    public void addExtraToppings() {}
}
