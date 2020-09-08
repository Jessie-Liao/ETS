package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class OptionStore implements Serializable {
	private static final long serialVersionUID = 1L;

	public OptionStore() throws ParseException {
	}

	private List<StoreA> decFTSAmt = new ArrayList<StoreA>(); // 各部門期權投資總額

	public List<StoreA> getDecFTSAmt() {
		return decFTSAmt;
	}

	public void setDecFTSAmt(List<StoreA> decFTSAmt) {
		this.decFTSAmt = decFTSAmt;
	}

	// 計算各部門期權投資總額
	public double sum_decFTSAmt(String types) {
		double sum = 0;
		String[] subType = types.replaceAll(" ", "").split(",");
		List<StoreA> tempList = getDecFTSAmt();
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
