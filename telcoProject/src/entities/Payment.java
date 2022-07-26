package entities;

import java.time.LocalDate;

public class Payment {
    private int id;
    private LocalDate date;
    private Channel channel;
    private Invoice invoice;

    public Payment() {
    }

    public Payment(int id, LocalDate date, Channel channel, Invoice invoice) {

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

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
