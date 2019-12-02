package ie.lyit.bank;

public class Employee extends Person{
	protected Date startDate;
	double salary;
	int number;
	static int nextNumber;
	
	public Employee(){
		this.startDate = new Date(1,1,2000);
		this.salary = 0;
		this.number = nextNumber++;	
	}
	
	public Employee(Name n, Date dob, Date startDate, double salary){
		name = n;
		dateOfBirth = dob;
		this.startDate = startDate;
		this.salary = salary;
		this.number = nextNumber++;
	}
	
	@Override
	public String toString(){
		return (super.toString()+" "+startDate+ " " +salary+" "+number);
	}
	
	public void incrementSalary(double incrementAmount) throws IllegalArgumentException{
	 if(salary + incrementAmount <= 150000)
	 {
		 salary+=incrementAmount;
	 }
	 else
		 throw new IllegalArgumentException("Maximum Salary Reached.");
	}
	
	public double calculateWage(double taxPercentage){
		return salary-(salary*(taxPercentage/100));
	}
	
	// get methods()
	public Name getName(){
		return name;
	}
	public Date getDateOfBirth(){
		return dateOfBirth;
	}
	public Date getstartDate(){
		return startDate;
	}
	public double getSalary(){
		return salary;
	}
	public int getNumber(){
		return number;
	}
	
	//set methods()
	public void setName(Name n){
		this.name = n;
	}
	public void setDateOfBirth(Date dob){
		dateOfBirth = dob;
	}
	public void setStartDate(Date setDateTo){
		startDate = setDateTo;
	}
	public void setSalary(double setSalaryTo){
		salary = setSalaryTo;
	}
	
}
