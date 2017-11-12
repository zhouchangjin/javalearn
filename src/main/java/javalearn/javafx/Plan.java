package javalearn.javafx;

import java.util.Date;

public class Plan {
	Date time;
	String planItem;
	Integer planScore;
	Boolean isFinished;
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getPlanItem() {
		return planItem;
	}
	public void setPlanItem(String planItem) {
		this.planItem = planItem;
	}
	public Integer getPlanScore() {
		return planScore;
	}
	public void setPlanScore(Integer planScore) {
		this.planScore = planScore;
	}
	public Boolean getIsFinished() {
		return isFinished;
	}
	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}
}
