package convertertemperatura;

public class Celcius {
	private double temperatura;
	
	public Celcius(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public double getTemperatura() {
		return temperatura;
	}
	
	public Fahrenheit converteParaFarenheit() {
		double fahrenheit = (temperatura * 1.8)+32;
		return new Fahrenheit(fahrenheit);
	}
}
