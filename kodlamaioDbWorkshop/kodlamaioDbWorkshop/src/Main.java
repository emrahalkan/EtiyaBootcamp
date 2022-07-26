import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Canal canal = new Canal(1,"İnternet");
        Customer customer1 = new IndividualCustomer(1,"12345", canal,
                "Emrah", "Alkan","159632");
        System.out.println(customer1.getId());
        System.out.println(customer1.getCustomerNumber());
        System.out.println(customer1.getCanal().getName());

        List<FinancialStatement> financialStatements = new ArrayList<FinancialStatement>();

        FinancialStatement financialStatement = new FinancialStatement(1,customer1,
                LocalDate.parse("2022-7-25"),10000);

        financialStatements.add(financialStatement);

        CommercialActivityCustomer commercialActivity = new CommercialActivityCustomer(1,"12345",canal,"Emrah","Alkan","123456789", financialStatements);
        System.out.println(((IndividualCustomer) customer1).getFirstName());

    }
}
