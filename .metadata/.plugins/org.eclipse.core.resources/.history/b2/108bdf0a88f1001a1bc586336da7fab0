package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;
import java.util.List;
import java.util.ArrayList;

public class BondStoreOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	public BondStoreOrder() throws ParseException {
	}

	private List<StoreA> abroadBondStore_SameRating = new ArrayList<StoreA>(); // 單一發行或保證者國外債券投資總額(同一違約等級)
	private List<StoreA> abroadBondStore_Issuer = new ArrayList<StoreA>(); //20200527原單一發行或保證者國外債券投資總額(含發行人)**改單一資產證券化商品投資總額**
	private List<StoreA> abroadBondStore_China = new ArrayList<StoreA>(); // 單一發行或保證者國外債券投資總額(大陸地區)
	private List<StoreA> abroadBondStore_BBBIssuer = new ArrayList<StoreA>(); // 單一發行或保證者國外債券投資總額(BBB等級以下含發行人)
	private List<StoreA> abroadBondStore_ChinaIssuer = new ArrayList<StoreA>(); // 單一發行或保證者國外債券投資總額(大陸地區含發行人)
	private List<StoreA> abroadBondStore_DomesticIssuer = new ArrayList<StoreA>(); // 單一發行或保證者國外債券投資總額(本國企業發行含發行人)
	private List<StoreA> cbfbStore = new ArrayList<StoreA>(); // 公司債金融債投資總額
	private List<StoreA> cbfbStore_Issuer = new ArrayList<StoreA>(); // 單一發行者公司債金融債投資總額
	private List<StoreA> abroadCBFBStore_Domestic = new ArrayList<StoreA>(); // 海外公司債金融債投資總額(本國發行)
	private List<StoreA> abroadCBFBStore_Foreign = new ArrayList<StoreA>(); // 海外公司債金融債投資總額(國外發行)
	private List<StoreA> abroadCBFBStore_ProductID = new ArrayList<StoreA>(); // 海外公司債金融債投資總額(國外發行特定標的)
	private List<StoreA> industryBondStore_Domestic = new ArrayList<StoreA>(); // 國內債券產業別投資總額
	private List<StoreA> industryBondStore_Foreign = new ArrayList<StoreA>(); // 國外債券產業別投資總額
	private List<StoreA> decBondAmt_Domestic = new ArrayList<StoreA>(); // 各部門國內債券投資總額
	private List<StoreA> decBondAmt_Foreign = new ArrayList<StoreA>(); // 各部門國外債券投資總額
	private List<StoreA> domIPOBondAmt_Undeliv = new ArrayList<StoreA>();// 國內未交割IPO債券產業別總值
	private List<StoreA> abroadIPOBondAmt_Undeliv = new ArrayList<StoreA>();// 國外未交割IPO債券產業別總值
	private List<StoreA> domBondAmt_deliv = new ArrayList<StoreA>();// 國內待交割債券金額
	private List<StoreA> abroadBondAmt_deliv = new ArrayList<StoreA>();// 國外待交割債券金額
	private List<StoreA> domSingleBondAmt_deliv = new ArrayList<StoreA>();// 國內單一待交割債券金額
	private List<StoreA> abroadSingleBondAmt_deliv = new ArrayList<StoreA>();// 國外單一待交割債券金額
	private List<StoreA> abroadBondStore_BBBPlus = new ArrayList<StoreA>();// 單一發行或保證者國外債券投資總額(BBB+以下)
	private List<StoreA> abroadBondStore_BBPlus = new ArrayList<StoreA>();// 單一發行或保證者國外債券投資總額(BB+以下)
	private List<StoreA> domBondStore = new ArrayList<StoreA>();// 國內債券投資總額=>06/12Jessie新增，因整合cbfbstore變數而新增
	private List<StoreA> domBondStore_Issuer = new ArrayList<StoreA>();// 單一發行或保證者國內債券投資總額(含發行人)
	private double absmbsTotalAmt = -999999; // ABS/MBS投資總額
	private double absmbsReadyTotalAmt = -999999; // ABS/MBS已發行總額
	private double internationBondTotalAmt = -999999; // 國際債總值
	private double domCompanyBondTotalAmt = -999999; // 國內公司債投資總額
	private double domSingleCompanyBondTotalAmt = -999999; // 國內單一公司債投資總額
	private double domSingleCompanyBondTotalAmt_Issuer = -999999; // 國內單一公司債投資總額(以發行人抓取同一公司發行)
	private double domSingleCompanyBondTotalAmt_IssuerWithCB = -999999; // 國內單一公司債投資總額(以發行人抓取同一公司發行含可轉債)
	private double domSingleBondTotalAmt = -999999; // 單一國內債券投資總額
	private double abroadCommercialPaper_Issuer = -999999;// 同一發行者外幣計價商業本票投資總額
	private double abroadPayStockCBTotalAmt = -999999;// 非本國企業發行附認股權公司債投資總額
	private double abroadCommercialPaper_ChinaIssuer = -999999;// 同一發行者外幣計價商業本票投資總額(大陸地區)
	private double abroadCBBond_Issuer = -999999;// 同一發行者非本國企業發行或保證之可轉換公司債投資總額
	private double domCBDefaultLevelOver6TotalAmt = -999999;// 國內可轉債違約等級超過6的投資總額
	private double domBondDefaultLevelOver6TotalAmt = -999999;// 國內債券違約等級超過6的投資總額
	private double abroadBondDefaultLevelOver6TotalAmt = -999999;// 國外債券違約等級超過6的投資總額
	private double abroadGovBondTotalAmt = -999999; // 國外公債投資總額
	private double abroadThreeRoomMBSTotalAmt = -999999; // 國外三房MBS投資總額
	private double subordinatedDebtTotalAmt = -999999; // 次順位債投資總額
	private double foreignBondInvTotalAmt = -999999; // 國外債券投資總額
	private double domesticLocalGovBondTotalAmt = -999999; // 國內地方政府債券投資總額
	private double foreignLocalGovBondTotalAmt = -999999; // 國外地方政府債券投資總額
	private double abroadStructuralDebtTotalAmt = -999999; // 國外結構債投資總額
	private double domesticCombinedDepositTotalAmt = -999999; // 國內組合型存款投資總額
	private double issuerDomesticPortfolioDeposit = -999999; // 發行人國內組合型存款投資總額
	private double issuerForeignPortfolioDeposit = -999999; // 發行人國外組合型存款投資總額
	private double abroadFNMA_FHLMCTotalAmt = -999999; // 國外FNMA、FHLMC債券投資總額

	private List<StoreB> ratingAmt = new ArrayList<StoreB>(); // 所有發行評等投資總額
	private List<StoreB> singleRatingAmt = new ArrayList<StoreB>(); // 單一發行評等投資總額 
	public List<StoreA> getDomBondStore() {
		return domBondStore;
	}

	public void setDomBondStore(List<StoreA> domBondStore) {
		this.domBondStore = domBondStore;
	}
	public List<StoreA> getDomBondStore_Issuer() {
		return domBondStore_Issuer;
	}

	public void setDomBondStore_Issuer(List<StoreA> domBondStore_Issuer) {
		this.domBondStore_Issuer = domBondStore_Issuer;
	}

	public List<StoreA> getAbroadBondStore_SameRating() {
		return abroadBondStore_SameRating;
	}

	public void setAbroadBondStore_SameRating(
			List<StoreA> abroadBondStore_SameRating) {
		this.abroadBondStore_SameRating = abroadBondStore_SameRating;
	}

	public List<StoreA> getAbroadBondStore_Issuer() {
		return abroadBondStore_Issuer;
	}

	public void setAbroadBondStore_Issuer(List<StoreA> abroadBondStore_Issuer) {
		this.abroadBondStore_Issuer = abroadBondStore_Issuer;
	}

	public List<StoreA> getAbroadBondStore_China() {
		return abroadBondStore_China;
	}

	public void setAbroadBondStore_China(List<StoreA> abroadBondStore_China) {
		this.abroadBondStore_China = abroadBondStore_China;
	}

	public List<StoreA> getAbroadBondStore_BBBIssuer() {
		return abroadBondStore_BBBIssuer;
	}

	public void setAbroadBondStore_BBBIssuer(
			List<StoreA> abroadBondStore_BBBIssuer) {
		this.abroadBondStore_BBBIssuer = abroadBondStore_BBBIssuer;
	}

	public List<StoreA> getAbroadBondStore_ChinaIssuer() {
		return abroadBondStore_ChinaIssuer;
	}

	public void setAbroadBondStore_ChinaIssuer(
			List<StoreA> abroadBondStore_ChinaIssuer) {
		this.abroadBondStore_ChinaIssuer = abroadBondStore_ChinaIssuer;
	}

	public List<StoreA> getAbroadBondStore_DomesticIssuer() {
		return abroadBondStore_DomesticIssuer;
	}

	public void setAbroadBondStore_DomesticIssuer(
			List<StoreA> abroadBondStore_DomesticIssuer) {
		this.abroadBondStore_DomesticIssuer = abroadBondStore_DomesticIssuer;
	}

	public List<StoreA> getCbfbStore() {
		return cbfbStore;
	}

	public void setCbfbStore(List<StoreA> cbfbStore) {
		this.cbfbStore = cbfbStore;
	}

	public List<StoreA> getCbfbStore_Issuer() {
		return cbfbStore_Issuer;
	}

	public void setCbfbStore_Issuer(List<StoreA> cbfbStore_Issuer) {
		this.cbfbStore_Issuer = cbfbStore_Issuer;
	}

	public List<StoreA> getAbroadCBFBStore_Domestic() {
		return abroadCBFBStore_Domestic;
	}

	public void setAbroadCBFBStore_Domestic(
			List<StoreA> abroadCBFBStore_Domestic) {
		this.abroadCBFBStore_Domestic = abroadCBFBStore_Domestic;
	}

	public List<StoreA> getAbroadCBFBStore_Foreign() {
		return abroadCBFBStore_Foreign;
	}

	public void setAbroadCBFBStore_Foreign(List<StoreA> abroadCBFBStore_Foreign) {
		this.abroadCBFBStore_Foreign = abroadCBFBStore_Foreign;
	}

	public List<StoreA> getAbroadCBFBStore_ProductID() {
		return abroadCBFBStore_ProductID;
	}

	public void setAbroadCBFBStore_ProductID(
			List<StoreA> abroadCBFBStore_ProductID) {
		this.abroadCBFBStore_ProductID = abroadCBFBStore_ProductID;
	}

	public List<StoreA> getIndustryBondStore_Domestic() {
		return industryBondStore_Domestic;
	}

	public void setIndustryBondStore_Domestic(
			List<StoreA> industryBondStore_Domestic) {
		this.industryBondStore_Domestic = industryBondStore_Domestic;
	}

	public List<StoreA> getIndustryBondStore_Foreign() {
		return industryBondStore_Foreign;
	}

	public void setIndustryBondStore_Foreign(
			List<StoreA> industryBondStore_Foreign) {
		this.industryBondStore_Foreign = industryBondStore_Foreign;
	}

	public List<StoreA> getDecBondAmt_Domestic() {
		return decBondAmt_Domestic;
	}

	public void setDecBondAmt_Domestic(List<StoreA> decBondAmt_Domestic) {
		this.decBondAmt_Domestic = decBondAmt_Domestic;
	}

	public List<StoreA> getDecBondAmt_Foreign() {
		return decBondAmt_Foreign;
	}

	public void setDecBondAmt_Foreign(List<StoreA> decBondAmt_Foreign) {
		this.decBondAmt_Foreign = decBondAmt_Foreign;
	}

	public double getAbroadGovBondTotalAmt() {
		return abroadGovBondTotalAmt;
	}

	public void setAbroadGovBondTotalAmt(double abroadGovBondTotalAmt) {
		this.abroadGovBondTotalAmt = abroadGovBondTotalAmt;
	}

	public double getAbroadThreeRoomMBSTotalAmt() {
		return abroadThreeRoomMBSTotalAmt;
	}

	public void setAbroadThreeRoomMBSTotalAmt(double abroadThreeRoomMBSTotalAmt) {
		this.abroadThreeRoomMBSTotalAmt = abroadThreeRoomMBSTotalAmt;
	}

	public double getSubordinatedDebtTotalAmt() {
		return subordinatedDebtTotalAmt;
	}

	public void setSubordinatedDebtTotalAmt(double subordinatedDebtTotalAmt) {
		this.subordinatedDebtTotalAmt = subordinatedDebtTotalAmt;
	}

	public double getForeignBondInvTotalAmt() {
		return foreignBondInvTotalAmt;
	}

	public void setForeignBondInvTotalAmt(double foreignBondInvTotalAmt) {
		this.foreignBondInvTotalAmt = foreignBondInvTotalAmt;
	}

	public double getDomesticLocalGovBondTotalAmt() {
		return domesticLocalGovBondTotalAmt;
	}

	public void setDomesticLocalGovBondTotalAmt(
			double domesticLocalGovBondTotalAmt) {
		this.domesticLocalGovBondTotalAmt = domesticLocalGovBondTotalAmt;
	}

	public double getForeignLocalGovBondTotalAmt() {
		return foreignLocalGovBondTotalAmt;
	}

	public void setForeignLocalGovBondTotalAmt(
			double foreignLocalGovBondTotalAmt) {
		this.foreignLocalGovBondTotalAmt = foreignLocalGovBondTotalAmt;
	}

	public double getAbroadStructuralDebtTotalAmt() {
		return abroadStructuralDebtTotalAmt;
	}

	public void setAbroadStructuralDebtTotalAmt(
			double abroadStructuralDebtTotalAmt) {
		this.abroadStructuralDebtTotalAmt = abroadStructuralDebtTotalAmt;
	}

	public double getDomesticCombinedDepositTotalAmt() {
		return domesticCombinedDepositTotalAmt;
	}

	public void setDomesticCombinedDepositTotalAmt(
			double domesticCombinedDepositTotalAmt) {
		this.domesticCombinedDepositTotalAmt = domesticCombinedDepositTotalAmt;
	}

	public double getIssuerDomesticPortfolioDeposit() {
		return issuerDomesticPortfolioDeposit;
	}

	public void setIssuerDomesticPortfolioDeposit(
			double issuerDomesticPortfolioDeposit) {
		this.issuerDomesticPortfolioDeposit = issuerDomesticPortfolioDeposit;
	}

	public double getIssuerForeignPortfolioDeposit() {
		return issuerForeignPortfolioDeposit;
	}

	public void setIssuerForeignPortfolioDeposit(
			double issuerForeignPortfolioDeposit) {
		this.issuerForeignPortfolioDeposit = issuerForeignPortfolioDeposit;
	}

	public double getAbroadFNMA_FHLMCTotalAmt() {
		return abroadFNMA_FHLMCTotalAmt;
	}

	public void setAbroadFNMA_FHLMCTotalAmt(double abroadFNMA_FHLMCTotalAmt) {
		this.abroadFNMA_FHLMCTotalAmt = abroadFNMA_FHLMCTotalAmt;
	}

	public List<StoreA> getDomIPOBondAmt_Undeliv() {
		return domIPOBondAmt_Undeliv;
	}

	public void setDomIPOBondAmt_Undeliv(List<StoreA> domIPOBondAmt_Undeliv) {
		this.domIPOBondAmt_Undeliv = domIPOBondAmt_Undeliv;
	}

	public List<StoreA> getAbroadIPOBondAmt_Undeliv() {
		return abroadIPOBondAmt_Undeliv;
	}

	public void setAbroadIPOBondAmt_Undeliv(
			List<StoreA> abroadIPOBondAmt_Undeliv) {
		this.abroadIPOBondAmt_Undeliv = abroadIPOBondAmt_Undeliv;
	}

	public List<StoreA> getDomBondAmt_deliv() {
		return domBondAmt_deliv;
	}

	public void setDomBondAmt_deliv(List<StoreA> domBondAmt_deliv) {
		this.domBondAmt_deliv = domBondAmt_deliv;
	}

	public List<StoreA> getAbroadBondAmt_deliv() {
		return abroadBondAmt_deliv;
	}

	public void setAbroadBondAmt_deliv(List<StoreA> abroadBondAmt_deliv) {
		this.abroadBondAmt_deliv = abroadBondAmt_deliv;
	}

	public List<StoreA> getDomSingleBondAmt_deliv() {
		return domSingleBondAmt_deliv;
	}

	public void setDomSingleBondAmt_deliv(List<StoreA> domSingleBondAmt_deliv) {
		this.domSingleBondAmt_deliv = domSingleBondAmt_deliv;
	}

	public List<StoreA> getAbroadSingleBondAmt_deliv() {
		return abroadSingleBondAmt_deliv;
	}

	public void setAbroadSingleBondAmt_deliv(
			List<StoreA> abroadSingleBondAmt_deliv) {
		this.abroadSingleBondAmt_deliv = abroadSingleBondAmt_deliv;
	}

	public double getAbsmbsTotalAmt() {
		return absmbsTotalAmt;
	}

	public void setAbsmbsTotalAmt(double absmbsTotalAmt) {
		this.absmbsTotalAmt = absmbsTotalAmt;
	}

	public double getAbsmbsReadyTotalAmt() {
		return absmbsReadyTotalAmt;
	}

	public void setAbsmbsReadyTotalAmt(double absmbsReadyTotalAmt) {
		this.absmbsReadyTotalAmt = absmbsReadyTotalAmt;
	}

	public double getInternationBondTotalAmt() {
		return internationBondTotalAmt;
	}

	public void setInternationBondTotalAmt(double internationBondTotalAmt) {
		this.internationBondTotalAmt = internationBondTotalAmt;
	}

	public double getDomCompanyBondTotalAmt() {
		return domCompanyBondTotalAmt;
	}

	public void setDomCompanyBondTotalAmt(double domCompanyBondTotalAmt) {
		this.domCompanyBondTotalAmt = domCompanyBondTotalAmt;
	}

	public double getDomSingleCompanyBondTotalAmt() {
		return domSingleCompanyBondTotalAmt;
	}

	public void setDomSingleCompanyBondTotalAmt(
			double domSingleCompanyBondTotalAmt) {
		this.domSingleCompanyBondTotalAmt = domSingleCompanyBondTotalAmt;
	}

	public double getDomSingleCompanyBondTotalAmt_Issuer() {
		return domSingleCompanyBondTotalAmt_Issuer;
	}

	public void setDomSingleCompanyBondTotalAmt_Issuer(
			double domSingleCompanyBondTotalAmt_Issuer) {
		this.domSingleCompanyBondTotalAmt_Issuer = domSingleCompanyBondTotalAmt_Issuer;
	}

	public double getDomSingleCompanyBondTotalAmt_IssuerWithCB() {
		return domSingleCompanyBondTotalAmt_IssuerWithCB;
	}

	public void setDomSingleCompanyBondTotalAmt_IssuerWithCB(
			double domSingleCompanyBondTotalAmt_IssuerWithCB) {
		this.domSingleCompanyBondTotalAmt_IssuerWithCB = domSingleCompanyBondTotalAmt_IssuerWithCB;
	}

	public double getDomSingleBondTotalAmt() {
		return domSingleBondTotalAmt;
	}

	public void setDomSingleBondTotalAmt(double domSingleBondTotalAmt) {
		this.domSingleBondTotalAmt = domSingleBondTotalAmt;
	}

	public double getAbroadCommercialPaper_Issuer() {
		return abroadCommercialPaper_Issuer;
	}

	public void setAbroadCommercialPaper_Issuer(
			double abroadCommercialPaper_Issuer) {
		this.abroadCommercialPaper_Issuer = abroadCommercialPaper_Issuer;
	}

	public List<StoreA> getAbroadBondStore_BBBPlus() {
		return abroadBondStore_BBBPlus;
	}

	public void setAbroadBondStore_BBBPlus(List<StoreA> abroadBondStore_BBBPlus) {
		this.abroadBondStore_BBBPlus = abroadBondStore_BBBPlus;
	}

	public List<StoreA> getAbroadBondStore_BBPlus() {
		return abroadBondStore_BBPlus;
	}

	public void setAbroadBondStore_BBPlus(List<StoreA> abroadBondStore_BBPlus) {
		this.abroadBondStore_BBPlus = abroadBondStore_BBPlus;
	}

	public double getAbroadPayStockCBTotalAmt() {
		return abroadPayStockCBTotalAmt;
	}

	public void setAbroadPayStockCBTotalAmt(double abroadPayStockCBTotalAmt) {
		this.abroadPayStockCBTotalAmt = abroadPayStockCBTotalAmt;
	}

	public double getAbroadCommercialPaper_ChinaIssuer() {
		return abroadCommercialPaper_ChinaIssuer;
	}

	public void setAbroadCommercialPaper_ChinaIssuer(
			double abroadCommercialPaper_ChinaIssuer) {
		this.abroadCommercialPaper_ChinaIssuer = abroadCommercialPaper_ChinaIssuer;
	}

	public double getAbroadCBBond_Issuer() {
		return abroadCBBond_Issuer;
	}

	public void setAbroadCBBond_Issuer(double abroadCBBond_Issuer) {
		this.abroadCBBond_Issuer = abroadCBBond_Issuer;
	}

	public double getDomCBDefaultLevelOver6TotalAmt() {
		return domCBDefaultLevelOver6TotalAmt;
	}

	public void setDomCBDefaultLevelOver6TotalAmt(
			double domCBDefaultLevelOver6TotalAmt) {
		this.domCBDefaultLevelOver6TotalAmt = domCBDefaultLevelOver6TotalAmt;
	}

	public double getDomBondDefaultLevelOver6TotalAmt() {
		return domBondDefaultLevelOver6TotalAmt;
	}

	public void setDomBondDefaultLevelOver6TotalAmt(
			double domBondDefaultLevelOver6TotalAmt) {
		this.domBondDefaultLevelOver6TotalAmt = domBondDefaultLevelOver6TotalAmt;
	}

	public double getAbroadBondDefaultLevelOver6TotalAmt() {
		return abroadBondDefaultLevelOver6TotalAmt;
	}

	public void setAbroadBondDefaultLevelOver6TotalAmt(
			double abroadBondDefaultLevelOver6TotalAmt) {
		this.abroadBondDefaultLevelOver6TotalAmt = abroadBondDefaultLevelOver6TotalAmt;
	}

	public List<StoreB> getRatingAmt() {
		return ratingAmt;
	}

	public void setRatingAmt(List<StoreB> ratingAmt) {
		this.ratingAmt = ratingAmt;
	}

	public List<StoreB> getSingleRatingAmt() {
		return singleRatingAmt;
	}

	public void setSingleRatingAmt(List<StoreB> singleRatingAmt) {
		this.singleRatingAmt = singleRatingAmt;
	}

	// 計算單一發行或保證者國外債券投資總額(同一違約等級)
	public double sum_abroadBondStore_SameRating(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadBondStore_SameRating();
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

	// 計算單一發行或保證者國外債券投資總額(含發行人)
	public double sum_abroadBondStore_Issuer(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadBondStore_Issuer();
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

	// 單一發行或保證者國外債券投資總額(大陸地區)
	public double sum_abroadBondStore_China(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadBondStore_China();
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

	// 計算單一發行或保證者國外債券投資總額(BBB等級以下含發行人)
	public double sum_abroadBondStore_BBBIssuer(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadBondStore_BBBIssuer();
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

	// 計算單一發行或保證者國外債券投資總額(大陸地區含發行人)
	public double sum_abroadBondStore_ChinaIssuer(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadBondStore_ChinaIssuer();
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

	// 計算單一發行或保證者國外債券投資總額(本國企業發行含發行人)
	public double sum_abroadBondStore_DomesticIssuer(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadBondStore_DomesticIssuer();
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

	// 計算公司債金融債投資總額
	public double sum_cbfbStore(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getCbfbStore();
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

	// 計算單一發行者公司債金融債投資總額
	public double sum_cbfbStore_Issuer(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getCbfbStore_Issuer();
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

	// 計算海外公司債金融債投資總額(本國發行)
	public double sum_abroadCBFBStore_Domestic(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadCBFBStore_Domestic();
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

	// 計算海外公司債金融債投資總額(國外發行)
	public double sum_abroadCBFBStore_Foreign(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadCBFBStore_Foreign();
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

	// 計算海外公司債金融債投資總額(國外發行特定標的)
	public double sum_abroadCBFBStore_ProductID(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadCBFBStore_ProductID();
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

	// 計算國內債券產業別投資總額
	public double sum_industryBondStore_Domestic(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getIndustryBondStore_Domestic();
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

	// 計算國外債券產業別投資總額
	public double sum_industryBondStore_Foreign(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getIndustryBondStore_Foreign();
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

	// 計算各部門國內債券投資總額
	public double sum_decBondAmt_Domestic(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getDecBondAmt_Domestic();
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

	// 計算各部門國外債券投資總額
	public double sum_decBondAmt_Foreign(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getDecBondAmt_Foreign();
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

	// ------------------------------------------------------------------新增
	// 計算國外未交割IPO債券產業別總值總額
	public double sum_abroadIPOBondAmt_Undeliv(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadIPOBondAmt_Undeliv();
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

	// 計算國內待交割債券金額總額
	public double sum_domBondAmt_deliv(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getDomBondAmt_deliv();
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

	// 計算國外待交割債券金額總額
	public double sum_abroadBondAmt_deliv(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadBondAmt_deliv();
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

	// 計算國內單一待交割債券金額總額
	public double sum_domSingleBondAmt_deliv(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getDomSingleBondAmt_deliv();
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

	// 計算國外單一待交割債券金額總額
	public double sum_abroadSingleBondAmt_deliv(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadSingleBondAmt_deliv();
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

	// 計算國內未交割IPO債券產業別總值總額
	public double sum_domIPOBondAmt_Undeliv(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getDomIPOBondAmt_Undeliv();
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

	// 計算單一發行或保證者國外債券投資總額(BBB+以下)
	public double sum_abroadBondStore_BBBPlus(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadBondStore_BBBPlus();
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

	// 計算單一發行或保證者國外債券投資總額(BB+以下)
	public double sum_abroadBondStore_BBPlus(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getAbroadBondStore_BBPlus();
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

	public double sum_domBondStore_Issuer(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getDomBondStore_Issuer();
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
	public double sum_domBondStore(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getDomBondStore();
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
	// -----------------------------------------------------------------------------新增
}
