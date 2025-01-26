package low.Level.Design.design_pattern.abstarct_factory_pattern;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        VehicleFactory luxuryFactory = VehicleFactoryProvider.getFactory("LUXURY");
        Vehicle bmw = luxuryFactory.getVehicle("BMW");
        bmw.carType();

        Vehicle hyundai = VehicleFactoryProvider.getFactory("NORMAL").getVehicle("HYUNDAI");
        hyundai.carType();
    }
}
