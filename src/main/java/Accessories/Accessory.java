package Accessories;

import Interfaces.ISell;

public abstract class Accessory implements ISell {

    private String name;
    private int tradePrice;
    private int retailPrice;

    public Accessory(String name, int tradePrice, int retailPrice) {
        this.name = name;
        this.tradePrice = tradePrice;
        this.retailPrice = retailPrice;
    }

    public String getName() {
        return name;
    }

    public int getTradePrice() {
        return tradePrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public int sell(){
        return retailPrice - tradePrice;
    }
}
