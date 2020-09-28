package org.example.main;

import java.time.LocalDate;
import java.time.LocalTime;
import org.example.toll.TollPlaza;
import org.example.vehicles.DieselCar;
import org.example.vehicles.Motorcycle;
import org.example.vehicles.PetrolCar;
import org.example.vehicles.Truck;
import org.example.vehicles.VehicleRegister;

public class Main {
  public static void main(String[] args) {
    //Creating TollPlaza.
    TollPlaza trondheimTollingPlaza = new TollPlaza("Trondheim Tolling Plaza", 1);

    //Creating VehicleRegister.
    VehicleRegister nationalVehicleRegister = VehicleRegister.getVehicleRegister();

    //Adding vehicles to the register.
    nationalVehicleRegister.addVehicle(new Motorcycle("UF 54321", 80));
    nationalVehicleRegister.addVehicle(new DieselCar("UF 12345", 120));
    nationalVehicleRegister.addVehicle(new PetrolCar("UG 12345", 145));
    nationalVehicleRegister.addVehicle(new Truck("HS 12345", 500));

    //Registering toll passages.
    trondheimTollingPlaza.registerTollPassage("UF 12345",
        LocalDate.of(2020, 05, 28), LocalTime.of(8, 59));

    trondheimTollingPlaza.registerTollPassage("UF 54321",
        LocalDate.of(2020, 05, 28), LocalTime.of(06, 30));

    trondheimTollingPlaza.registerTollPassage("UG 12345",
        LocalDate.of(2020, 05, 28), LocalTime.of(16, 29));

    trondheimTollingPlaza.registerTollPassage("HS 12345",
        LocalDate.of(2020, 05, 28), LocalTime.of(14, 30));

    //Printing out all registered toll passages.
    System.out.println(trondheimTollingPlaza.getTollPassageRegister().toString());

  }
}
