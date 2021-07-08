
/*
 This is the Sports Vehicle class implemented with its required members. Note that for Heavy Vehicle, The engine type must be "diesel".
  So it remains read-only (keeping it private and returns the only getter method).  
 */

package VehicleShowroom;

public class HeavyVehicle implements Vehicle  {
	

	public String model_number;
	public String engine_power;
	public String tire_size;                                     /*All the members*/
	private String engine_type="diesel";                            
	
	public String weight;

	public String getModel_number() {
		return model_number;
	}

	public void setModel_number(String model_number) {
		this.model_number = model_number;
	}

	public String getEngine_power() {                                       /*Getter and Setter Method members*/
		return engine_power;
	}

	public void setEngine_power(String engine_power) {
		this.engine_power = engine_power;
	}

	public String getTire_size() {
		return tire_size;
	}
   
	public void setTire_size(String tire_size) {
		this.tire_size = tire_size;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getEngine_type() {                                       /*Only getter method for Engine Type as it is fixed for "diesel"*/
		return engine_type;
	}


	public String VehicleType() {
	   
		return "A Heavy Vehicle Added";
	}

	
	public String toString() {
		return "HeavyVehicle [model_number=" + model_number + ", engine_power=" + engine_power + ", tire_size="       /*toString method*/
				+ tire_size + ", engine_type=" + engine_type + ", weight=" + weight + "]";
	}
	

}
