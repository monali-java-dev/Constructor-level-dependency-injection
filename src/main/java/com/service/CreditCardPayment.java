package com.service;

public class CreditCardPayment implements IPayment{
	@Override
	 public void Pay(Double amount)
	{
		System.out.println("payment successfully debit usimg creditcardPAyment");
	}

}
