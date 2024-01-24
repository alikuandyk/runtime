package lesson14.homework.task2.vehicleTypes.purpose;

import lesson14.homework.task2.VehicleType;
import lesson14.homework.task2.VehicleTypeEnum;

public class PassengerType extends VehicleTypeByPurpose {
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}
