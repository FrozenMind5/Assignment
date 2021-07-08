
/*
 This is the Normal Vehicle class implemented with its required members. Note that, for Normal Vehicle, The engine type might be "oil" or "gas"
 or "diesel". So this attribute has read/write both options. Later vehicle type has limitations in this attribute. 
 */

package VehicleShowroom;

public class NormalVehicle implements Vehicle {

	
	private String model_number;
	private String engine_power;
	private String tire_size;                                                  /*All the members*/
	private String engine_type;	
	public String getModel_number() {
		return model_number;
	}
	public void setModel_number(String model_number) {
		this.model_number = model_number;
	}
	public String getEngine_power() {
		return engine_power;
	}
	public void setEngine_power(String engine_power) {                       /*Getter and Setter Method members*/
		this.engine_power = engine_power;
	}
	public String getTire_size() {
		return tire_size;
	}
	public void setTire_size(String tire_size) {
		this.tire_size = tire_size;
	}
	public String getEngine_type() {
		return engine_type;
	}
	public void setEngine_type(String engine_type) {
		this.engine_type = engine_type;
	}

	public String VehicleType() {
		
		return "A Normal Vehicle Added";
		
	}
	public String toString() {
		return "NormalVehicle [model_number=" + model_number + ", engine_power=" + engine_power + ", tire_size="     /*toString method*/
				+ tire_size + ", engine_type=" + engine_type + "]";
	}

}
