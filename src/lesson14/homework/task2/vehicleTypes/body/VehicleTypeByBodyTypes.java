package lesson14.homework.task2.vehicleTypes.body;

import lesson14.homework.task2.VehicleType;

public class VehicleTypeByBodyTypes extends VehicleType {
    public VehicleTypeByBodyTypes() {
        super("Vehicle type by body");
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByBodyTypes that = (VehicleTypeByBodyTypes) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}
