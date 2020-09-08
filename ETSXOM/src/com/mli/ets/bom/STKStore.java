package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class STKStore implements Serializable {
	private static final long serialVersionUID = 1L;

	public STKStore() throws ParseException {
	}

	private List<AmtList> stkAmt = new ArrayList<AmtList>();//股票總額
	private List<AmtList> glstkAmt = new ArrayList<AmtList>();
	private List<AmtList> stkStoreAmt = new ArrayList<AmtList>();//單一發行的總額
	private List<AmtList> stkStoreShare = new ArrayList<AmtList>();//單一發行的股數
	private List<AmtList> glstkStoreAmt = new ArrayList<AmtList>();
	private List<AmtList> glstkStoreShare = new ArrayList<AmtList>();
	private List<AmtList> glstkAmt_China = new ArrayList<AmtList>();
	private List<AmtList> glstkStoreAmt_China = new ArrayList<AmtList>();
	private List<AmtList> glstkAmt_Domestic = new ArrayList<AmtList>();
	private double storeAmtByProductCode = -999;

	/*----------------------------------------待處理----------------------------------------*/
	private double prefStoreAmt = -999999; // 台壽甲CB特別股投資總額
	private double reitsAmt = -999999; // REITS投資總額
	private double totalIssueAmt = -999999; // REITS已發行總額
	private double convertableBondStoreAmt = -999999; // 國內可轉債資產總額
	/*----------------------------------------待處理----------------------------------------*/

	private double storeStkAmt_B = -999999;

	public double getPrefStoreAmt() {
		return prefStoreAmt;
	}

	public void setPrefStoreAmt(double prefStoreAmt) {
		this.prefStoreAmt = prefStoreAmt;
	}

	public double getReitsAmt() {
		return reitsAmt;
	}

	public void setReitsAmt(double reitsAmt) {
		this.reitsAmt = reitsAmt;
	}

	public double getTotalIssueAmt() {
		return totalIssueAmt;
	}

	public void setTotalIssueAmt(double totalIssueAmt) {
		this.totalIssueAmt = totalIssueAmt;
	}

	public double getConvertableBondStoreAmt() {
		return convertableBondStoreAmt;
	}

	public void setConvertableBondStoreAmt(double convertableBondStoreAmt) {
		this.convertableBondStoreAmt = convertableBondStoreAmt;
	}

	public List<AmtList> getGlstkAmt_Domestic() {
		return glstkAmt_Domestic;
	}

	public void setGlstkAmt_Domestic(List<AmtList> glstkAmt_Domestic) {
		this.glstkAmt_Domestic = glstkAmt_Domestic;
	}

	/*----------------------------------------待處理----------------------------------------*/
	private double storeStkAmt_C = -999999;
	private double storeStkAmt_D = -999999;

	public double getStoreStkAmt_B() {
		return storeStkAmt_B;
	}

	public void setStoreStkAmt_B(double storeStkAmt_B) {
		this.storeStkAmt_B = storeStkAmt_B;
	}

	public double getStoreStkAmt_C() {
		return storeStkAmt_C;
	}

	public void setStoreStkAmt_C(double storeStkAmt_C) {
		this.storeStkAmt_C = storeStkAmt_C;
	}

	public double getStoreStkAmt_D() {
		return storeStkAmt_D;
	}

	public void setStoreStkAmt_D(double storeStkAmt_D) {
		this.storeStkAmt_D = storeStkAmt_D;
	}

	public List<AmtList> getGlstkStoreShare() {
		return glstkStoreShare;
	}

	public void setGlstkStoreShare(List<AmtList> glstkStoreShare) {
		this.glstkStoreShare = glstkStoreShare;
	}

	public List<AmtList> getStkAmt() {
		return stkAmt;
	}

	public List<AmtList> getGlstkAmt() {
		return glstkAmt;
	}

	public void setGlstkAmt(List<AmtList> glstkAmt) {
		this.glstkAmt = glstkAmt;
	}

	public void setStkAmt(List<AmtList> stkAmt) {
		this.stkAmt = stkAmt;
	}

	public List<AmtList> getStkStoreAmt() {
		return stkStoreAmt;
	}

	public void setStkStoreAmt(List<AmtList> stkStoreAmt) {
		this.stkStoreAmt = stkStoreAmt;
	}

	public List<AmtList> getStkStoreShare() {
		return stkStoreShare;
	}

	public void setStkStoreShare(List<AmtList> stkStoreShare) {
		this.stkStoreShare = stkStoreShare;
	}

	public List<AmtList> getGlstkStoreAmt() {
		return glstkStoreAmt;
	}

	public void setGlstkStoreAmt(List<AmtList> glstkStoreAmt) {
		this.glstkStoreAmt = glstkStoreAmt;
	}

	public double getStoreAmtByProductCode() {
		return storeAmtByProductCode;
	}

	public void setStoreAmtByProductCode(double storeAmtByProductCode) {
		this.storeAmtByProductCode = storeAmtByProductCode;
	}

	public List<AmtList> getGlstkAmt_China() {
		return glstkAmt_China;
	}

	public void setGlstkAmt_China(List<AmtList> glstkAmt_China) {
		this.glstkAmt_China = glstkAmt_China;
	}

	public List<AmtList> getGlstkStoreAmt_China() {
		return glstkStoreAmt_China;
	}

	public void setGlstkStoreAmt_China(List<AmtList> glstkStoreAmt_China) {
		this.glstkStoreAmt_China = glstkStoreAmt_China;
	}

	public double sumTypeAmount(String n, String types) {
		double sum = 0;
		String[] subType = types.split(",");
		List<AmtList> tempList = new ArrayList<AmtList>();
		switch (n) {
		case "Stk":
			tempList = getStkAmt();
			break;
		case "GlStk":
			tempList = getGlstkAmt();
			break;
		case "StkStore":
			tempList = getStkStoreAmt();
			break;
		case "StkStoreShare":
			tempList = getStkStoreShare();
			break;
		case "GlStkStore":
			tempList = getGlstkStoreAmt();
			break;
		case "GlStkStoreShare":
			tempList = getGlstkStoreShare();
			break;
		case "GlStkChina":
			tempList = getGlstkAmt_China();
			break;
		case "GlStkStoreChina":
			tempList = getGlstkStoreAmt_China();
			break;
		case "GlStkDomestic":
			tempList = getGlstkAmt_Domestic();
		default:
			break;
		}

		if (tempList == null) {
			return 0;
		} else {
			for (AmtList amtList : tempList) {
				for (String a : subType) {
					if (amtList.getStkType().equals(a)) {
						sum = sum + amtList.getAmount();
					}
				}
			}
			return sum;
		}
	}

}
