package assignment2;

import java.util.Scanner;

/**
 *
 * @author dhaliwal
 */
public class Driver {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        Scanner input =new Scanner(System.in);
        System.out.println("Enter first name");
       String f = input.nextLine();
        System.out.println("enter last name ");
       String l =input.nextLine();
       System.out.println("enter social security number");
       String ssn=in.nextLine();
       System.out.println("enter  grossale");
       double grossSales =in.nextDouble();
        System.out.println("enter commission rate for an employee");
       double commissionRate=in.nextDouble();
       
       //creating object of commissionEmpoyee class
       CommissionEmployee c1 =new CommissionEmployee(f,l,ssn, grossSales,commissionRate);
       double earnning = c1.earnings();
        
       System.out.println(c1.toString());
       

//input for the hourly employee

 System.out.println("Enter first name");
       String f2 = input.nextLine();
        System.out.println("enter last name ");
       String l2 =input.nextLine();
       System.out.println("enter social security number");
       String ssn2=in.nextLine();
     
        System.out.println("enter no. of hours");
       double hours =in.nextDouble();
        System.out.println("enter wage");
       double wage=in.nextDouble();
      
       
       HourlyEmployee h1= new HourlyEmployee(f2,l2,ssn2,hours,wage);
        System.out.println(h1.toString());
        
    }
}
