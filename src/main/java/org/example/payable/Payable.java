package org.example.payable;

/**
 * Payable.
 * Interface that defines items that can pay.
 */
public interface Payable {

  /**
   * getLicensePlateNumber.
   * Gets the licence plate number.
   * @return String. The license plate number.
   */
  String getLicencePlateNumber();

  /**
   * getCost.
   * Gets the cost.
   *
   * @param withinRushHours defines if it is in rush hours.
   * @return int. The amount it costs.
   */
  int getCost(boolean withinRushHours);
}
