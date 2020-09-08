package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;

public class STKOrderToday implements Serializable {
	private static final long serialVersionUID = 1L;

	public STKOrderToday() throws ParseException {
	}

	private String tmHeadManagerID = "null";
	private double tmStoreAmt = -999999;
	private String dmHeadManagerID = "null";
	private double dmStoreAmt = -999999;
	private String mdmHeadManagerID = "null";
	private double mdmStoreAmt = -999999;
	private double mliStoreAmt = -999999;
	private double stkDecShares = -999999;
	private double glstkDecShares = -999999;
	private double fundCountryStoreAmt = -999999;
	private double todayStkAmt_B = -999999;
	private double todayStkAmt_C = -999999;
	private double todayStkAmt_D = -999999;
	private double glStkNBStoreAmt = -999999;
	private double stkIndustryStoreAmt = -999999;

	public String getTmHeadManagerID() {
		return tmHeadManagerID;
	}

	public void setTmHeadManagerID(String tmHeadManagerID) {
		this.tmHeadManagerID = tmHeadManagerID;
	}

	public double getTmStoreAmt() {
		return tmStoreAmt;
	}

	public void setTmStoreAmt(double tmStoreAmt) {
		this.tmStoreAmt = tmStoreAmt;
	}

	public String getDmHeadManagerID() {
		return dmHeadManagerID;
	}

	public void setDmHeadManagerID(String dmHeadManagerID) {
		this.dmHeadManagerID = dmHeadManagerID;
	}

	public double getDmStoreAmt() {
		return dmStoreAmt;
	}

	public void setDmStoreAmt(double dmStoreAmt) {
		this.dmStoreAmt = dmStoreAmt;
	}

	public String getMdmHeadManagerID() {
		return mdmHeadManagerID;
	}

	public void setMdmHeadManagerID(String mdmHeadManagerID) {
		this.mdmHeadManagerID = mdmHeadManagerID;
	}

	public double getMdmStoreAmt() {
		return mdmStoreAmt;
	}

	public void setMdmStoreAmt(double mdmStoreAmt) {
		this.mdmStoreAmt = mdmStoreAmt;
	}

	public double getMliStoreAmt() {
		return mliStoreAmt;
	}

	public void setMliStoreAmt(double mliStoreAmt) {
		this.mliStoreAmt = mliStoreAmt;
	}

	public double getStkDecShares() {
		return stkDecShares;
	}

	public void setStkDecShares(double stkDecShares) {
		this.stkDecShares = stkDecShares;
	}

	public double getGlstkDecShares() {
		return glstkDecShares;
	}

	public void setGlstkDecShares(double glstkDecShares) {
		this.glstkDecShares = glstkDecShares;
	}

	public double getFundCountryStoreAmt() {
		return fundCountryStoreAmt;
	}

	public void setFundCountryStoreAmt(double fundCountryStoreAmt) {
		this.fundCountryStoreAmt = fundCountryStoreAmt;
	}

	public double getTodayStkAmt_B() {
		return todayStkAmt_B;
	}

	public void setTodayStkAmt_B(double todayStkAmt_B) {
		this.todayStkAmt_B = todayStkAmt_B;
	}

	public double getTodayStkAmt_C() {
		return todayStkAmt_C;
	}

	public void setTodayStkAmt_C(double todayStkAmt_C) {
		this.todayStkAmt_C = todayStkAmt_C;
	}

	public double getTodayStkAmt_D() {
		return todayStkAmt_D;
	}

	public void setTodayStkAmt_D(double todayStkAmt_D) {
		this.todayStkAmt_D = todayStkAmt_D;
	}

	public double getGlStkNBStoreAmt() {
		return glStkNBStoreAmt;
	}

	public void setGlStkNBStoreAmt(double glStkNBStoreAmt) {
		this.glStkNBStoreAmt = glStkNBStoreAmt;
	}

	public double getStkIndustryStoreAmt() {
		return stkIndustryStoreAmt;
	}

	public void setStkIndustryStoreAmt(double stkIndustryStoreAmt) {
		this.stkIndustryStoreAmt = stkIndustryStoreAmt;
	}

}
