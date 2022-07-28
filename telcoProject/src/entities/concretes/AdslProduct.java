package entities.concretes;

import entities.abstracts.Product;

public class AdslProduct extends Product {

    private int bandWidth;
    private int speedCapability;

    public AdslProduct(){

    }


    public AdslProduct(int id, String brand, String serialNumber, String cableType, String cableLength, Service service, int bandWidth, int speedCapability) {
        super(id, brand, serialNumber, cableType, cableLength, service);
        this.bandWidth = bandWidth;
        this.speedCapability = speedCapability;
    }

    public int getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(int bandWidth) {
        this.bandWidth = bandWidth;
    }

    public int getSpeedCapability() {
        return speedCapability;
    }

    public void setSpeedCapability(int speedCapability) {
        this.speedCapability = speedCapability;
    }
}
