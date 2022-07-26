import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Address;
import entities.AddressType;
import entities.AdslProduct;
import entities.Channel;
import entities.CorporateCustomer;
import entities.IndividualCustomer;
import entities.Invoice;
import entities.Package;
import entities.Payment;
import entities.Product;
import entities.Service;
import entities.Subscription;
import entities.SubscriptionPackage;

public class Main {
    public static void main(String[] args){

        List<Product> products = new ArrayList<Product>();
        List<SubscriptionPackage> subscriptionPackages = new ArrayList<SubscriptionPackage>();
        List<Address> addresses = new ArrayList<Address>();
        List<Subscription> subscriptions = new ArrayList<Subscription>();
        List<Invoice> invoices = new ArrayList<Invoice>();
        List<Payment> payments = new ArrayList<Payment>();

        AddressType addressType1 = new AddressType(1,"Ev",addresses);
        CorporateCustomer corporateCustomer1 = new CorporateCustomer("123","ABC",1,"12345278278",subscriptions,addresses);
        Address address1 = new Address(1,"İzmir",addressType1,corporateCustomer1);
        Service service1 = new Service(1,"Telefon",products);
        AdslProduct adslProduct1 = new AdslProduct(1,"ASUS","13456","Bakır","1",service1,5,2);
        Subscription subscription1 = new Subscription(1,corporateCustomer1, LocalDate.parse("2022-01-01"),service1,subscriptionPackages,invoices);
        products.add(adslProduct1);
        Package package1 = new Package(1,"Paket",100,LocalDate.parse("2022-01-01"),
                LocalDate.parse("2022-02-02"),30,subscriptionPackages);
        SubscriptionPackage subscriptionPackage1 = new SubscriptionPackage(1515,subscription1,package1);
        Channel channel1 = new Channel(1,"Kanal",payments);
        IndividualCustomer individualCustomer1 = new IndividualCustomer(2,"789456","Atakan","sfsdknfsd","5468948",subscriptions,addresses);
        Payment payment1 = new Payment();
        payment1.setId(1);
        payment1.setChannel(channel1);
        payment1.setDate(LocalDate.parse("2022-07-26"));
        Invoice invoice1 = new Invoice(1,subscription1,LocalDate.parse("2022-07-25"),LocalDate.parse("2022-07-26"),payment1);
        payment1.setInvoice(invoice1);
        subscriptionPackages.add(subscriptionPackage1);
        addresses.add(address1);
        payments.add(payment1);
        invoices.add(invoice1);

        System.out.println(invoice1.getPayment().getChannel().getName());








    }
}
