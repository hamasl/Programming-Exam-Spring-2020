package org.example.vehicles;

/**
 * Truck.
 * Extends the vehicle class.
 * Has 86 kroners as non rush hour tax
 * Has 101 kroners as rush hour tax
 */
public final class Truck extends Vehicle{
  public Truck(String licensePlateNumber, int weightKilos) {
    super(licensePlateNumber, weightKilos);
    super.setNonRushHourTaxKr(86);
    super.setRushHourTaxKr(101);
  }
}
