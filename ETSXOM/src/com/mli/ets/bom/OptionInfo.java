package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;
import com.mli.ets.bom.OptionStore;

public class OptionInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	public OptionInfo() throws ParseException {
	}

	private OptionStore optionStore = new OptionStore();// 期權投資總額

	private double futuresAmt = -999999;// 本次的期權金額
	private double futuresAndHedgedAssetsTotalAMt = -999999;// 期貨選擇權被避險資產總額
	private double futuresAndHedgedAssetsCorrelationCoefficient = -999999;// 期貨與被避險資產相關係數

	public OptionStore getOptionStore() {
		return optionStore;
	}

	public void setOptionStore(OptionStore optionStore) {
		this.optionStore = optionStore;
	}

	public double getFuturesAmt() {
		return futuresAmt;
	}

	public void setFuturesAmt(double futuresAmt) {
		this.futuresAmt = futuresAmt;
	}

	public double getFuturesAndHedgedAssetsTotalAMt() {
		return futuresAndHedgedAssetsTotalAMt;
	}

	public void setFuturesAndHedgedAssetsTotalAMt(
			double futuresAndHedgedAssetsTotalAMt) {
		this.futuresAndHedgedAssetsTotalAMt = futuresAndHedgedAssetsTotalAMt;
	}

	public double getFuturesAndHedgedAssetsCorrelationCoefficient() {
		return futuresAndHedgedAssetsCorrelationCoefficient;
	}

	public void setFuturesAndHedgedAssetsCorrelationCoefficient(
			double futuresAndHedgedAssetsCorrelationCoefficient) {
		this.futuresAndHedgedAssetsCorrelationCoefficient = futuresAndHedgedAssetsCorrelationCoefficient;
	}

}
