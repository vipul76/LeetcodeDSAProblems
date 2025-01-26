package low.Level.Design.design_pattern.strategy_pattern;

import low.Level.Design.design_pattern.strategy_pattern.strategy.DriveStrategy;
import low.Level.Design.design_pattern.strategy_pattern.strategy.NormanlDriveStrategy;

public class PassengerVehicle extends Vehicle{

    PassengerVehicle() {
        super(new NormanlDriveStrategy());
    }
}
