package low.Level.Design.liskov_substitution_principle;

public class Bicycle extends Vehicle{

    @Override
    public String name() {
        return "Bicycle";
    }

    @Override
    public Boolean hasEngine() {
        return null;
    }
}
