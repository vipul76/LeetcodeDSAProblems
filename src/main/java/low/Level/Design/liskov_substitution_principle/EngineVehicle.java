package low.Level.Design.liskov_substitution_principle;

public abstract class EngineVehicle extends Vehicle{
    @Override
    public abstract String name();
    public Boolean hasEngine(){
        return true;
    }
}