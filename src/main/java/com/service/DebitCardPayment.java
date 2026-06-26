package com.service;

public class DebitCardPayment implements IPayment {
	@Override
	 public void Pay(Double amount)
	{
		System.out.println("paayment successfully using debitcard payement");
	}

	

}
