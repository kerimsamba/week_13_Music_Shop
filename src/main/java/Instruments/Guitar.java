package Instruments;

public class Guitar extends Instrument {

    private int guitarString;

    public Guitar(String name, int tradePrice, int retailPrice,  String sound, int guitarString){
        super(name, tradePrice, retailPrice, sound);
        this.guitarString = guitarString;
    }

    public int getGuitarString() {
        return guitarString;
    }
}
