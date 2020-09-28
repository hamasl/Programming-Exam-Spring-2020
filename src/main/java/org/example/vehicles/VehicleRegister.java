package org.example.vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.example.payable.Payable;

/**
 * VehicleRegister.
 * Contains a register of vehicles.
 * Uses lazy initialization singleton pattern to only allow one VehicleRegister instance.
 */
public final class VehicleRegister {
  private static VehicleRegister vehicleRegister;
  private final List<Vehicle> VEHICLE_LIST = new ArrayList<>();

  /**
   * VehicleRegister constructor.
   * Private to force the creation of a VehicleRegister instance to go through the getVehicleRegister method.
   */
  private VehicleRegister(){}

  /**
   * getVehicleRegister.
   * Gets a VehicleRegister instance.
   * If the VehicleRegister is null then it also creates a new instance.
   *
   * @return VehicleRegister.
   */
  public static VehicleRegister getVehicleRegister(){
    if(vehicleRegister == null){
      vehicleRegister = new VehicleRegister();
    }
    return vehicleRegister;
  }

  /**
   * addVehicle.
   * Adds a vehicle to the register.
   * If it is not already registered.
   *
   * @param vehicle the vehicle to be added.
   * @return true / false. Base on a successful outcome.
   */
  public boolean addVehicle(Vehicle vehicle){
    if (VEHICLE_LIST.contains(vehicle)) return false;
    VEHICLE_LIST.add(vehicle);
    return true;
  }

  /**
   * getVehicle.
   * Gets the vehicle in the register with matching license plate number.
   *
   * @param licensePlateNumber the license plate number belonging to the car.
   * @return Vehicle. The vehicle with matching license plate number.
   */
  public Vehicle getVehicle(String licensePlateNumber){
    return VEHICLE_LIST.stream().filter(p -> p.getLicencePlateNumber().equals(licensePlateNumber)).findAny().orElse(null);
  }

  /**
   * getVehiclesByLowerWeightLimit.
   * Gets the vehicles that weigh more than the weight limit.
   *
   * @param lowerWeightLimit the weight that the vehicles have to be above.
   * @return List of Vehicle. A list containing the vehicles which matched the demands.
   */
  public List<Vehicle> getVehiclesByLowerWeightLimit(int lowerWeightLimit){
    return VEHICLE_LIST.stream().filter(p -> p.getWeightKilos() > lowerWeightLimit).collect(Collectors.toList());
  }

}
