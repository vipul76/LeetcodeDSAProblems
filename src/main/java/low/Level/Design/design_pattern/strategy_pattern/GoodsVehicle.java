package low.Level.Design.design_pattern.strategy_pattern;

import low.Level.Design.design_pattern.strategy_pattern.strategy.DriveStrategy;
import low.Level.Design.design_pattern.strategy_pattern.strategy.NormanlDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new NormanlDriveStrategy());
    }

    // No use now
    /*public void drive()
    {
        System.out.println("Goods drive vehicle");
    }*/
}
