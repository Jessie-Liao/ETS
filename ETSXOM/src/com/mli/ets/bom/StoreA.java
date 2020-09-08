package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;

public class StoreA implements Serializable {
	private static final long serialVersionUID = 1L;

	public StoreA() throws ParseException {
	}

	private String type = "null"; // 類別
	private double amount = -999999; // 金額

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
