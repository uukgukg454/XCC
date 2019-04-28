package learnspring;

import org.springframework.stereotype.Component;

@Component("Bikee")
public class Bike implements Vehicle {

	public void drive() {
		System.out.println("Driving Bike:::");
	}


}
