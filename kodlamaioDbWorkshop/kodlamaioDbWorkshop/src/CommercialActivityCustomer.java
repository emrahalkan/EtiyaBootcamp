import java.util.List;

public class CommercialActivityCustomer extends IndividualCustomer{
    private List<FinancialStatement> financialStatements;

    public CommercialActivityCustomer(int id, String customerNumber, Canal canal, String firstName, String lastName, String identityNumber, List<FinancialStatement> financialStatements) {
        super(id, customerNumber, canal, firstName, lastName, identityNumber);
        this.financialStatements = financialStatements;
    }

    public List<FinancialStatement> getFinancialStatements() {
        return financialStatements;
    }

    public void setFinancialStatements(List<FinancialStatement> financialStatements) {
        this.financialStatements = financialStatements;
    }
}
