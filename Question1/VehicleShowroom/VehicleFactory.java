/*
 This is the Factory class. This class takes the responsibility of the instantiation of a class based on clients requirements.
 */

package VehicleShowroom;

public class VehicleFactory {
	public Vehicle getVehicleType(String vType)
	{
		  
		  
	      if(vType.equalsIgnoreCase("Nomral Vehicle"))
	      {
	         return new NormalVehicle();
	         
	      } 
	      else if(vType.equalsIgnoreCase("Sports Vehicle"))
	      {
	         return new SportsVehicle();
	         
	      }
	      else if(vType.equalsIgnoreCase("Heavy Vehicle"))
	      {
	         return new HeavyVehicle();
	      }
	
	      else
	    	  return null;
	}

}
