package model.entites;

import java.time.LocalDate;

public class Extract {
	private String senderName;
	private String recipientName;
	private TypeOfOperations typeOfOperation;
	private LocalDate dateOfOperation;
	private Double valueOfOperation;
	
	public Extract(String senderName, String recipientName, TypeOfOperations typeOfOperation, LocalDate dateOfOperation, Double valueOfOperation) {
		this.senderName = senderName;
		this.recipientName = recipientName;
		this.typeOfOperation = typeOfOperation;
		this.dateOfOperation = dateOfOperation;
		this.valueOfOperation = valueOfOperation;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public TypeOfOperations getTypeOfOperation() {
		return typeOfOperation;
	}

	public void setTypeOfOperation(TypeOfOperations typeOfOperation) {
		this.typeOfOperation = typeOfOperation;
	}

	public LocalDate getDateOfOperation() {
		return dateOfOperation;
	}

	public void setDateOfOperation(LocalDate dateOfOperation) {
		this.dateOfOperation = dateOfOperation;
	}

	public Double getValueOfOperation() {
		return valueOfOperation;
	}

	public void setValueOfOperation(Double valueOfOperation) {
		this.valueOfOperation = valueOfOperation;
	}

	public String getRecipientName() {
		return recipientName;
	}
	
}
