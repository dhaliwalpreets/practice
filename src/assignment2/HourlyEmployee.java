package assignment2;

/**
 *
 * @author dhaliwal
 */
public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;
    
    public HourlyEmployee(String f, String l, String ssn, double hours, double wage) {
        super(f, l, ssn);
        setHours( hours);
         setWage( wage);
    }
// earning method for returning total wage earned 
    public double earnings(){
        return hours*wage;
    }
    //to string method
    public String toString(){
		return super.toString()+ earnings();
}
    /**
     * @return the hours
     */
    public double getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(double hours)throws IllegalArgumentException
    {
        if(hours>=0 && hours<=168)
        this.hours = hours;
         else
             throw new IllegalArgumentException("enter valid input");
    }

    /**
     * @return the wage
     */
    public double getWage() {
        return wage;
    }

    /**
     * @param wage the wage to set
     */
    public void setWage(double wage) {
        this.wage = wage;
    }
    
    
}
