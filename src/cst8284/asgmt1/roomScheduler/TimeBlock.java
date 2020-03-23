package cst8284.asgmt1.roomScheduler;

import java.util.Calendar;

public class TimeBlock {
	private Calendar startTime;
	private Calendar endTime;
	
	// Constant
	
	private static Calendar DefaultStartTime = new Calendar.Builder().set(Calendar.HOUR_OF_DAY,8).build();
	private static Calendar DefaultEndTime = new Calendar.Builder().set(Calendar.HOUR_OF_DAY,23).build();
	
	// constructor
	
	public TimeBlock() {
		this(DefaultStartTime, DefaultEndTime);
	}
	
	public TimeBlock(
			Calendar i_startTime, 
			Calendar i_endTime) 
	{
		setStartTime(i_startTime);
		setEndTime(i_endTime);
	}
	
	public boolean overlaps(TimeBlock newBlock)
	{
		boolean result = false;
		
		int newBlockStartHour = hourOfDay(newBlock.getStartTime());
		int existingBlockEndHour = hourOfDay(this.endTime);
		
		if (newBlockStartHour < existingBlockEndHour) {
			result = true;
		}
		return result;
	}
	
	public int duration()
	{
		int startTimeHour = hourOfDay(this.startTime);
		int endTimeHour = hourOfDay(this.endTime);
		int result = startTimeHour - endTimeHour;
		return result;
	}
	
	public String toString()
	{
		return "";
	}
	
	// getter
	public Calendar getStartTime() {
		return startTime;
	}
	public Calendar getEndTime() {
		return endTime;
	}
	
	// setter
	public void setStartTime(Calendar i_startTime) {
		this.startTime = i_startTime;
	}
	public void setEndTime(Calendar i_endTime) {
		this.endTime = i_endTime;
	}
	
	// helper
	public int hourOfDay(Calendar i_calendar) {
		return i_calendar.get(Calendar.HOUR_OF_DAY);
	}
}
