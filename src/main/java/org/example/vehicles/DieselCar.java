package org.example.vehicles;

/**
 * Diesel car.
 * Extends the vehicle class.
 * Has 19 kroners as non rush hour tax
 * Has 23 kroners as rush hour tax
 */
public final class DieselCar extends Vehicle{

  public DieselCar(String licensePlateNumber, int weightKilos) {
    super(licensePlateNumber, weightKilos);
    super.setNonRushHourTaxKr(19);
    super.setRushHourTaxKr(23);
  }
}
