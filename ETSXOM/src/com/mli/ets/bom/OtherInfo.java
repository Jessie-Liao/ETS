package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class OtherInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	public OtherInfo() throws ParseException {
	}

	private double allowedDomFundsAmt = -999999; // 國內保險業資金
	private double allowedForFundsAmt = -999999; // 國外保險業資金
	private double ownerEquityAmt = -999999; // 保險業主權益
	private double allowedForInvAmt = -999999; // 核定國外投資額度
	private double reservesAmt = -999999; // 保單準備金金額
	private double comRBC = -999999; // 資本適足率
	// ==========================================新增
	private String checkRelationShip = "null";// 是否為關係人
	private double immovablePropertyAmt_Invest = -999999;// 投資用不動產資金
	private List<StoreA> abroadAssetCountryIDTotalAmt = new ArrayList<StoreA>(); // 海外資產標的國別總額
	private double countryGDPRate = -999999;// 所屬國家GDP比率
	private String reverseTransactionInfo = "null";// 反向交易資訊
	private boolean checkReverseTransaction = false;// 是否為反向交易
	private double fundSchedulingAmt = -999999;// 資金調度投資總額
	private double foreignExchangeAssetCountryIDTotalAmt = -999999;// 外匯準備金資產標的國別總額
	private String riskCountry = "null"; // 風險國別
	private String checkRegionCountry = "null"; // 是否為區域性國家
	private boolean portfolioChina = false; // 投組是否為大陸地區
	private boolean portfolioInternationalBond = false; // 投組是否為國際債
	private double ownerEty = -999999;// 發行機構股東權益
	private boolean noTrading = false;// 是否為禁止交易國家
	private double bookAmt = -999999;// 待交割金額
	private boolean rule405Pass = false;// Rule405是否通過
	private String rule405Detail = "null";// Rule405詳細訊息

	/*----------------------------------------待處理----------------------------------------*/
	private double curRate = -999999;
	private boolean checkAntiTrade = true;

	// private boolean chkIsMainlandChinaFundQFII = true;

	/*----------------------------------------待處理----------------------------------------*/
	/**/
	private String bbgTicker ="null";//(426、446、447、448需判斷此變數_Jessie_20200421新增)
	private String issueId="null";//(之後可能會用到Jessie_20200421新增)
	public String getIssueId() {
		return issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}

	public String getBbgTicker() {
		return bbgTicker;
	}

	public void setBbgTicker(String bbgTicker) {
		this.bbgTicker = bbgTicker;
	}

	public double getAllowedDomFundsAmt() {
		return allowedDomFundsAmt;
	}

	public void setAllowedDomFundsAmt(double allowedDomFundsAmt) {
		this.allowedDomFundsAmt = allowedDomFundsAmt;
	}

	public double getAllowedForFundsAmt() {
		return allowedForFundsAmt;
	}

	public void setAllowedForFundsAmt(double allowedForFundsAmt) {
		this.allowedForFundsAmt = allowedForFundsAmt;
	}

	public double getOwnerEquityAmt() {
		return ownerEquityAmt;
	}

	public void setOwnerEquityAmt(double ownerEquityAmt) {
		this.ownerEquityAmt = ownerEquityAmt;
	}

	public double getAllowedForInvAmt() {
		return allowedForInvAmt;
	}

	public void setAllowedForInvAmt(double allowedForInvAmt) {
		this.allowedForInvAmt = allowedForInvAmt;
	}

	public double getReservesAmt() {
		return reservesAmt;
	}

	public void setReservesAmt(double reservesAmt) {
		this.reservesAmt = reservesAmt;
	}

	public double getComRBC() {
		return comRBC;
	}

	public void setComRBC(double comRBC) {
		this.comRBC = comRBC;
	}

	/*----------------------------------------待處理----------------------------------------*/

	public boolean isNoTrading() {
		return noTrading;
	}

	public void setNoTrading(boolean noTrading) {
		this.noTrading = noTrading;
	}

	public double getCurRate() {
		return curRate;
	}

	public void setCurRate(double curRate) {
		this.curRate = curRate;
	}

	public boolean isCheckAntiTrade() {
		return checkAntiTrade;
	}

	public void setCheckAntiTrade(boolean checkAntiTrade) {
		this.checkAntiTrade = checkAntiTrade;
	}

	public String getCheckRelationShip() {
		return checkRelationShip;
	}

	public void setCheckRelationShip(String checkRelationShip) {
		this.checkRelationShip = checkRelationShip;
	}

	public double getImmovablePropertyAmt_Invest() {
		return immovablePropertyAmt_Invest;
	}

	public void setImmovablePropertyAmt_Invest(
			double immovablePropertyAmt_Invest) {
		this.immovablePropertyAmt_Invest = immovablePropertyAmt_Invest;
	}

	public List<StoreA> getAbroadAssetCountryIDTotalAmt() {
		return abroadAssetCountryIDTotalAmt;
	}

	public void setAbroadAssetCountryIDTotalAmt(
			List<StoreA> abroadAssetCountryIDTotalAmt) {
		this.abroadAssetCountryIDTotalAmt = abroadAssetCountryIDTotalAmt;
	}

	public double getOwnerEty() {
		return ownerEty;
	}

	public void setOwnerEty(double ownerEty) {
		this.ownerEty = ownerEty;
	}

	/*----------------------------------------待處理----------------------------------------*/
	// 計算海外資產標的國別總額
	public double sum_abroadAssetCountryIDTotalAmt(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadAssetCountryIDTotalAmt();
		if (tempList == null) {
			return 0;
		} else {
			for (StoreA storeA : tempList) {
				for (String a : subType) {
					if (storeA.getType().equals(a)) {
						sum = sum + storeA.getAmount();
					}
				}
			}
			return sum;
		}
	}

	public double getCountryGDPRate() {
		return countryGDPRate;
	}

	public void setCountryGDPRate(double countryGDPRate) {
		this.countryGDPRate = countryGDPRate;
	}

	public String getReverseTransactionInfo() {
		return reverseTransactionInfo;
	}

	public void setReverseTransactionInfo(String reverseTransactionInfo) {
		this.reverseTransactionInfo = reverseTransactionInfo;
	}

	public boolean isCheckReverseTransaction() {
		return checkReverseTransaction;
	}

	public void setCheckReverseTransaction(boolean checkReverseTransaction) {
		this.checkReverseTransaction = checkReverseTransaction;
	}

	public double getFundSchedulingAmt() {
		return fundSchedulingAmt;
	}

	public void setFundSchedulingAmt(double fundSchedulingAmt) {
		this.fundSchedulingAmt = fundSchedulingAmt;
	}

	public double getForeignExchangeAssetCountryIDTotalAmt() {
		return foreignExchangeAssetCountryIDTotalAmt;
	}

	public void setForeignExchangeAssetCountryIDTotalAmt(
			double foreignExchangeAssetCountryIDTotalAmt) {
		this.foreignExchangeAssetCountryIDTotalAmt = foreignExchangeAssetCountryIDTotalAmt;
	}

	public String getRiskCountry() {
		return riskCountry;
	}

	public void setRiskCountry(String riskCountry) {
		this.riskCountry = riskCountry;
	}

	public String getCheckRegionCountry() {
		return checkRegionCountry;
	}

	public void setCheckRegionCountry(String checkRegionCountry) {
		this.checkRegionCountry = checkRegionCountry;
	}

	public boolean isPortfolioChina() {
		return portfolioChina;
	}

	public void setPortfolioChina(boolean portfolioChina) {
		this.portfolioChina = portfolioChina;
	}

	public boolean isPortfolioInternationalBond() {
		return portfolioInternationalBond;
	}

	public void setPortfolioInternationalBond(boolean portfolioInternationalBond) {
		this.portfolioInternationalBond = portfolioInternationalBond;
	}

	public double getBookAmt() {
		return bookAmt;
	}

	public void setBookAmt(double bookAmt) {
		this.bookAmt = bookAmt;
	}

	public boolean isRule405Pass() {
		return rule405Pass;
	}

	public void setRule405Pass(boolean rule405Pass) {
		this.rule405Pass = rule405Pass;
	}

	public String getRule405Detail() {
		return rule405Detail;
	}

	public void setRule405Detail(String rule405Detail) {
		this.rule405Detail = rule405Detail;
	}

}
