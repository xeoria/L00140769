/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Models a Date
 * Date: 19/09/2019
 * @author Maria Boyle
 * @version 1.0
 * NOTES:This Date class contains no error handling to ensure d/m/y in correct range.
 *       Error handling will be added when Exception Handling is revised.
**/
package ie.lyit.bank;

public class Date{
	private int day;
	private int month;
	private int year;

	// Default Constructor 
	//	==> Called when a Date object is created as follows - Date d1 = new Date();
	public Date(){
		day=1;
		month=1;
		year=1900;
	}

	// Overloaded Constructor
	// ==> Called when a Date object is created as follows - Date d2 = new Date(14,9,2010);
	public Date(int d, int m, int y) throws IllegalArgumentException{
		if(d < 1 || d > 31 || m < 1 || m > 12 || y < 1900)
			throw new IllegalArgumentException("Invalid Date.");
		
		this.day=d;
		this.month=m;
		this.year=y;
	}

	// toString() method
	// ==> Called when a String of the class is used, e.g. - System.out.print(d1);
	//																  or System.out.print(d1.toString());
	@Override
	public String toString(){
		return (day + "/" + month + "/" + year);
	}
	
	// equals() method
	// ==> Called when comparing an object with another object, 
	//     e.g. - if(d1.equals(d2))
	@Override
	public boolean equals(Object obj){
		Date dObject;
		if (obj instanceof Date)
			dObject = (Date)obj;
		else
			return false;
	
		return (this.day == dObject.day) &&
			   (this.month == dObject.month) &&
			   (this.year == dObject.year);
	}
	
	// get methods
	// ==> Called when retrieving part of an object, e.g. - 
	//     if (d1.getYear() == d2.getYear())
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}

	// set methods
	// ==> Called when setting part of an object, e.g. - 
	//     d1.setDay(14);
	//	   d1.setMonth(9);
	//	   d1.setYear(2010);
	public void setDay(int setDayTo) throws IllegalArgumentException{
		if(setDayTo < 1 || setDayTo > 31)
			throw new IllegalArgumentException("Invalid Day.");
			
		day=setDayTo;
	}
	public void setMonth(int setMonthTo)throws IllegalArgumentException{
		if(setMonthTo < 1 || setMonthTo > 12)
			throw new IllegalArgumentException("Invalid Month.");
			
		month=setMonthTo;
	}
	public void setYear(int setYearTo)throws IllegalArgumentException{
		if(setYearTo < 1900)
			throw new IllegalArgumentException("Invalid Year.");
		
		year=setYearTo;
	}
}