package org.example.vehiclesTest;

import org.example.vehicles.PetrolCar;
import org.example.vehicles.Truck;
import org.example.vehicles.VehicleRegister;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * VehicleRegisterTest.
 * Junit test class to test methods in the VehicleRegister class.
 */
public class VehicleRegisterTest {
  //Junit demands that variables and setup methods are static
  private static VehicleRegister vehicles;


  /**
   * setup.
   * Gets the vehicle register before running the test class.
   */
  @BeforeClass
  public static void setup(){
    vehicles = VehicleRegister.getVehicleRegister();
  }

  /**
   * addVehicle_CorrectInput_True.
   * Test the addVehicle method by using a correct input.
   * Expected outcome is that the method returns true.
   */
  @Test
  public void addVehicle_CorrectInput_True(){
    Assert.assertTrue(vehicles.addVehicle(new PetrolCar("KT 89989", 100)));
  }


  /**
   * addVehicle_IllegalLicencePlateNumber_ThrowsIllegalArgumentException.
   * Test the addVehicle method by using an incorrect input.
   * Expected outcome is that the method throws an IllegalArgumentException.
   */
  @Test
  public void addVehicle_IllegalLicencePlateNumber_ThrowsIllegalArgumentException(){
    Assert.assertThrows(IllegalArgumentException.class, () -> {
      vehicles.addVehicle(new Truck("2345 UF", 300));
    });
  }
}
