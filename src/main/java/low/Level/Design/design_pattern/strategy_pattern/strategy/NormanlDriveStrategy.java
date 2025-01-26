package low.Level.Design.design_pattern.strategy_pattern.strategy;

public class NormanlDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Noraml Drive Strategy");
    }
}
