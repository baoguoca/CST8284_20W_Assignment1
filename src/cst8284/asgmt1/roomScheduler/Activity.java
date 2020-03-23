package cst8284.asgmt1.roomScheduler;

public class Activity {
	private String description;
	private String category;
	
	// constructor
	public Activity(
			String i_category, 
			String i_description) 
	{
		setCategory(i_category);
		setDescription(i_description);
	}
	
	public String toString()
	{
		return "";
	}
	
	// getter
	public String getDescription() {
		return description;
	}
	public String getCategory() {
		return category;
	}
	
	// setter
	public void setDescription(String i_description) {
		this.description = i_description;
	}
	public void setCategory(String i_category) {
		this.category = i_category;
	}	
}
