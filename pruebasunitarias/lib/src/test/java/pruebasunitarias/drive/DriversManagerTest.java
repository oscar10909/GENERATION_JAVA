package pruebasunitarias.drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DriversManagerTest {

	private DriversManager driversManager = new DriversManager();
	
	@DisplayName("Pruebas  en el metodo addPassenger")
	@Test
	void isAddPassenger() {
		Passenger passenger1 = new Passenger("Oscar Sosa", "ABC123");
		//agrega pasajero
		driversManager.addPassenger(passenger1); 
		//verificar que pasajero este en coleccion, si si esta
		//me lo devuelve
		assertEquals(passenger1, driversManager.getPassenger("ABC123"));
	}
	
	@Test
	void isAddDriver() {
		Driver driver1 = new Driver("Oscar", "ABC125", 36.7);
		driversManager.addDriver(driver1);
		assertEquals(driver1, driversManager.getDriver("ABC125"));
	}

}
