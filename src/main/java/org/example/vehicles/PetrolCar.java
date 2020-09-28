package org.example.vehicles;

/**
 * Petrol car.
 * Extends the vehicle class.
 * Has 17 kroners as non rush hour tax
 * Has 21 kroners as rush hour tax
 */
public final class PetrolCar extends Vehicle{

  public PetrolCar(String licensePlateNumber, int weightKilos) {
    super(licensePlateNumber, weightKilos);
    super.setNonRushHourTaxKr(17);
    super.setRushHourTaxKr(21);
  }
}
