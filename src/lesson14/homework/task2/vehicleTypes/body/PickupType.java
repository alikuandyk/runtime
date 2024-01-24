package lesson14.homework.task2.vehicleTypes.body;

import lesson14.homework.task2.VehicleTypeEnum;
import lesson14.homework.task2.vehicleTypes.body.VehicleTypeByBodyTypes;

public class PickupType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}
