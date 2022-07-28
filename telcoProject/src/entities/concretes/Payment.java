package entities.concretes;

import java.time.LocalDate;

public class Payment {
    private int id;
    private LocalDate date;
    private Canal channel;
    private Invoice invoice;

    public Payment() {
    }

    public Payment(int id, LocalDate date, Canal channel, Invoice invoice) {

        this.id = id;
        this.date = date;
        this.channel = channel;
        this.invoice = invoice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Canal getChannel() {
        return channel;
    }

    public void setChannel(Canal channel) {
        this.channel = channel;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
