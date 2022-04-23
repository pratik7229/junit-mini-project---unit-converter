package converter;

public class function_class {
	
	
	
	public double degree_to_fahrenheit(double cel) {
		double fa = cel * 1.8 +32;
		return fa;
	}


	public double degree_to_kelvin(double cel) {
		double ke = cel + 273.15;
		return ke;
	}
	public double meter_to_cm(double meter) {
		double cm = meter * 100;
		return cm;
	}
	public double meter_to_km(double meters) {
		double kms = meters * 1000;
		return kms;
	}
	public double km_to_miles(double km) {
		double miles = km * 0.621371;
		return miles;
	}
}
