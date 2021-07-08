
/*
 This is the Sports Vehicle class implemented with its required members. Note that for Sports Vehicle, The engine type must be "oil".
  So it remains read-only (keeping it private and returns the only getter method).  
 */

package VehicleShowroom;

public class SportsVehicle implements Vehicle {

    
	private String model_number;
	private String engine_power;
	private String tire_size;
    private String engine_type="oil";                                 /*All the members*/
	private String turbo;
	
	public String getModel_number() {
		return model_number;
	}
	public void setModel_number(String model_number) {
		this.model_number = model_number;
	}
	public String getEngine_power() {                                      
		return engine_power;
	}
	public void setEngine_power(String engine_power) {                         /*Getter and Setter Method members*/
		this.engine_power = engine_power;
	}
	public String getTire_size() {
		return tire_size;
	}
	public void setTire_size(String tire_size) {
		this.tire_size = tire_size;
	}
	public String getEngine_type() {                                    /*Only getter method for Engine Type as it is fixed for "oil"*/
		return engine_type;
	}
	public String getTurbo() {
		return turbo;
	}
	public void setTurbo(String turbo) {
		this.turbo = turbo;
	}

	
	public String VehicleType() {
		
		return "A Sports Vehicle Added";
	}
	
	public String toString() {
		return "SportsVehicle [model_number=" + model_number + ", engine_power=" + engine_power + ", tire_size="   /*toString method*/
				+ tire_size + ", engine_type=" + engine_type + ", turbo=" + turbo + "]";
	}
	

}
