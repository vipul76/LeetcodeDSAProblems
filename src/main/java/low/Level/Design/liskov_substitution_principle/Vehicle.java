package low.Level.Design.liskov_substitution_principle;

public abstract class Vehicle {
    public abstract String name();
    public Integer getNumberOfWheels(){
        return 2;
    }
    public abstract Boolean hasEngine();
}
