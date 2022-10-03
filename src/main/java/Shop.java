import Accessories.Accessory;
import Instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Instrument> instrumentStock;
    private ArrayList<Accessory> accessoryStock;
    private int money;

    public Shop( int money) {
        this.instrumentStock = new ArrayList<Instrument>();
        this.accessoryStock = new ArrayList<Accessory>();
        this.money = money;
    }

    public ArrayList<Instrument> getInstrumentStock() {
        return instrumentStock;
    }

    public void addToInstrumentStock(Instrument instrument) {
        if (instrument.getTradePrice() <= this.money)
        {
            instrumentStock.add(instrument);
            money -= instrument.getTradePrice();
        }
    }

    public ArrayList<Accessory> getAccessoryStock() {
        return accessoryStock;
    }

    public void addToAccessoryStock(Accessory accessory) {
        if (accessory.getTradePrice() < this.money)
        {
            accessoryStock.add(accessory);
            money -= accessory.getTradePrice();
        }
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
}
