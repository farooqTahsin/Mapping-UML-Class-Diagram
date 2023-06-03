package one_to_one;

public class Advertiser {
	private Account account;
	public Advertiser() {
		account = new Account(this);
	}
	public Account getAccount() {
		return account;
	}
}
