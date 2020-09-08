package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;

public class Decision implements Serializable {
	private static final long serialVersionUID = 1L;

	public Decision() throws ParseException {
	}

	private NewDec newDec = new NewDec(); // 本次決策資訊
	private STKInfo stkInfo = new STKInfo(); // 股票資訊
	private BondInfo bondInfo = new BondInfo(); // 債劵資訊
	private OtherInfo otherInfo = new OtherInfo(); // 其他資訊
	private FundInfo fundInfo = new FundInfo();// 基金資訊
	private OptionInfo optionInfo = new OptionInfo();// 期權資訊
	private ForexInfo forexInfo = new ForexInfo();// 外匯資訊
	private IrsInfo irsInfo = new IrsInfo();// 資金調度資訊
	private CreditRating creditRating = new CreditRating();// 信用評等

	public NewDec getNewDec() {
		return newDec;
	}

	public void setNewDec(NewDec newDec) {
		this.newDec = newDec;
	}

	public STKInfo getStkInfo() {
		return stkInfo;
	}

	public void setStkInfo(STKInfo stkInfo) {
		this.stkInfo = stkInfo;
	}

	public BondInfo getBondInfo() {
		return bondInfo;
	}

	public void setBondInfo(BondInfo bondInfo) {
		this.bondInfo = bondInfo;
	}

	public OtherInfo getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(OtherInfo otherInfo) {
		this.otherInfo = otherInfo;
	}

	public FundInfo getFundInfo() {
		return fundInfo;
	}

	public void setFundInfo(FundInfo fundInfo) {
		this.fundInfo = fundInfo;
	}

	public OptionInfo getOptionInfo() {
		return optionInfo;
	}

	public void setOptionInfo(OptionInfo optionInfo) {
		this.optionInfo = optionInfo;
	}

	public ForexInfo getForexInfo() {
		return forexInfo;
	}

	public void setForexInfo(ForexInfo forexInfo) {
		this.forexInfo = forexInfo;
	}

	public IrsInfo getIrsInfo() {
		return irsInfo;
	}

	public void setIrsInfo(IrsInfo irsInfo) {
		this.irsInfo = irsInfo;
	}

	public CreditRating getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(CreditRating creditRating) {
		this.creditRating = creditRating;
	}

}
