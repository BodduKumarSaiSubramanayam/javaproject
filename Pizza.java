package bill;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int takeawayPrice = 20;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeaway = false;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        if (this.isVeg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
    }

    public void addExtraCheese() {
        if (!isExtraCheeseAdded) {
            price += extraCheesePrice;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!isExtraToppingsAdded) {
            price += extraToppingsPrice;
            isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        if (!isTakeaway) {
            price += takeawayPrice;
            isTakeaway = true;
        }
    }

    public void getBill() {
        System.out.println("Pizza : " + (isVeg ? "300" : "400"));
        if (isExtraCheeseAdded) System.out.println("Extra Cheese : " + extraCheesePrice);
        if (isExtraToppingsAdded) System.out.println("Extra Toppings : " + extraToppingsPrice);
        if (isTakeaway) System.out.println("Take away : " + takeawayPrice);
        System.out.println("Total Amount: " + price);
        System.out.println("\nThank you!!!! Visit Again.....");
    }
}
