package showroomanagement;
import java.util.*;

public class Showroom implements  utility 
{
	String sh_name;
    String sh_address;
    int total_emp;
    int total_cars_in_stock = 0;
    String manager_name;
    
	public void get_details() 
	{
		    System.out.println("Showroom Name: "+sh_name);
	        System.out.println("Showroom Address: "+sh_address);
	        System.out.println("Manager Name: "+manager_name);
	        System.out.println("Total Employees: "+total_emp);
	        System.out.println("Total Cars In Stock: "+total_cars_in_stock);

	}
	public void set_details()
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
	        System.out.println();
	        System.out.print("SHOWROOM NAME: ");
	        sh_name = sc.nextLine();
	        System.out.print(("SHOWROOM ADDRESS: "));
	        sh_address = sc.nextLine();
	        System.out.print("MANAGER NAME: ");
	        manager_name = sc.nextLine();
	        System.out.print("TOTAL NO OF EMPLOYEES: ");
	        total_emp = sc.nextInt();
	        System.out.print("TOTAL CARS IN STOCK: ");
	        total_cars_in_stock = sc.nextInt();
	       
	}

}
