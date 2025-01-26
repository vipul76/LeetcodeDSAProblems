package low.Level.Design.liskov_substitution_principle;

public class Car extends EngineVehicle{

    @Override
    public String name() {
        return "Car";
    }
    @Override
    public Integer getNumberOfWheels(){
        return 4;
    }
}
