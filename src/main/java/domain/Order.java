package domain;


import interfaces.*;

public class Order
{
    private Drink drink;
    private int sugarQuantity;
    private Message message;
    private boolean extraHot;

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
        return getExtraHotDrinkCommand() +
                ":" + getSugarCommand() +
                ":" + getStickCommand();
    }

    public void setExtraHot() {
        this.extraHot = true;
    }

    public boolean isExtraHot() {
        return extraHot;
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
            case ORANGE_JUICE :
                return "O";
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

    private String getExtraHotDrinkCommand() {
        if (isExtraHot() && !getDrinkCommand().isEmpty())
            return getDrinkCommand().concat("h");
        else return getDrinkCommand();
    }

}
