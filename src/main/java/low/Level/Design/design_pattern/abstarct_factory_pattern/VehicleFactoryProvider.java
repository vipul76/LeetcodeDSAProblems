package low.Level.Design.design_pattern.abstarct_factory_pattern;

public class VehicleFactoryProvider{
    public static VehicleFactory getFactory(String factoryType){
        if(factoryType == null){
            return null;
        }
        if(factoryType.equalsIgnoreCase("LUXURY")){
            return new VehicleFactory() {
                @Override
                Vehicle getVehicle(String vehicleType) {
                    return new LuxuryVehicleFactory().getLuxuryVehicle(vehicleType);
                }
            };
        } else if (factoryType.equalsIgnoreCase("NORMAL")) {
            return new VehicleFactory() {
                @Override
                Vehicle getVehicle(String vehicleType) {
                    return new NormalVehicleFactory().getNoramlVehicle(vehicleType);
                }
            };
        }
        return null;
    }
}
