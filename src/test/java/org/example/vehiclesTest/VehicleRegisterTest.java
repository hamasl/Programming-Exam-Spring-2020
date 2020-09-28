import org.example.vehicles.DieselCar;
import org.example.vehicles.Vehicle;
import org.junit.BeforeClass;

public class VehicleRegisterTest {
  @BeforeClass
  void setup(){
    Vehicle v1 = new DieselCar();
  }
}
