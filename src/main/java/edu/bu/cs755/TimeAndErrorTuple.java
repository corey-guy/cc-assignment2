package edu.bu.cs755;

public class TimeAndErrorTuple {
	private int hour;
	private int isError = 0;

	public TimeAndErrorTuple(int i, int isError)
	{
		this.hour = i;
		this.isError = isError;
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public int getIsError() {
		return isError;
	}
	
	public String toString() {
		return "GPS ERROR at: " + hour;
	}
}
