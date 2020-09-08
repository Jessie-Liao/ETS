
package com.mli.ets.bom;

import java.io.Serializable;
import java.text.ParseException;

public class StoreB implements Serializable {
	private static final long serialVersionUID = 1L;

	public StoreB() throws ParseException {
	}

	private String type = "null"; // 類別
	private double allRating = -999999;//20200527**國外債券投資總額(單一發行或保證者)

	private double bbbPlusRating = -999999;
	private double bbPlusRating = -999999;
	private double bbbRating =-999999;

	public double getBbbRating() {
		return bbbRating;
	}

	public void setBbbRating(double bbbRating) {
		this.bbbRating = bbbRating;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAllRating() {
		return allRating;
	}

	public void setAllRating(double allRating) {
		this.allRating = allRating;
	}

	public double getBbbPlusRating() {
		return bbbPlusRating;
	}

	public void setBbbPlusRating(double bbbPlusRating) {
		this.bbbPlusRating = bbbPlusRating;
	}

	public double getBbPlusRating() {
		return bbPlusRating;
	}

	public void setBbPlusRating(double bbPlusRating) {
		this.bbPlusRating = bbPlusRating;
	}

}
