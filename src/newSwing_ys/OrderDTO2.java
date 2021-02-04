package newSwing_ys;

public class OrderDTO2 {
	
	
	private String drink;
	private String temperature;
	private String size;
	private String shot;
	
	public OrderDTO2() {}
	
	public OrderDTO2(String drink, String temperature, String size, String shot) {
		super();
		this.drink = drink;
		this.temperature = temperature;
		this.size = size;
		this.shot = shot;
		
	}
	
	
	@Override
	public String toString() {
		return "OrderDTO2 [drink=" + drink + ", temperature=" + temperature + ", size=" + size + ", shot=" + shot + "]";
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getShot() {
		return shot;
	}

	public void setShot(String shot) {
		this.shot = shot;
	}



	
	




}
