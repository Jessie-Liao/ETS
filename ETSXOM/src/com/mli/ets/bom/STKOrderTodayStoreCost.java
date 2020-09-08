package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;

public class STKOrderTodayStoreCost implements Serializable {
	private static final long serialVersionUID = 1L;

	public STKOrderTodayStoreCost() throws ParseException {
	}

	private double amFNStoresCost = -999999;
	private double glAmFNStoreCost = -999999;
	private double nonStockPoolStoreMCost = -999999;

	public double getAmFNStoresCost() {
		return amFNStoresCost;
	}

	public void setAmFNStoresCost(double amFNStoresCost) {
		this.amFNStoresCost = amFNStoresCost;
	}

	public double getGlAmFNStoreCost() {
		return glAmFNStoreCost;
	}

	public void setGlAmFNStoreCost(double glAmFNStoreCost) {
		this.glAmFNStoreCost = glAmFNStoreCost;
	}

	public double getNonStockPoolStoreMCost() {
		return nonStockPoolStoreMCost;
	}

	public void setNonStockPoolStoreMCost(double nonStockPoolStoreMCost) {
		this.nonStockPoolStoreMCost = nonStockPoolStoreMCost;
	}

}
