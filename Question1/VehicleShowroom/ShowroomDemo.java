
/*
 This is actually the typical "MAIN" class we can say. 
 */


package VehicleShowroom;
import java.lang.*;
import java.util.*;
public class ShowroomDemo {
	

	public static void main(String[] args) {
		
		
		int id=1;
		int visitor=30;
		Map<Integer,String> hm= new HashMap<Integer, String>();                           /*Map Vehicles with ID and information*/
		
		
		 Scanner sc= new Scanner(System.in);
		 while(true)
		 {
		 
		System.out.println("-----**Shahi Wheels And Cars**-----\n");
		
		System.out.println("Please choose from the Menu: \n");
		System.out.println(" Add a new vehicle (Press 1) ");
		System.out.println(" Remove an existing vehicle (Press 2)");                                 /*Menu for adding or removing or showing*/
		System.out.println(" Show Vehicle List(Press 3)");
		System.out.println(" Show Vehicle List with visitors number(Press 4)");
		System.out.println(" Exit(Press 5)");
		
		int s1=sc.nextInt();
		if(s1==1)
		{
		VehicleFactory vehicle= new VehicleFactory();
	   
		System.out.println("Which Type to Add: \n 1. Normal Vehicle(Press 1)\n 2. Sports Vehicle (Press 2)\n 3. Heavy Vehicle (Press 3)\n");   /*Menu for Vehicle Type*/
	    int s2=sc.nextInt();
	    System.out.print("\n");
	    String p = null;
	    if(s2==1)
	    {
	    	p="Nomral Vehicle";
	    }
	    else if(s2==2)
	    {
	    	p="Sports Vehicle";
	    }
	    else
	    {
	    	p="Heavy Vehicle";
	    }
		Object v1= vehicle.getVehicleType(p);
		if(v1 instanceof NormalVehicle==true)
		{
			NormalVehicle n= new NormalVehicle();
	
			System.out.println("Enter the Model Number: ");
			sc.nextLine();
		    String pp=sc.nextLine();
			n.setModel_number(pp);
			System.out.println("Enter the Engine Type: ");                       /*Inserting Information for Vehicle adding*/
			pp=sc.nextLine();
			n.setEngine_type(pp);
			System.out.println("Enter the Engine Power: ");
			pp=sc.nextLine();
			n.setEngine_power(pp);
			System.out.println("Enter the Tire Size: ");
			pp=sc.nextLine();
			n.setTire_size(pp);
			System.out.println(n.VehicleType());
			System.out.println(n.toString());
			hm.put(id, n.toString());
			id++;
		}
		else if(v1 instanceof SportsVehicle==true)
		{
			String pp;
			SportsVehicle n= new SportsVehicle();
			
			System.out.println("Enter the Model Number: ");
			sc.nextLine();
			pp=sc.nextLine();
			n.setModel_number(pp);
			System.out.println("For Sports Car, the engine type is oil");               /*Inserting Information for Vehicle adding*/
			System.out.println("Enter the Engine Power: ");
			pp=sc.nextLine();
			n.setEngine_power(pp);
			System.out.println("Enter the Tire Size: ");
			pp=sc.nextLine();
			n.setTire_size(pp);
			System.out.println("Enter the Turbo: ");
			pp=sc.nextLine();
			n.setTurbo(pp);
			System.out.println(n.VehicleType());
			System.out.println(n.toString());
			hm.put(id, n.toString());
			visitor=visitor+20;
			id++;
		}
		else if(v1 instanceof HeavyVehicle==true)
		{
			String pp;
			HeavyVehicle n= new HeavyVehicle();
			
			System.out.println("Enter the Model Number: ");
			sc.nextLine();
			pp=sc.nextLine();
			n.setModel_number(pp);
			System.out.println("For Sports Car, the engine type is disel");
			System.out.println("Enter the Engine Power: ");                                /*Inserting Information for Vehicle adding*/
			pp=sc.nextLine();
			n.setEngine_power(pp);
			System.out.println("Enter the Tire Size: ");
			pp=sc.nextLine();
			n.setTire_size(pp);
			System.out.println("Enter the Weight: ");
			pp=sc.nextLine();
			n.setWeight(pp);
			System.out.println(n.VehicleType());
			System.out.println(n.toString());
			hm.put(id,n.toString());
			id++;
		}
		
		}
		else if(s1==3)
		{
			if(hm.isEmpty()==true)
				System.out.println("No cars availabe to show");                                                /*Display Vehicles*/
			else
			{
			System.out.println("ID No.      Car\n");
			hm.forEach((key,value) -> System.out.println(key + "       " + value+" \n"));
			}
			
		}
		else if(s1==4)
		{
			if(hm.isEmpty()==true)
			System.out.println("No cars availabe to show");
			else
			{
			System.out.println("ID No.      Car\n");
			hm.forEach((key,value) -> System.out.println(key + "       " + value+" \n"));                   /*Display Vehicles*/
			System.out.println("Total Visitor Count : "+ visitor);
			}
		}
		else if(s1==2)
		{
			if(hm.isEmpty()==true)
			{
				System.out.println("No cars to be removed");                                                 /*Removing vehicles with the input id*/
			}
			else
			{
			System.out.println("Enter the car ID no. to remove");
			int x= sc.nextInt();
			hm.remove(x);
			}
			
		}
		else if(s1==5)                                                                                      /*Exit from Menu*/
		{
			break;
		}
				
		
	
	}
 }

}
