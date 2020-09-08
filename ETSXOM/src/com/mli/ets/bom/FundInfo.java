package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;

public class FundInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	public FundInfo() throws ParseException {
	}

	private FundStore fundStore = new FundStore(); // 基金投資總額
	private String fundAssetType = "null";// 資產類型
	private String countryType = "null";// 國內外
	private String fundTypeByCode = "null";// 編碼類別
	private String fundType = "null";// 基金類型
	private String ruleFundAssetType = "null";// 法規基金類型
	private double fundDecAmt = -999999;// 本次的國內外受益憑證金額(台幣)
	private double fundDecAmt_Abroad = -999999;// 本次的國內外受益憑證金額(原幣)
	private boolean fundstakeHolder = false;// 是否為基金利害關係人

	public String getFundAssetType() {
		return fundAssetType;
	}

	public void setFundAssetType(String fundAssetType) {
		this.fundAssetType = fundAssetType;
	}

	public String getCountryType() {
		return countryType;
	}

	public void setCountryType(String countryType) {
		this.countryType = countryType;
	}

	public String getFundTypeByCode() {
		return fundTypeByCode;
	}

	public void setFundTypeByCode(String fundTypeByCode) {
		this.fundTypeByCode = fundTypeByCode;
	}

	public String getFundType() {
		return fundType;
	}

	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getRuleFundAssetType() {
		return ruleFundAssetType;
	}

	public void setRuleFundAssetType(String ruleFundAssetType) {
		this.ruleFundAssetType = ruleFundAssetType;
	}

	public double getFundDecAmt() {
		return fundDecAmt;
	}

	public void setFundDecAmt(double fundDecAmt) {
		this.fundDecAmt = fundDecAmt;
	}

	public Boolean getFundstakeHolder() {
		return fundstakeHolder;
	}

	public void setFundstakeHolder(Boolean fundstakeHolder) {
		this.fundstakeHolder = fundstakeHolder;
	}

	public double getFundDecAmt_Abroad() {
		return fundDecAmt_Abroad;
	}

	public void setFundDecAmt_Abroad(double fundDecAmt_Abroad) {
		this.fundDecAmt_Abroad = fundDecAmt_Abroad;
	}

	public FundStore getFundStore() {
		return fundStore;
	}

	public void setFundStore(FundStore fundStore) {
		this.fundStore = fundStore;
	}

}
