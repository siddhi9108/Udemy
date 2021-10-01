package com.siddhi.exceptionhandling;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws 
	CurrenciesDontMatchException {
		if (!this.currency.equals(that.currency))
			// throw new Exception("Currencies Don't Match");
			throw new CurrenciesDontMatchException("Currencies "
					+ "Don't Match " + this.currency + " & " + 
					that.currency);
	}

	public String toString() {
		return amount + " " + currency;
	}
}

class CurrenciesDontMatchException extends Exception {
	public CurrenciesDontMatchException(String s) {
		super(s);
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws CurrenciesDontMatchException {
		Amount am1 = new Amount("USD", 10);
		Amount am2 = new Amount("EUR", 20);
		am1.add(am2);
		System.out.println(am1);
	}

}
