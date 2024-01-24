package lesson14.homework.task2.vehicleTypes.purpose;

import lesson14.homework.task2.VehicleTypeEnum;

public class CarType extends VehicleTypeByPurpose {
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
