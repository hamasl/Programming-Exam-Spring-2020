package org.example.vehicles;

/**
 * Motorcycle.
 * Extends the vehicle class.
 * Has 0 kroners as non rush hour tax
 * Has 0 kroners as rush hour tax
 */
public final class Motorcycle extends Vehicle {
  public Motorcycle(String licensePlateNumber, int weightKilos) {
    super(licensePlateNumber, weightKilos);
    super.setNonRushHourTaxKr(0);
    super.setRushHourTaxKr(0);
  }
}
