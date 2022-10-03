package Accessories;

public class GuitarStrings extends Accessory{

    private int packSize;

   public GuitarStrings(String name, int tradePrice, int retailPrice, int packSize){
       super(name, tradePrice, retailPrice);
       this.packSize = packSize;
   }

    public int getPackSize() {
        return packSize;
    }
}
