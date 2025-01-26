package low.Level.Design.design_pattern.abstarct_factory_pattern;

public class NormalVehicleFactory {
    public Vehicle getNoramlVehicle(String vehicle){
        if(vehicle == null){
            return null;
        } else if (vehicle.equalsIgnoreCase("HYUNDAI")) {
            return new Hyundai();
        } else if (vehicle.equalsIgnoreCase("SWIFT")) {
            return new SWIFT();
        }
        return null;
    }
}
