package cst8284.asgmt1.roomScheduler;

public class RoomBooking {
	private ContactInfo contactInfo;
	private Activity activity;
	private TimeBlock timeBlock;
	
	// constructor
	public RoomBooking(
			TimeBlock i_timeBlock,
			ContactInfo i_contactInfo,
			Activity i_activity)
	{
		setTimeBlock(i_timeBlock);
		setContactInfo(i_contactInfo);
		setActivity(i_activity);
	}
	
	public String toString()
	{
		return "";
	}
	
	//getter
	public ContactInfo getContactInfo()
	{
		return contactInfo;
	}
	
	public Activity getActivity()
	{
		return activity;
	}
	
	public TimeBlock getTimeBlock()
	{
		return timeBlock;
	}
	
	//setter
	public void setContactInfo(ContactInfo i_contactInfo)
	{
		this.contactInfo=i_contactInfo;
	}

	public void setActivity(Activity i_activity)
	{
		this.activity=i_activity;
	}
	
	public void setTimeBlock(TimeBlock i_timeBlock)
	{
		this.timeBlock=i_timeBlock;
	}
}
