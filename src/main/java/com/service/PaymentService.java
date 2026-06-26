package com.service;

public class PaymentService {// this is target class
	
	IPayment payment;
	PaymentService(IPayment payment)
	{
	this.payment = payment;	
	}
//	UpiPayment upiPayment;
//	DebitCardPayment debitCardPayment;
//	CreditCardPayment creditCardPayment;
	void doPayment(Double amount)
	{
		payment.Pay(300.9);
//		upiPayment.Pay(amount);
//		creditCardPayment.Pay(amount);
//		debitCardPayment.Pay(amount);
		System.out.println("Payment Completed");
	}

}
