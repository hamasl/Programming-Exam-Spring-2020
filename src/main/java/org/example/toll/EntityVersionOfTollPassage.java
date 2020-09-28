package org.example.toll;

import java.time.LocalDate;
import java.time.LocalTime;

public final class TollPassage {
  private final int TOLL_PLAZA_ID;
  private final String PASSING_VEHICLE_LICENSE_PLATE_NUMBER;
  private final int COST;
  private final LocalTime TIME_OF_PASSING;
  private final LocalDate DATE_OF_PASSING;

  public TollPassage(int TOLL_PLAZA_ID, String PASSING_VEHICLE_LICENSE_PLATE_NUMBER, int COST, LocalTime TIME_OF_PASSING, LocalDate DATE_OF_PASSING) {
    //Only stood whole number in the task description, but a negative id does not ake any sense.
    if(TOLL_PLAZA_ID < 1) throw new IllegalArgumentException("Invalid toll plaza ID");
    this.TOLL_PLAZA_ID = TOLL_PLAZA_ID;
    this.PASSING_VEHICLE_LICENSE_PLATE_NUMBER = PASSING_VEHICLE_LICENSE_PLATE_NUMBER;
    this.COST = COST;
    this.TIME_OF_PASSING = TIME_OF_PASSING;
    this.DATE_OF_PASSING = DATE_OF_PASSING;
  }

  @Override
  public String toString() {
    return "TollPassage:" +
        "\nTOLL_PLAZA_ID: " + TOLL_PLAZA_ID +
        "\nPASSING_VEHICLE_LICENSE_PLATE_NUMBER: " + PASSING_VEHICLE_LICENSE_PLATE_NUMBER +
        "\nCOST: " + COST +
        "\nTIME_OF_PASSING: " + TIME_OF_PASSING +
        "\nDATE_OF_PASSING: " + DATE_OF_PASSING;
  }
}
