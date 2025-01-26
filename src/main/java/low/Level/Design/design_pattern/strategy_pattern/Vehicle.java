package low.Level.Design.design_pattern.strategy_pattern;

import low.Level.Design.design_pattern.strategy_pattern.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveObject;

    Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }
    public void drive()
    {
        driveObject.drive();
    }
}
