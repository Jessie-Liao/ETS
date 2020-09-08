package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;

public class NewDec implements Serializable {
	private static final long serialVersionUID = 1L;

	public NewDec() throws ParseException {
	}

	private String fundID = "null"; // 組別名稱
	private String product = "null"; // 商品別
	private String productID = "null"; // 商品名稱
	private String bs = "null"; // 買賣別
	private String sectorNO = "null"; // 產業別
	private String sectorName = "null"; // 產業名稱
	private String industryNO = "null"; // 行業別
	private String industryName = "null"; // 行業名稱
	private String currency = "null"; // 幣別
	private boolean systemBank = false; // 是否為系統重要性銀行
	// ======================================新增
	private String tradeType = "null";// 融資券別
	private boolean domestic = false; // 是否為本國企業發行
	private String productarea = "null"; // 商品地區
	/*----------------------------------------待處理----------------------------------------*/
	private double price = -999999;
	private double amount = -999999;
	private double amount2 = -999999;
	private double amount3 = -999999;
	private String apCol2 = "null";
	private String apCol1 = "null";

	/*----------------------------------------待處理----------------------------------------*/

	public String getFundID() {
		return fundID;
	}

	public void setFundID(String fundID) {
		this.fundID = fundID;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}
	

	public String getProductarea() {
		return productarea;
	}

	public void setProductarea(String productarea) {
		this.productarea = productarea;
	}

	public String getSectorNO() {
		return sectorNO;
	}

	public void setSectorNO(String sectorNO) {
		this.sectorNO = sectorNO;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	public String getIndustryNO() {
		return industryNO;
	}

	public void setIndustryNO(String industryNO) {
		this.industryNO = industryNO;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public boolean isSystemBank() {
		return systemBank;
	}

	public void setSystemBank(boolean systemBank) {
		this.systemBank = systemBank;
	}

	public boolean isDomestic() {
		return domestic;
	}

	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}

	/*----------------------------------------待處理----------------------------------------*/
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmount2() {
		return amount2;
	}

	public void setAmount2(double amount2) {
		this.amount2 = amount2;
	}

	public double getAmount3() {
		return amount3;
	}

	public void setAmount3(double amount3) {
		this.amount3 = amount3;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getApCol2() {
		return apCol2;
	}

	public void setApCol2(String apCol2) {
		this.apCol2 = apCol2;
	}

	public String getApCol1() {
		return apCol1;
	}

	public void setApCol1(String apCol1) {
		this.apCol1 = apCol1;
	}

	/*----------------------------------------待處理----------------------------------------*/

}
