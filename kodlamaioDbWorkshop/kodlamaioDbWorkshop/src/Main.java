import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal(1,"İnternet");
        Customer customer1 = new IndividualCustomer(1,"12345", canal,
                "Emrah", "Alkan","159632");
        System.out.println(customer1.getId());
        System.out.println(customer1.getCustomerNumber());
        System.out.println(customer1.getCanal().getName());


        CommercialActivity commercialActivity = new CommercialActivity((IndividualCustomer) customer1, LocalDate.parse("2022-07-25"));
        System.out.println(((IndividualCustomer) customer1).getFirstName());

    }
}
