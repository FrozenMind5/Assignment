# Assignment
__Question 1__:

There a command line vehicle showroom system to be designed. Some common properties of vehicels with some additional properties of each are there. Adding a new vehice requires the vehicle type and based on that the engine type(oil, gas or diesel) will match. So we can describe the whole problem like that, we have a superclass with muliple subclasses and based on input we have to return one of the sub classes. It possibly resembles as a Factory pattern.

So here I needed a factory class named "VehicleFactory" for returning the object creation based on requirements. The Vehicle interface is implemented by "NormalVehicle", "SportsVehicle" and "HeavyVehicle" class.

Every class has public setter methods that needed to set vehicle model_number, tire_size etc. attributes. I kept the engine_type read-only in SportsVehicle and HeavyVehicle beacuse they are fixed in "oil" for sports vehicle and "diesel" for heavy vehicle

Normal expected visitor count is 30, Adding a Sports Vehicle will increase the count upto 20. I assume visitor will not decrease by removing any Sports Vehicle (Not clarified)

Used map with (interger,string) with id and the whole information of vehicle with String type.

All vehicle attributes kept in String datatype to add it with flexibility. (like engine power : 145HP/145KWH), Tire size(small/large/medium/2 Meter)

Here are some attached ScreenShot after runnung the system

![1](https://user-images.githubusercontent.com/31859127/124879590-325c0000-dfef-11eb-9f60-67c7ed426da0.JPG)
                   
                   The menu
                                   
![2](https://user-images.githubusercontent.com/31859127/124879741-5ae3fa00-dfef-11eb-88f0-d9ebf20e4b62.JPG)
                  
                  Adding a Normal Vehicle
                  
![3](https://user-images.githubusercontent.com/31859127/124879814-70592400-dfef-11eb-93b3-03630b9a205e.JPG)
                  
                  Adding a Sports Vehicle

![4](https://user-images.githubusercontent.com/31859127/124879905-8666e480-dfef-11eb-8e4d-94e4e1d5b5d5.JPG)
                  
                  Showing List

![5](https://user-images.githubusercontent.com/31859127/124880005-a1395900-dfef-11eb-93d6-ac6055b3801b.JPG)

                   
                   Showing list with visitor count
 ![6](https://user-images.githubusercontent.com/31859127/124880085-b910dd00-dfef-11eb-8243-21e7251f0a7e.JPG)

                   
                   Removing a vehicle


![7](https://user-images.githubusercontent.com/31859127/124880317-fa08f180-dfef-11eb-986c-ae541a954c1d.JPG)

                  After removing a vehicle
                  
               
               
 __Question 2__
 
 A simple login page design with html and css. Email format must be followed and password can't be remained blank. After logging in there comes a page with success message.


