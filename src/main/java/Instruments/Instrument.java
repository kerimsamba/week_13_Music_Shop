package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String name;
    private int tradePrice;
    private int retailPrice;
    private String sound;

    public Instrument(String name, int tradePrice, int retailPrice, String sound) {
        this.name = name;
        this.tradePrice = tradePrice;
        this.retailPrice = retailPrice;
        this.sound = sound;
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

    public String play(){
        return sound;
    }

    public int sell() {
        return retailPrice - tradePrice;
    }

}
