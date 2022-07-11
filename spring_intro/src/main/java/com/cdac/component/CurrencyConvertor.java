package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("currencyConv")
public class CurrencyConvertor {
	public double convert(String from,String to,double amount) {
		if(from.equals("USD")&&to.equals("INR"))
			return 78.98 * amount;
		else if(from.equals("GBP")&&to.equals("INR"))
			return 94.41*amount;
		else
			return 0;
	}
}
