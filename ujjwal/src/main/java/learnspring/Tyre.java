package learnspring;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	private String brand;

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	
	public Tyre(String brand)
	{
		this.brand=brand;
	}
	
	public Tyre()
	{
		System.out.println("no arg constructor::");
	}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
