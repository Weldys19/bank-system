package model.entites;

public class Account {
	
	private Integer agency;
	private Integer numberAccount;
	private Double balance;
	private Extract extract;
	private Client client;
	
	public Account(Integer agency, Integer numberAccount, Double balance, Extract extract, Client client) {
		this.agency = agency;
		this.numberAccount = numberAccount;
		this.balance = balance;
		this.extract = extract;
		this.client = client;
	}

	public Integer getAgency() {
		return agency;
	}

	public Integer getNumberAccount() {
		return numberAccount;
	}

	public Double getBalance() {
		return balance;
	}

	public Extract getExtract() {
		return extract;
	}

	public Client getClient() {
		return client;
	}
	
	
}
