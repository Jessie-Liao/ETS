package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;

public class CreditRating implements Serializable {
	private static final long serialVersionUID = 1L;

	public CreditRating() throws ParseException {
	}

	private String bestcreditType = "null"; // 標的最佳信評種類(券評->發行人/保證人擇優)
	private String bestCreditLevel = "null"; // 標的最佳信評等級(券評->發行人/保證人擇優)
	private int bestCreditOrder = -999999; // 標的最佳信評分數(券評->發行人/保證人擇優)

	private String creditLevel = "null"; // 標的信評等級(券評->發行人評->保證人評)
	private int creditOrder = -999999; // 標的信評分數(券評->發行人評->保證人評)

	private String issCreditLevel = "null"; // 發行人信評等級
	private int issCreditOrder = -999999; // 發行人信評分數

	private String creditLevel_MLI = "null"; // 三商信用等級
	private int creditOrder_MLI = -999999; // 三商信評分數

	private String countryRiskLevel = "null"; // 所屬國家主權信評等級
	private int countryRiskOrder = -999999; // 所屬國家主權信評分數
	
	//==================================新增
		private int bestDefaultLevel = -999999; // 標的違約等級(券評->發行人/保證人擇優)
		private int issDefaultLevel = -999999; // 發行人違約等級
		private int cbDefaultLevel = -99999; //公司債違約等級
	/*----------------------------------------待處理----------------------------------------*/
	private String credit_ratingLevel = "null"; // 中華信評長債等級
	private int credit_ratingOrder = -999999; // 中華信評長債分數
	private String TRCcredit_Level = "null"; // 中華信評短債等級
	private int TRCcredit_Order = -999999; // 中華信評短債分數
	private double creditRatingorder = -999999; //債券評等分數
	private String creditRatingInfo = "null";  //債券評等資訊
	private double creditDefaultLevel = -999999;  //債券違約等級
	private double issuerRatingorder = -999999;//發行保證評等分數
	private double issuerDefaultLevel = -999999;//發行保證違約等級
	private String issuerRatingInfo = "null";//發行保證評等資訊
	/*----------------------------------------待處理----------------------------------------*/

	
	
	public String getBestcreditType() {
		return bestcreditType;
	}

	public void setBestcreditType(String bestcreditType) {
		this.bestcreditType = bestcreditType;
	}

	public String getBestCreditLevel() {
		return bestCreditLevel;
	}

	public void setBestCreditLevel(String bestCreditLevel) {
		this.bestCreditLevel = bestCreditLevel;
	}

	public int getBestCreditOrder() {
		return bestCreditOrder;
	}

	public void setBestCreditOrder(int bestCreditOrder) {
		this.bestCreditOrder = bestCreditOrder;
	}

	public String getCreditLevel() {
		return creditLevel;
	}

	public void setCreditLevel(String creditLevel) {
		this.creditLevel = creditLevel;
	}

	public int getCreditOrder() {
		return creditOrder;
	}

	public void setCreditOrder(int creditOrder) {
		this.creditOrder = creditOrder;
	}

	public String getIssCreditLevel() {
		return issCreditLevel;
	}

	public void setIssCreditLevel(String issCreditLevel) {
		this.issCreditLevel = issCreditLevel;
	}

	public int getIssCreditOrder() {
		return issCreditOrder;
	}

	public void setIssCreditOrder(int issCreditOrder) {
		this.issCreditOrder = issCreditOrder;
	}

	public String getCreditLevel_MLI() {
		return creditLevel_MLI;
	}

	public void setCreditLevel_MLI(String creditLevel_MLI) {
		this.creditLevel_MLI = creditLevel_MLI;
	}

	public int getCreditOrder_MLI() {
		return creditOrder_MLI;
	}

	public void setCreditOrder_MLI(int creditOrder_MLI) {
		this.creditOrder_MLI = creditOrder_MLI;
	}

	public String getCountryRiskLevel() {
		return countryRiskLevel;
	}

	public void setCountryRiskLevel(String countryRiskLevel) {
		this.countryRiskLevel = countryRiskLevel;
	}

	public int getCountryRiskOrder() {
		return countryRiskOrder;
	}

	public void setCountryRiskOrder(int countryRiskOrder) {
		this.countryRiskOrder = countryRiskOrder;
	}

	public String getCredit_ratingLevel() {
		return credit_ratingLevel;
	}

	public void setCredit_ratingLevel(String credit_ratingLevel) {
		this.credit_ratingLevel = credit_ratingLevel;
	}

	public int getCredit_ratingOrder() {
		return credit_ratingOrder;
	}

	public void setCredit_ratingOrder(int credit_ratingOrder) {
		this.credit_ratingOrder = credit_ratingOrder;
	}

	public String getTRCcredit_Level() {
		return TRCcredit_Level;
	}

	public void setTRCcredit_Level(String tRCcredit_Level) {
		TRCcredit_Level = tRCcredit_Level;
	}

	public int getTRCcredit_Order() {
		return TRCcredit_Order;
	}

	public void setTRCcredit_Order(int tRCcredit_Order) {
		TRCcredit_Order = tRCcredit_Order;
	}

	public int getBestDefaultLevel() {
		return bestDefaultLevel;
	}

	public void setBestDefaultLevel(int bestDefaultLevel) {
		this.bestDefaultLevel = bestDefaultLevel;
	}

	public int getIssDefaultLevel() {
		return issDefaultLevel;
	}

	public void setIssDefaultLevel(int issDefaultLevel) {
		this.issDefaultLevel = issDefaultLevel;
	}

	public int getCbDefaultLevel() {
		return cbDefaultLevel;
	}

	public void setCbDefaultLevel(int cbDefaultLevel) {
		this.cbDefaultLevel = cbDefaultLevel;
	}

	public double getCreditRatingorder() {
		return creditRatingorder;
	}

	public void setCreditRatingorder(double creditRatingorder) {
		this.creditRatingorder = creditRatingorder;
	}

	public String getCreditRatingInfo() {
		return creditRatingInfo;
	}

	public void setCreditRatingInfo(String creditRatingInfo) {
		this.creditRatingInfo = creditRatingInfo;
	}

	public double getCreditDefaultLevel() {
		return creditDefaultLevel;
	}

	public void setCreditDefaultLevel(double creditDefaultLevel) {
		this.creditDefaultLevel = creditDefaultLevel;
	}

	public double getIssuerRatingorder() {
		return issuerRatingorder;
	}

	public void setIssuerRatingorder(double issuerRatingorder) {
		this.issuerRatingorder = issuerRatingorder;
	}

	public double getIssuerDefaultLevel() {
		return issuerDefaultLevel;
	}

	public void setIssuerDefaultLevel(double issuerDefaultLevel) {
		this.issuerDefaultLevel = issuerDefaultLevel;
	}

	public String getIssuerRatingInfo() {
		return issuerRatingInfo;
	}

	public void setIssuerRatingInfo(String issuerRatingInfo) {
		this.issuerRatingInfo = issuerRatingInfo;
	}
	

}
