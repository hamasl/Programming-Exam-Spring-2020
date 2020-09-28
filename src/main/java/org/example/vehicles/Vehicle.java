package org.example.vehicles;

import java.util.Objects;
import org.example.payable.Payable;

/**
 * Vehicle
 * Abstract class representing a Vehicle with a license plate, weight in kilos,
 * and non rush and rush hour taxes in norwegian kroners.
 */
public abstract class Vehicle implements Payable {
  //Did not put these as final, since:
  //Licence plates can be changed.
  //Weight can change when modifying or repairing a car.
  //Taxes always change.
  private String licencePlateNumber;
  private int weightKilos;
  private int nonRushHourTaxKr;
  private int rushHourTaxKr;

  /**
   * isValidLicencePlateNumber.
   * Checks if the licence plate number is of the format: AA 11111
   *
   * @param licencePlateNumber the licence plate number to be checked
   * @return true / false. Based on the format of the licence plate number
   */
  private boolean isValidLicencePlateNumber(String licencePlateNumber){
    String capitalLetters = licencePlateNumber.substring(0,2);
    String numbers = licencePlateNumber.substring(3);
    for (int i = 0; i < capitalLetters.length(); i++){
      if (!Character.isUpperCase(capitalLetters.charAt(i)) ) return false;
    }
    for (int i = 0; i < numbers.length(); i++){
      if(!Character.isDigit(numbers.charAt(i))) return false;
    }
    return Character.isSpaceChar(licencePlateNumber.charAt(2));
  }

  /**
   * Vehicle constructor. Takes a license plate number and weights in kilos.
   *
   * @param licencePlateNumber the license plate number in  the format UF 39486.
   * @param weightKilos the cars weight in kilos. A positive whole number.
   * @throws IllegalArgumentException if the license plate number  and weight does not meet requirements.
   */
  public Vehicle(String licencePlateNumber, int weightKilos) throws IllegalArgumentException{
    if (weightKilos < 0) {
      throw new IllegalArgumentException("Weight has to be a positive whole number");
    }
    if (licencePlateNumber == null ||licencePlateNumber.trim().length() != 8 || !isValidLicencePlateNumber(licencePlateNumber)){
      throw new IllegalArgumentException("License plate number can not be null, and has to be of format \"AA 11111\"");
    }
    this.licencePlateNumber = licencePlateNumber;
    this.weightKilos = weightKilos;
  }

  //Did not add javadoc to getters and setters sicne they're standar and self exlpanitory.

  @Override
  public String getLicencePlateNumber() {
    return licencePlateNumber;
  }

  public void setLicencePlateNumber(String licencePlateNumber) {
    this.licencePlateNumber = licencePlateNumber;
  }

  public int getWeightKilos() {
    return weightKilos;
  }

  public void setWeightKilos(int weightKilos) {
    this.weightKilos = weightKilos;
  }

  public int getNonRushHourTaxKr() {
    return nonRushHourTaxKr;
  }

  public void setNonRushHourTaxKr(int nonRushHourTaxKr) {
    this.nonRushHourTaxKr = nonRushHourTaxKr;
  }

  public int getRushHourTaxKr() {
    return rushHourTaxKr;
  }

  public void setRushHourTaxKr(int rushHourTaxKr) {
    this.rushHourTaxKr = rushHourTaxKr;
  }

  /**
   * The cost to pass a toll ring depending on the child class, and if it is rush hour or not.
   *
   * @param withinRushHours if it is rush hours: 06-30 - 08.59 and 14:30 - 16:29 is rush hours.
   * @return int. The price to when passing the toll ring.
   */
  public int getCost(boolean withinRushHours){
    return (withinRushHours) ? rushHourTaxKr : nonRushHourTaxKr;
  }

  /**
   * equals.
   * Checks if two vehicles are equal by matching their licence plate numbers.
   *
   * @param o an instance of the Object class.
   * @return true / false. Depending on the vehicles equality.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Vehicle)) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(licencePlateNumber, vehicle.licencePlateNumber);
  }

  /**
   * hashCode.
   * Generates a hashcode for a vehicle based on its licence plate number.
   *
   * @return int hasCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(licencePlateNumber);
  }
}
