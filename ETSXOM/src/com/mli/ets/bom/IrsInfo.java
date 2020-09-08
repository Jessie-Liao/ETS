package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class IrsInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	public IrsInfo() throws ParseException {
	}

	private double irsAmt = -999999;// 本次的利率交換金額
	private List<StoreA> decIRSAmt = new ArrayList<StoreA>(); // 各部門利率交換投資總額

	public double getIrsAmt() {
		return irsAmt;
	}

	public void setIrsAmt(double irsAmt) {
		this.irsAmt = irsAmt;
	}

	public List<StoreA> getDecIRSAmt() {
		return decIRSAmt;
	}

	public void setDecIRSAmt(List<StoreA> decIRSAmt) {
		this.decIRSAmt = decIRSAmt;
	}

	// 計算各部門利率交換投資總額
	public double sum_decIRSAmt(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getDecIRSAmt();
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
