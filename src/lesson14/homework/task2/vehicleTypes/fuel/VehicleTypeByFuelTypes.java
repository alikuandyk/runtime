package lesson14.homework.task2.vehicleTypes.fuel;

import lesson14.homework.task2.VehicleType;

public class VehicleTypeByFuelTypes extends VehicleType {
    public VehicleTypeByFuelTypes() {
        super("Vehicle type by fuel");
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByFuelTypes that = (VehicleTypeByFuelTypes) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}
