import java.time.LocalDate;

public class CommercialActivity {
    private IndividualCustomer individualCustomer;
    private LocalDate startingDate;

    public CommercialActivity() {
    }

    public CommercialActivity(IndividualCustomer individualCustomer, LocalDate startingDate) {
        this.individualCustomer = individualCustomer;
        this.startingDate = startingDate;
    }

    public IndividualCustomer getIndividualCustomer() {
        return individualCustomer;
    }

    public void setIndividualCustomer(IndividualCustomer individualCustomer) {
        this.individualCustomer = individualCustomer;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }
}
