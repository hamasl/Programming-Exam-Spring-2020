package org.example.toll;

import java.time.LocalDate;
import java.time.LocalTime;
import org.example.payable.Payable;
import org.example.vehicles.VehicleRegister;

/**
 * TollPlaza.
 * A toll plaza containing a name, ID, toll passage register and vehicle register.
 */
public final class TollPlaza {
  private final String NAME;
  private final int ID;
  private final TollPassageRegister tollPassageRegister = new TollPassageRegister();
  //Static since there only exists one register.
  private static VehicleRegister vehicleRegister  = VehicleRegister.getVehicleRegister();

  public TollPlaza(String NAME, int ID) {
    this.NAME = NAME;
    this.ID = ID;
  }

  public TollPassageRegister getTollPassageRegister() {
    return tollPassageRegister;
  }

  public boolean registerTollPassage(String licencePlateNumber, LocalDate date, LocalTime time){

    Payable vehicle = vehicleRegister.getVehicle(licencePlateNumber);

    //Assigned the boolean expressions to variables to increase readability.
    //Also using one minute less on isAfter and one minute more on isBefore to include edge cases.
    boolean withinEarlyRushHour = time.isAfter(LocalTime.of(6,29)) && time.isBefore(LocalTime.of(9,0));
    boolean withinLateRushHour = time.isAfter(LocalTime.of(14,29)) && time.isBefore(LocalTime.of(16,30));
    boolean withinRushHours = (withinEarlyRushHour || withinLateRushHour);

    return tollPassageRegister.addTollPassage(ID, licencePlateNumber, vehicle.getCost(withinRushHours), time, date);
  }
}
