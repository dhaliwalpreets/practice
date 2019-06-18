package assignment2;

/**
 *
 * @author dhaliwal
 */
public class CommissionEmployee extends Employee {
    
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String f, String l, String ssn, double grossSales,double commissionRate) {
        super(f, l, ssn);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    /**
     * @return the grossSales
     */
    public double getGrossSales() {
        return grossSales;
    }

    /**
     * @param grossSales the grossSales to set
     */
    public void setGrossSales(double grossSales)throws IllegalArgumentException
    {
        if(grossSales >= 0.0)
            this.grossSales = grossSales;
        else
             throw new IllegalArgumentException("enter valid input");
    }

    /**
     * @return the commissionRate
     */
    public double getCommissionRate() {
        return commissionRate;
    }

    /**
     * @param commissionRate the commissionRate to set
     */
    public void setCommissionRate(double commissionRate) throws IllegalArgumentException
    {
        if(commissionRate >=0.0&&commissionRate <=1.0)
            this.commissionRate = commissionRate;
         else
            throw new IllegalArgumentException("enter valid input");
    }
    public double earnings(){
        return commissionRate*grossSales;
    }
    public String toString(){
		return super.toString()+ "\nEARNNIGS: " + earnings();
}

}