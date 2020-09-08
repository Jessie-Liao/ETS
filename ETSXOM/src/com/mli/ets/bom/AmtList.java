package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;

public class AmtList implements Serializable {
	private static final long serialVersionUID = 1L;

	public AmtList() throws ParseException {
	}

	private String stkType = "null";
	private double amount = -999999;

	public String getStkType() {
		return stkType;
	}

	public void setStkType(String stkType) {
		this.stkType = stkType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
