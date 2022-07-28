package entities.concretes;

public class BankUser extends User {
	private Bank bank;
	private String bankUserNumber;

	public BankUser() {
		super();
	}

	public BankUser(int id, String userName, String password, String email, String address, Bank bank,
			String bankUserNumber) {
		super(id, userName, password, email, address);
		this.bank = bank;
		this.bankUserNumber = bankUserNumber;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public String getBankUserNumber() {
		return bankUserNumber;
	}

	public void setBankUserNumber(String bankUserNumber) {
		this.bankUserNumber = bankUserNumber;
	}

}
