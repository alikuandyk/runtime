package lesson14.homework.task2.vehicleTypes.fuel;

import lesson14.homework.task2.VehicleTypeEnum;
import lesson14.homework.task2.vehicleTypes.fuel.VehicleTypeByFuelTypes;

public class PetrolType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
