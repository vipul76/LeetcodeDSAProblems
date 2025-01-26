package low.Level.Design.design_pattern.abstarct_factory_pattern;

/* abstract class VehicleFactory {
    abstract Vehicle getVehicle(String vehicleType);
}*/

/*public class VehicleFactoryProvider {
    public VehicleFactory getVehicle(String factoryType) {
        if (factoryType == null) {
            return null;
        }
        if (factoryType.equalsIgnoreCase("LUXURY")) {
            return new VehicleFactory() {
                @Override
                Vehicle getVehicle(String vehicleType) {
                    return new LuxuryVehicleFactory().getLuxuryVehicle(vehicleType);
                }
            };
        }
        else if(factoryType.equalsIgnoreCase("NORMAL")){
            return new VehicleFactory() {
                @Override
                Vehicle getVehicle(String vehicleType) {
                    return new NormalVehicleFactory().getNoramlVehicle(vehicleType);
                }
            };
        }
        return null;
    };
}*/

/*  }{
                @Override
                public Vehicle getVehicle().LuxuryVehicleFactory
            };
        } else if (vehicleType.equalsIgnoreCase("MERCEDES")) {
            return new Mercedes();
        } else if (vehicleType.equalsIgnoreCase("HYUNDAI")) {
            return new Hyundai();
        } else if (vehicleType.equalsIgnoreCase("SWIFT")) {
            return new SWIFT();
        }*/