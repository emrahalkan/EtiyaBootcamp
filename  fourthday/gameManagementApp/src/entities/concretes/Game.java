package entities.concretes;

public class Game {
    private Campaign campaign;
    private int id;
    private String name;
    private double price;
    private double discountPrice;

    public Game() {}

    public Game(Campaign campaign, int id, String name, double price, double discountPrice) {
        this.campaign = campaign;
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountPrice = discountPrice;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
}
