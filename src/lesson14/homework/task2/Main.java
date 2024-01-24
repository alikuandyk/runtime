package lesson14.homework.task2;

import lesson14.homework.task2.vehicleTypes.body.PickupType;
import lesson14.homework.task2.vehicleTypes.body.SedanType;
import lesson14.homework.task2.vehicleTypes.fuel.DieselType;
import lesson14.homework.task2.vehicleTypes.fuel.PetrolType;
import lesson14.homework.task2.vehicleTypes.purpose.CarType;
import lesson14.homework.task2.vehicleTypes.purpose.PassengerType;
import lesson14.homework.task2.vehicleTypes.purpose.TruckType;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();


        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());



        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());

        adsService.filterByVehicleTypeByPurpose(new TruckType());

        //TODO Создайте объявление с типами CAR, SEDAN, PETROL и отфильтруйте объявления с бензиновым топливом

        VehicleAd toyotaAd = new VehicleAd("Camry", "647", new CarType(), new SedanType(), new PetrolType());
        adsService.setAdList(new VehicleAd[] {toyotaAd});
        adsService.filterByVehicleTypeByBodyTypes(new SedanType());
    }
}
