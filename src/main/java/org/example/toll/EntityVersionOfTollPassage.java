package org.example.toll;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TollPassage")
public final class EntityVersionOfTollPassage implements Serializable {

  @Id
  @Column(name = "tollPlazaId", unique = true)
  private int tollPlazaId;

  @Column(name = "vehicleLicencePlateNumber" )
  private String passingVehicleLicencePlateNumber;

  @Column(name = "cost")
  private int cost;

  @Column(name = "timeOfPassing")
  private LocalTime timeOfPassing;

  @Column(name = "dateOfPassing")
  private LocalDate dateOfPassing;

  public EntityVersionOfTollPassage() {
  }

  public EntityVersionOfTollPassage(int tollPlazaId, String passingVehicleLicencePlateNumber, int cost, LocalTime timeOfPassing, LocalDate dateOfPassing) {
    //Only stood whole number in the task description, but a negative id does not ake any sense.
    if(tollPlazaId < 1) throw new IllegalArgumentException("Invalid toll plaza ID");
    this.tollPlazaId = tollPlazaId;
    this.passingVehicleLicencePlateNumber = passingVehicleLicencePlateNumber;
    this.cost = cost;
    this.timeOfPassing = timeOfPassing;
    this.dateOfPassing = dateOfPassing;
  }

  public int getTollPlazaId() {
    return tollPlazaId;
  }

  public void setTollPlazaId(int tollPlazaId) {
    this.tollPlazaId = tollPlazaId;
  }

  public String getPassingVehicleLicencePlateNumber() {
    return passingVehicleLicencePlateNumber;
  }

  public void setPassingVehicleLicencePlateNumber(String passingVehicleLicencePlateNumber) {
    this.passingVehicleLicencePlateNumber = passingVehicleLicencePlateNumber;
  }

  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  public LocalTime getTimeOfPassing() {
    return timeOfPassing;
  }

  public void setTimeOfPassing(LocalTime timeOfPassing) {
    this.timeOfPassing = timeOfPassing;
  }

  public LocalDate getDateOfPassing() {
    return dateOfPassing;
  }

  public void setDateOfPassing(LocalDate dateOfPassing) {
    this.dateOfPassing = dateOfPassing;
  }

  @Override
  public String toString() {
    return "TollPassage:" +
        "\nTOLL_PLAZA_ID: " + tollPlazaId +
        "\nPASSING_VEHICLE_LICENSE_PLATE_NUMBER: " + passingVehicleLicencePlateNumber +
        "\nCOST: " + cost +
        "\nTIME_OF_PASSING: " + timeOfPassing +
        "\nDATE_OF_PASSING: " + dateOfPassing;
  }
}
