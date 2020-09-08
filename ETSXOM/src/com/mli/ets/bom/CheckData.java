package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;

public class CheckData implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheckData() throws ParseException {
	}

	private boolean needToCheck = true; // 是否需要檢核
	private boolean pass = true; // 是否通過
	private boolean needToReview = false; // 是否需要覆核
	private String ruleID = "null"; // RuleID
	private String decription = "null"; // 簡述
	private String detail = "null"; // 詳細資訊
	private String notice = "null"; // 90%預警
	private boolean noticeCheck = false; // 90%預警是否通過
	private int apprUser = 0; // 審核層級

	/*----------------------------------------待處理----------------------------------------*/
	private int fMgtReview = 0;
	private String fMgtLevel = "";

	/*----------------------------------------待處理----------------------------------------*/

	public boolean isNeedToCheck() {
		return needToCheck;
	}

	public void setNeedToCheck(boolean needToCheck) {
		this.needToCheck = needToCheck;
	}

	public boolean isPass() {
		return pass;
	}

	public void setPass(boolean pass) {
		this.pass = pass;
	}

	public boolean isNeedToReview() {
		return needToReview;
	}

	public void setNeedToReview(boolean needToReview) {
		this.needToReview = needToReview;
	}

	public String getRuleID() {
		return ruleID;
	}

	public void setRuleID(String ruleID) {
		this.ruleID = ruleID;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public int getApprUser() {
		return apprUser;
	}

	public void setApprUser(int apprUser) {
		this.apprUser = apprUser;
	}

	// 新增詳細資訊
	public void addDetail(String content) {
		String temp;
		if (this.getDetail().equals("null")) {
			temp = content;
		} else {
			temp = this.getDetail();
			temp = temp + "Chr(13)" + content;
		}
		this.setDetail(temp);
	}
	

	public boolean isNoticeCheck() {
		return noticeCheck;
	}

	public void setNoticeCheck(boolean noticeCheck) {
		this.noticeCheck = noticeCheck;
	}

	/*----------------------------------------待處理----------------------------------------*/
	public int getfMgtReview() {
		return fMgtReview;
	}

	public void setfMgtReview(int fMgtReview) {
		this.fMgtReview = fMgtReview;
	}

	public String getfMgtLevel() {
		return fMgtLevel;
	}

	public void setfMgtLevel(String fMgtLevel) {
		this.fMgtLevel = fMgtLevel;
	}

	public void noCheckDetail(String reason, String result) {
		String temp;
		if (this.getDetail().equals("null")) {
			temp = "本規則不檢查 Chr(13) 原因:" + reason + ",本商品為" + result;
		} else {
			temp = this.getDetail();
			temp = temp + "Chr(13) 原因" + reason + ",本商品為" + result;
		}
		this.setDetail(temp);
	}

	public void addDetails(String content) {
		String temp;
		if (this.getDetail().equals("null")) {
			temp = content;
		} else {
			temp = this.getDetail();
			temp = temp + "Chr(13)" + content;
		}
		this.setDetail(temp);
	}

	public void addDescription(String content) {
		String temp;
		if (this.getDecription().equals("null")) {
			temp = content;
		} else {
			temp = this.getDecription();
			temp = temp + "Chr(13)" + content;
		}
		this.setDecription(temp);
	}
	/*----------------------------------------待處理----------------------------------------*/

}
