package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;

public class STKOrderNow implements Serializable {
	private static final long serialVersionUID = 1L;

	public STKOrderNow() throws ParseException {
	}

	private double stkDecAmt = -999999;
	private double stkDecAmt2 = -999999;
	private double glstkDecAmt = -999999;
	private double glstkDecAmt2 = -999999;
	private double stkPrice = -999999;
	private double stkPriceInfee = -999999;
	private double glstkPrice = -999999;
	private double glstkPriceInfee = -999999;

	public double getStkDecAmt() {
		return stkDecAmt;
	}

	public void setStkDecAmt(double stkDecAmt) {
		this.stkDecAmt = stkDecAmt;
	}

	public double getStkDecAmt2() {
		return stkDecAmt2;
	}

	public void setStkDecAmt2(double stkDecAmt2) {
		this.stkDecAmt2 = stkDecAmt2;
	}

	public double getGlstkDecAmt() {
		return glstkDecAmt;
	}

	public void setGlstkDecAmt(double glstkDecAmt) {
		this.glstkDecAmt = glstkDecAmt;
	}

	public double getGlstkDecAmt2() {
		return glstkDecAmt2;
	}

	public void setGlstkDecAmt2(double glstkDecAmt2) {
		this.glstkDecAmt2 = glstkDecAmt2;
	}

	public double getStkPrice() {
		return stkPrice;
	}

	public void setStkPrice(double stkPrice) {
		this.stkPrice = stkPrice;
	}

	public double getStkPriceInfee() {
		return stkPriceInfee;
	}

	public void setStkPriceInfee(double stkPriceInfee) {
		this.stkPriceInfee = stkPriceInfee;
	}

	public double getGlstkPrice() {
		return glstkPrice;
	}

	public void setGlstkPrice(double glstkPrice) {
		this.glstkPrice = glstkPrice;
	}

	public double getGlstkPriceInfee() {
		return glstkPriceInfee;
	}

	public void setGlstkPriceInfee(double glstkPriceInfee) {
		this.glstkPriceInfee = glstkPriceInfee;
	}

}
