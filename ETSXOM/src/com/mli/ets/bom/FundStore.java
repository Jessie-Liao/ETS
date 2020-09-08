package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mli.ets.base.BaseHelper;

public class FundStore implements Serializable {
	private static final long serialVersionUID = 1L;

	public FundStore() throws ParseException {
	}

	private List<StoreA> decFundAmt_Domestic = new ArrayList<StoreA>(); // 各部門國內基金投資總額
	private List<StoreA> decFundAmt_Foreign = new ArrayList<StoreA>(); // 各部門國外基金投資總額
	private List<StoreA> chinaFundTotalAmt = new ArrayList<StoreA>(); // 大陸基金投資總額
	private List<StoreA> chinaFundAmt = new ArrayList<StoreA>(); // 大陸單一基金投資總額  Jessie:2020/06/30  新增List用來記錄單一基金投資總額
	private List<StoreA> fundTotalAmt_Foreign = new ArrayList<StoreA>(); // 國外基金總值
	private List<StoreA> fundTotalAmt_Domestic = new ArrayList<StoreA>(); // 國內基金總值
	private List<StoreA> highRiskStoreAmt = new ArrayList<StoreA>(); //高風險性資產  Jessie:2020/06/30  新增List用來取代高風險性資產變數
	
	private double fundSize = -999999; // 發行總額
	private double fundShare = -999999; //
	private double pNav = -999999; // 單位淨值
	private double fundSingleAmt = -999999; // 國內單一基金的投資總額
	private double fundSingleAmt_Foreign = -999999; // 國外單一基金的投資總額 Jessie:2020/07/10 新增，為計算國外單一基金新增

	private double fundFTSTotalAmt = -999999;// 期信基金投資總額
	private Date fundSizeDate = BaseHelper.getDefaultDate();//
	private double glFundTotalAmt_Product2_TWD = -999999;// 國外基金投資總額(商品代碼2)(台幣)
	private double glFundTotalAmt_Product2_Abroad = -999999;// 國外基金投資總額(商品代碼2)(原幣)
	private double glFundTotalAmt_ChinaProduct1 = -999999;// 國外基金投資總額((商品代碼1含大陸地區))(台幣)
	private double glFundTotalAmt_ChinaProduct2_TWD = -999999;// 國外基金投資總額(商品代碼2含大陸地區)(台幣)
	private double glFundTotalAmt_ChinaProduct2_Abroad = -999999;// 國外基金投資總額(商品代碼2含大陸地區)(原幣)
	private double highRiskAssetFundStore_1 = -999999; // 高風險性資產基金庫存1
	private double highRiskAssetFundStore_2 = -999999; // 高風險性資產基金庫存2
	private double highRiskAssetFundStore_3 = -999999; // 高風險性資產基金庫存3
	private double highRiskAssetFundStore_4 = -999999; // 高風險性資產基金庫存4
	private double fundOrderToday_STK = -999999; // 基金今日已下單金額(普通股)
	private double fundOrderToday_ImmovableProperty = -999999; // 基金今日已下單金額(投資用不動產)
	private double fundOrderToday_Other = -999999; // 基金今日已下單金額(其他)
	
	public double getFundSingleAmt_Foreign() {
		return fundSingleAmt_Foreign;
	}

	public void setFundSingleAmt_Foreign(double fundSingleAmt_Foreign) {
		this.fundSingleAmt_Foreign = fundSingleAmt_Foreign;
	}

	public List<StoreA> getHighRiskStoreAmt() {
		return highRiskStoreAmt;
	}

	public void setHighRiskStoreAmt(List<StoreA> highRiskStoreAmt) {
		this.highRiskStoreAmt = highRiskStoreAmt;
	}

	public List<StoreA> getChinaFundAmt() {
		return chinaFundAmt;
	}

	public void setChinaFundAmt(List<StoreA> chinaFundAmt) {
		this.chinaFundAmt = chinaFundAmt;
	}

	
	public List<StoreA> getDecFundAmt_Domestic() {
		return decFundAmt_Domestic;
	}

	public void setDecFundAmt_Domestic(List<StoreA> decFundAmt_Domestic) {
		this.decFundAmt_Domestic = decFundAmt_Domestic;
	}

	public List<StoreA> getDecFundAmt_Foreign() {
		return decFundAmt_Foreign;
	}

	public void setDecFundAmt_Foreign(List<StoreA> decFundAmt_Foreign) {
		this.decFundAmt_Foreign = decFundAmt_Foreign;
	}

	public double getFundSize() {
		return fundSize;
	}

	public void setFundSize(double fundSize) {
		this.fundSize = fundSize;
	}

	public double getFundShare() {
		return fundShare;
	}

	public void setFundShare(double fundShare) {
		this.fundShare = fundShare;
	}

	public double getpNav() {
		return pNav;
	}

	public void setpNav(double pNav) {
		this.pNav = pNav;
	}

	public double getFundSingleAmt() {
		return fundSingleAmt;
	}

	public void setFundSingleAmt(double fundSingleAmt) {
		this.fundSingleAmt = fundSingleAmt;
	}

	public Date getFundSizeDate() {
		return fundSizeDate;
	}

	public void setFundSizeDate(Date fundSizeDate) {
		this.fundSizeDate = fundSizeDate;
	}

	public double getFundFTSTotalAmt() {
		return fundFTSTotalAmt;
	}

	public void setFundFTSTotalAmt(double fundFTSTotalAmt) {
		this.fundFTSTotalAmt = fundFTSTotalAmt;
	}

	public List<StoreA> getChinaFundTotalAmt() {
		return chinaFundTotalAmt;
	}

	public void setChinaFundTotalAmt(List<StoreA> chinaFundTotalAmt) {
		this.chinaFundTotalAmt = chinaFundTotalAmt;
	}

	public List<StoreA> getFundTotalAmt_Foreign() {
		return fundTotalAmt_Foreign;
	}

	public void setFundTotalAmt_Foreign(List<StoreA> fundTotalAmt_Foreign) {
		this.fundTotalAmt_Foreign = fundTotalAmt_Foreign;
	}

	public List<StoreA> getFundTotalAmt_Domestic() {
		return fundTotalAmt_Domestic;
	}

	public void setFundTotalAmt_Domestic(List<StoreA> fundTotalAmt_Domestic) {
		this.fundTotalAmt_Domestic = fundTotalAmt_Domestic;
	}

	public double getGlFundTotalAmt_Product2_TWD() {
		return glFundTotalAmt_Product2_TWD;
	}

	public void setGlFundTotalAmt_Product2_TWD(
			double glFundTotalAmt_Product2_TWD) {
		this.glFundTotalAmt_Product2_TWD = glFundTotalAmt_Product2_TWD;
	}

	public double getGlFundTotalAmt_Product2_Abroad() {
		return glFundTotalAmt_Product2_Abroad;
	}

	public void setGlFundTotalAmt_Product2_Abroad(
			double glFundTotalAmt_Product2_Abroad) {
		this.glFundTotalAmt_Product2_Abroad = glFundTotalAmt_Product2_Abroad;
	}

	public double getGlFundTotalAmt_ChinaProduct1() {
		return glFundTotalAmt_ChinaProduct1;
	}

	public void setGlFundTotalAmt_ChinaProduct1(
			double glFundTotalAmt_ChinaProduct1) {
		this.glFundTotalAmt_ChinaProduct1 = glFundTotalAmt_ChinaProduct1;
	}

	public double getGlFundTotalAmt_ChinaProduct2_TWD() {
		return glFundTotalAmt_ChinaProduct2_TWD;
	}

	public void setGlFundTotalAmt_ChinaProduct2_TWD(
			double glFundTotalAmt_ChinaProduct2_TWD) {
		this.glFundTotalAmt_ChinaProduct2_TWD = glFundTotalAmt_ChinaProduct2_TWD;
	}

	public double getGlFundTotalAmt_ChinaProduct2_Abroad() {
		return glFundTotalAmt_ChinaProduct2_Abroad;
	}

	public void setGlFundTotalAmt_ChinaProduct2_Abroad(
			double glFundTotalAmt_ChinaProduct2_Abroad) {
		this.glFundTotalAmt_ChinaProduct2_Abroad = glFundTotalAmt_ChinaProduct2_Abroad;
	}

	public double getHighRiskAssetFundStore_1() {
		return highRiskAssetFundStore_1;
	}

	public void setHighRiskAssetFundStore_1(double highRiskAssetFundStore_1) {
		this.highRiskAssetFundStore_1 = highRiskAssetFundStore_1;
	}

	public double getHighRiskAssetFundStore_2() {
		return highRiskAssetFundStore_2;
	}

	public void setHighRiskAssetFundStore_2(double highRiskAssetFundStore_2) {
		this.highRiskAssetFundStore_2 = highRiskAssetFundStore_2;
	}

	public double getHighRiskAssetFundStore_3() {
		return highRiskAssetFundStore_3;
	}

	public void setHighRiskAssetFundStore_3(double highRiskAssetFundStore_3) {
		this.highRiskAssetFundStore_3 = highRiskAssetFundStore_3;
	}

	public double getHighRiskAssetFundStore_4() {
		return highRiskAssetFundStore_4;
	}

	public void setHighRiskAssetFundStore_4(double highRiskAssetFundStore_4) {
		this.highRiskAssetFundStore_4 = highRiskAssetFundStore_4;
	}

	public double getFundOrderToday_STK() {
		return fundOrderToday_STK;
	}

	public void setFundOrderToday_STK(double fundOrderToday_STK) {
		this.fundOrderToday_STK = fundOrderToday_STK;
	}

	public double getFundOrderToday_ImmovableProperty() {
		return fundOrderToday_ImmovableProperty;
	}

	public void setFundOrderToday_ImmovableProperty(
			double fundOrderToday_ImmovableProperty) {
		this.fundOrderToday_ImmovableProperty = fundOrderToday_ImmovableProperty;
	}

	public double getFundOrderToday_Other() {
		return fundOrderToday_Other;
	}

	public void setFundOrderToday_Other(double fundOrderToday_Other) {
		this.fundOrderToday_Other = fundOrderToday_Other;
	}

	// 計算各部門國內基金投資總額
	public double sum_decFundAmt_Domestic(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getDecFundAmt_Domestic();
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

	// 計算各部門國外基金投資總額
	public double sum_decFundAmt_Foreign(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getDecFundAmt_Foreign();
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

	// 計算大陸基金投資總額
	public double sum_chinaFundTotalAmt(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getChinaFundTotalAmt();
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
	// 計算大陸單一基金投資總額
		public double sum_chinaFundAmt(String types) {
			double sum = 0;
			String[] subType = types.replaceAll(" ", "").split(",");
			List<StoreA> tempList = getChinaFundAmt();
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
		// 計算各類型高風險性資產總額
				public double sum_highRiskStoreAmt(String types) {
					double sum = 0;
					String[] subType = types.replaceAll(" ", "").split(",");
					List<StoreA> tempList = getHighRiskStoreAmt();
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

	// 計算國外基金總值
	public double sum_fundTotalAmt_Foreign(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getFundTotalAmt_Foreign();
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

	// 計算國內基金總值
	public double sum_fundTotalAmt_Domestic(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getFundTotalAmt_Domestic();
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

}
