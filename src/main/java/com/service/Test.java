package com.service;

public class Test {
	public static void main(String args[])
	{
		DebitCardPayment debit = new DebitCardPayment();// this is constructor level injection
	PaymentService service = new PaymentService(debit);
//	service.doPayment(30000.9);
//	service.upiPayment = new UpiPayment(); 
//	service.creditCardPayment = new CreditCardPayment();
//	service.debitCardPayment = new DebitCardPayment();
	service.payment= new UpiPayment();
	service.doPayment(4000.9);
	service.payment = new DebitCardPayment();
	service.doPayment(4000.9);
	service.payment = new CreditCardPayment();
	service.doPayment(4000.9);
	}

}
