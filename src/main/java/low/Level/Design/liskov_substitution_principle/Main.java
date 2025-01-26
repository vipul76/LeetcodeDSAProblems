package low.Level.Design.liskov_substitution_principle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());
        for(Vehicle vehicle:vehicleList){
            System.out.println("Vahicle type : "+ vehicle.name()+
                    ", wheels : "+vehicle.getNumberOfWheels().toString()
            +", Engine check : "+vehicle.hasEngine());
        }

        List<EngineVehicle> engineVehicleList = new ArrayList<>();
        engineVehicleList.add(new MotorCycle());
        engineVehicleList.add(new Car());

    }
}
