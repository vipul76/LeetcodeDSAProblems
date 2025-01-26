package low.Level.Design.design_pattern.abstarct_factory_pattern;

public class LuxuryVehicleFactory {

    public Vehicle getLuxuryVehicle(String vehicle){
        if(vehicle ==  null){
            return null;
        }
        if(vehicle.equalsIgnoreCase("BMW")){
            return new BMW();
        } else if (vehicle.equalsIgnoreCase("MERCEDES")) {
            return new Mercedes();
        }
        return null;
    }
}
