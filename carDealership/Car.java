package carDealership;

public abstract class Car {

	public enum Color {
		WHITE(1),
		BLACK(2),
		GREY(3),
		RED(4),
		BLUE(5);

		public int id;

		Color(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

	}

	public enum FuelType {
		GASOLINE(1), DIESEL(2);

		public int id;

		FuelType(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

	}

	public enum GearType {
		AUTOMATIC(1), MANUEL(2);

		public int id;

		GearType(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

	}

	public enum BodyType {
		SEDAN(1), HATCHBACK(2);

		public int id;

		BodyType(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

	}

	protected Color color;
	protected FuelType fuelType;
	protected GearType gearType;
	protected BodyType bodyType;
	protected int price;
	protected int numberOfGear;

	public Car(Color color, FuelType fuelType, GearType gearType, BodyType bodyType, int price, int numberOfGear) {
		this.color = color;
		this.fuelType = fuelType;
		this.gearType = gearType;
		this.bodyType = bodyType;
		this.price = price;
		this.numberOfGear = numberOfGear;
	}

	public void info() {
		System.out.println("Color: " + this.color);
		System.out.println("Fuel Type: " + this.fuelType);
		System.out.println("Gear Type: " + this.gearType);
		System.out.println("Body Type: " + this.bodyType);
		System.out.println("Number Of Gear: " + this.numberOfGear);
		System.out.println("Price: " + this.price + " $");
		System.out.println("------------------------");
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public GearType getGearType() {
		return gearType;
	}

	public void setGearType(GearType gearType) {
		this.gearType = gearType;
	}

	public BodyType getBodyType() {
		return bodyType;
	}

	public void setBodyType(BodyType bodyType) {
		this.bodyType = bodyType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumberOfGear() {
		return numberOfGear;
	}

	public void setNumberOfGear(int numberOfGear) {
		this.numberOfGear = numberOfGear;
	}

}
