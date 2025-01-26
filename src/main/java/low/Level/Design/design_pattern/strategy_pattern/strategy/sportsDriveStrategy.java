package low.Level.Design.design_pattern.strategy_pattern.strategy;

public class sportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports drive strategy");
    }
}
