package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class CheckDataCollection implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheckDataCollection() throws ParseException {
	}

	private List<CheckData> checkData = new ArrayList<CheckData>();		 // 檢核項目

	public List<CheckData> getCheckData() {
		return checkData;
	}

	public void setCheckData(List<CheckData> checkData) {
		this.checkData = checkData;
	}

	// 新增檢核項目
	public void addCheckData(String ruleID, String decription)
			throws ParseException {
		CheckData checkData = new CheckData();
		checkData.setRuleID(ruleID);
		checkData.setDecription(decription);
		List<CheckData> temp;
		if (this.getCheckData() != null) {
			temp = this.getCheckData();
		} else {
			temp = new ArrayList<CheckData>();
		}
		temp.add(checkData);
		this.setCheckData(temp);
	}

}
