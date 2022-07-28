package entities.concretes;

import entities.abstracts.Product;

public class TivibuProduct extends Product {

    private int usbPort;
    private int speed;

    public TivibuProduct() {
    }

    public TivibuProduct(int id, String brand, String serialNumber, String cableType, String cableLength, Service service, int usbPort, int speed) {
        super(id, brand, serialNumber, cableType, cableLength, service);
        this.usbPort = usbPort;
        this.speed = speed;
    }

    public int getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(int usbPort) {
        this.usbPort = usbPort;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
