package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mli.ets.base.BaseHelper;

public class STKInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	public STKInfo() throws ParseException {
	}

	private STKOrderNow stkOrderNow = new STKOrderNow();
	private STKOrderToday stkOrderToday = new STKOrderToday();
	private List<STKStore> stkStore = new ArrayList<STKStore>();
	private STKOrderTodayStoreCost stkOrderTodayStoreCost = new STKOrderTodayStoreCost();
	private Boolean foreign = true;
	private String fStkType = "null";
	private String fGlstkType = "null";
	private String stkTypeByCode = "null";
	private String checkISFirstStockData = "null";
	private double stkCapital = -999999;
	private double stkIssueShare = -999999;
	private double avgVolume10 = -999999;
	private Boolean stockPoolData = true;
	private double mNowValue = -999999;
	private Date preatradeDate = BaseHelper.getDefaultDate();
	private String prefFixType = "null";
	private String industryNew = "null";
	private double totalIssueAmt = -999999;
	private String etfStakeHolders = "null";// ETF關係人狀態
	private boolean checkLeveragedETF = false;// 是否為槓桿型ETF
	
	/*20200717: Jessie新增用來判斷是否為金控銀行，因398修改*/
	private boolean controlBankListFlag =false;//是否為金控銀行
	
	/*20200717: Jessie新增用來判斷投資額度是否超過5%，因398修改*/
	private boolean invest5PercentFlag=false;//投資額度是否超過5%
	
	/*20200717: Jessie新增用來判斷交易量是否超過1%，因398修改*/
	private boolean trade1PercentFlag=false;//交易量是否超過1%
	
	public STKOrderNow getStkOrderNow() {
		return stkOrderNow;
	}

	public boolean isControlBankListFlag() {
		return controlBankListFlag;
	}

	public void setControlBankListFlag(boolean controlBandListFlag) {
		this.controlBankListFlag = controlBandListFlag;
	}

	public boolean isInvest5PercentFlag() {
		return invest5PercentFlag;
	}

	public void setInvest5PercentFlag(boolean invest5PercentFlag) {
		this.invest5PercentFlag = invest5PercentFlag;
	}

	public boolean isTrade1PercentFlag() {
		return trade1PercentFlag;
	}

	public void setTrade1PercentFlag(boolean trade1PercentFlag) {
		this.trade1PercentFlag = trade1PercentFlag;
	}

	public void setStkOrderNow(STKOrderNow stkOrderNow) {
		this.stkOrderNow = stkOrderNow;
	}

	public STKOrderToday getStkOrderToday() {
		return stkOrderToday;
	}

	public void setStkOrderToday(STKOrderToday stkOrderToday) {
		this.stkOrderToday = stkOrderToday;
	}

	public List<STKStore> getStkStore() {
		return stkStore;
	}

	public void setStkStore(List<STKStore> stkStore) {
		this.stkStore = stkStore;
	}

	public STKOrderTodayStoreCost getStkOrderTodayStoreCost() {
		return stkOrderTodayStoreCost;
	}

	public void setStkOrderTodayStoreCost(
			STKOrderTodayStoreCost stkOrderTodayStoreCost) {
		this.stkOrderTodayStoreCost = stkOrderTodayStoreCost;
	}

	public Boolean getForeign() {
		return foreign;
	}

	public void setForeign(Boolean foreign) {
		this.foreign = foreign;
	}

	public String getfStkType() {
		return fStkType;
	}

	public void setfStkType(String fStkType) {
		this.fStkType = fStkType;
	}

	public String getfGlstkType() {
		return fGlstkType;
	}

	public void setfGlstkType(String fGlstkType) {
		this.fGlstkType = fGlstkType;
	}

	public String getStkTypeByCode() {
		return stkTypeByCode;
	}

	public void setStkTypeByCode(String stkTypeByCode) {
		this.stkTypeByCode = stkTypeByCode;
	}

	public String getCheckISFirstStockData() {
		return checkISFirstStockData;
	}

	public void setCheckISFirstStockData(String checkISFirstStockData) {
		this.checkISFirstStockData = checkISFirstStockData;
	}

	public double getStkCapital() {
		return stkCapital;
	}

	public void setStkCapital(double stkCapital) {
		this.stkCapital = stkCapital;
	}

	public double getStkIssueShare() {
		return stkIssueShare;
	}

	public void setStkIssueShare(double stkIssueShare) {
		this.stkIssueShare = stkIssueShare;
	}

	public double getAvgVolume10() {
		return avgVolume10;
	}

	public void setAvgVolume10(double avgVolume10) {
		this.avgVolume10 = avgVolume10;
	}

	public Boolean getStockPoolData() {
		return stockPoolData;
	}

	public void setStockPoolData(Boolean stockPoolData) {
		this.stockPoolData = stockPoolData;
	}

	public double getmNowValue() {
		return mNowValue;
	}

	public void setmNowValue(double mNowValue) {
		this.mNowValue = mNowValue;
	}

	public Date getPreatradeDate() {
		return preatradeDate;
	}

	public void setPreatradeDate(Date preatradeDate) {
		this.preatradeDate = preatradeDate;
	}

	public String getPrefFixType() {
		return prefFixType;
	}

	public void setPrefFixType(String prefFixType) {
		this.prefFixType = prefFixType;
	}

	public String getIndustryNew() {
		return industryNew;
	}

	public void setIndustryNew(String industryNew) {
		this.industryNew = industryNew;
	}

	public double getTotalIssueAmt() {
		return totalIssueAmt;
	}

	public void setTotalIssueAmt(double totalIssueAmt) {
		this.totalIssueAmt = totalIssueAmt;
	}

	public String getEtfStakeHolders() {
		return etfStakeHolders;
	}

	public void setEtfStakeHolders(String etfStakeHolders) {
		this.etfStakeHolders = etfStakeHolders;
	}

	public boolean isCheckLeveragedETF() {
		return checkLeveragedETF;
	}

	public void setCheckLeveragedETF(boolean checkLeveragedETF) {
		this.checkLeveragedETF = checkLeveragedETF;
	}

}
