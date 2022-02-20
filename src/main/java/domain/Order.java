package domain;


import interfaces.*;

public class Order
{
    private Drink drink;
    private int sugarQuantity;
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Order(Drink drink) {
        this.drink = drink;
        this.sugarQuantity = 0;
    }

    public void addSugar() {
        this.sugarQuantity +=1;
    }

    public Drink getDrink() {
        return drink;
    }

    public DrinkType getDrinkType() {
        return drink.getDrinkType();
    }

    public int getSugarQuantity() {
        return sugarQuantity;
    }

    @Override
    public String toString() {
        return getDrinkCommand() +
                ":" + getSugarCommand() +
                ":" + getStickCommand();
    }


    // Tools
    private String getDrinkCommand() {
        switch (getDrinkType()) {
            case COFFEE:
                return "C";
            case TEA:
                return "T";
            case CHOCOLATE:
                return "H";
            default:
                return "";
        }
    }

    private String getSugarCommand() {
        if (getSugarQuantity() == 0) {
            return "";
        }

        return String.valueOf(getSugarQuantity());
    }

    private String getStickCommand() {
        if (getSugarQuantity() == 0) {
            return "";
        }

        return "0";
    }
}
