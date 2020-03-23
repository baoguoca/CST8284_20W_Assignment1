package cst8284.asgmt1.roomScheduler;

import java.util.Calendar;
import java.util.Scanner;

public class RoomScheduler {
	private Scanner scan;
	private RoomBooking[] roomBookings;
	private int lastBookingIndex;
	
	// Constant
	private int ENTER_ROOM_BOOKING;
	private int DISPLAY_BOOKING;
	private int DISPLAY_DAY_BOOKING;
	private int EXIT;
	
	public RoomScheduler() {
		
	}
	
	public void launch() {
		
	}
	
	private int displayMenu() {
		return 0;
	}
	
	private void executeMenuItem(int choice) {
		
	}
	
	private boolean saveRoomBooking(RoomBooking booking) {
		return true;
	}
	
	private RoomBooking displayBooking(Calendar cal)
	{
		return new RoomBooking(null, null, null);
	}
	
	private void displayDayBookings(Calendar cal)
	{
		
	}
	
	private String getResponseTo(String s)
	{
		System.out.print(s);
		return scan.nextLine();
	}
	
	private RoomBooking makeBookingFromUserInput()
	{
		return new RoomBooking(null, null, null);
	}
	
	private Calendar makeCalendarFromUserInput(
			Calendar cal,
			boolean requestHour)
	{
		return null;
	}
	
	private int processTimeString(String t) {
		return 0;
	}
	
	private RoomBooking findBooking(Calendar cal) {
		return null;
	}
	
	// getter
	private RoomBooking[] getRoomBookings() {
		return null;
	}
	
	private int getBookingIndex() {
		return 0;
	}
	
	// setter
	private void setBookingIndex(int bookingIndex) 
	{
		
	}
	
}
