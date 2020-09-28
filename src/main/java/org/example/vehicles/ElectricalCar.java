package org.example.vehicles;

/**
 * Electrical car.
 * Extends the vehicle class.
 * Has 4 kroners as non rush hour tax
 * Has 8 kroners as rush hour tax
 */
public final class ElectricalCar extends Vehicle{
  public ElectricalCar(String licensePlateNumber, int weightKilos) {
    super(licensePlateNumber, weightKilos);
    super.setNonRushHourTaxKr(4);
    super.setRushHourTaxKr(8);
  }
}
