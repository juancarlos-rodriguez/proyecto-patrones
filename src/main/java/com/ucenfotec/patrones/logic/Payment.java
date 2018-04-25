package com.ucenfotec.patrones.logic;

public class Payment {
	private int paymentNumber;
	
	public Payment(int pPaymentNumber) {
		this.paymentNumber = pPaymentNumber;
	}
	
	public void makePayment() {
		//Refactorizar después
	}

	public int getPaymentNumber() {
		return paymentNumber;
	}

	@Override
	public String toString() {
		return "Payment [paymentNumber=" + paymentNumber + "]";
	}
}
