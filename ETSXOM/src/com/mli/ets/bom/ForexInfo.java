package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;

public class ForexInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	public ForexInfo() throws ParseException {
	}

	private double todayTradeDayTotalAMt = -999999;// 今日已申請外匯總額度台幣總額
	private double lastTradeDayTotalAMt = -999999;// 前一交易日已申請外匯總額度台幣總額

	public double getTodayTradeDayTotalAMt() {
		return todayTradeDayTotalAMt;
	}

	public void setTodayTradeDayTotalAMt(double todayTradeDayTotalAMt) {
		this.todayTradeDayTotalAMt = todayTradeDayTotalAMt;
	}

	public double getLastTradeDayTotalAMt() {
		return lastTradeDayTotalAMt;
	}

	public void setLastTradeDayTotalAMt(double lastTradeDayTotalAMt) {
		this.lastTradeDayTotalAMt = lastTradeDayTotalAMt;
	}

}
