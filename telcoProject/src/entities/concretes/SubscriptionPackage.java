package entities.concretes;

public class SubscriptionPackage {

    private int id;
    private Subscription subscription;
    private Package packageId;


    public SubscriptionPackage() {
    }

    public SubscriptionPackage(int id, Subscription subscription, Package packageId) {
        this.id = id;
        this.subscription = subscription;
        this.packageId = packageId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Package getPackageId() {
        return packageId;
    }

    public void setPackageId(Package packageId) {
        this.packageId = packageId;
    }
}
