package Instruments;

public class Trumpet extends Instrument{

    private int trumpetValves;

    public Trumpet(String name, int tradePrice, int retailPrice,  String sound, int trumpetValves){
        super(name, tradePrice, retailPrice, sound);
        this.trumpetValves = trumpetValves;
    }

    public int getTrumpetValves() {
        return trumpetValves;
    }
}
