package low.Level.Design.design_pattern.strategy_pattern;

import low.Level.Design.design_pattern.strategy_pattern.strategy.DriveStrategy;
import low.Level.Design.design_pattern.strategy_pattern.strategy.sportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new sportsDriveStrategy());
    }
/*
    public void drive()
    {
        System.out.println("Sport drive vehicle");
    }*/
}
