package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;

public class BondInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	public BondInfo() throws ParseException {
	}

	private BondStoreOrder bondStoreOrder = new BondStoreOrder(); // 債劵投資總額

	private double bondDecAmt = -999999; // 本次決策金額
	private String bondType = "null"; // 編碼類別
	private String bondInvestmentIndustry = "null"; // 投資政策產業別
	private String bondOrder = "null"; // 順位
	private boolean inBBList = false; // 是否於購買發行人或保證人清單
	private boolean canInvestIssuer = false; // 是否有在公會可投資發行人清單
	private String bondTypeSub = "null"; // 是否為結構債
	private boolean limitMBS = false; // 是否為三房MBS
	private boolean inOECD = false; // 所屬國家是否屬OECD
	private boolean specOrganization = false; // 是否為9家特定機構所發行
	private boolean fnma_fhlmc = false; // 是否為FNMA、FHLMC

	// =====================新增
	private String bondMainCatergory = "null"; // 債券主類別
	private String bondSubCatergory = "null"; //債券子類別

	// ===================

	public BondStoreOrder getBondStoreOrder() {
		return bondStoreOrder;
	}

	public void setBondStoreOrder(BondStoreOrder bondStoreOrder) {
		this.bondStoreOrder = bondStoreOrder;
	}

	public double getBondDecAmt() {
		return bondDecAmt;
	}

	public void setBondDecAmt(double bondDecAmt) {
		this.bondDecAmt = bondDecAmt;
	}

	public String getBondType() {
		return bondType;
	}

	public void setBondType(String bondType) {
		this.bondType = bondType;
	}

	public String getBondInvestmentIndustry() {
		return bondInvestmentIndustry;
	}

	public void setBondInvestmentIndustry(String bondInvestmentIndustry) {
		this.bondInvestmentIndustry = bondInvestmentIndustry;
	}

	public String getBondOrder() {
		return bondOrder;
	}

	public void setBondOrder(String bondOrder) {
		this.bondOrder = bondOrder;
	}

	public boolean isInBBList() {
		return inBBList;
	}

	public void setInBBList(boolean inBBList) {
		this.inBBList = inBBList;
	}

	public boolean isCanInvestIssuer() {
		return canInvestIssuer;
	}

	public void setCanInvestIssuer(boolean canInvestIssuer) {
		this.canInvestIssuer = canInvestIssuer;
	}

	public String getBondTypeSub() {
		return bondTypeSub;
	}

	public void setBondTypeSub(String bondTypeSub) {
		this.bondTypeSub = bondTypeSub;
	}

	public boolean isLimitMBS() {
		return limitMBS;
	}

	public void setLimitMBS(boolean limitMBS) {
		this.limitMBS = limitMBS;
	}

	public boolean isInOECD() {
		return inOECD;
	}

	public void setInOECD(boolean inOECD) {
		this.inOECD = inOECD;
	}

	public boolean isSpecOrganization() {
		return specOrganization;
	}

	public void setSpecOrganization(boolean specOrganization) {
		this.specOrganization = specOrganization;
	}

	public boolean isFnma_fhlmc() {
		return fnma_fhlmc;
	}

	public void setFnma_fhlmc(boolean fnma_fhlmc) {
		this.fnma_fhlmc = fnma_fhlmc;
	}

	public String getBondMainCatergory() {
		return bondMainCatergory;
	}

	public void setBondMainCatergory(String bondMainCatergory) {
		this.bondMainCatergory = bondMainCatergory;
	}

	public String getBondSubCatergory() {
		return bondSubCatergory;
	}

	public void setBondSubCatergory(String bondSubCatergory) {
		this.bondSubCatergory = bondSubCatergory;
	}
	
}
