package carDealership;

public class Skoda extends Car {

	public enum ModelsSkoda {
		SUPERB(1),
		OCTAVIA(2),
		FABIA(3);

		public int id;

		ModelsSkoda(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

	}

	private ModelsSkoda model;

	public Skoda(ModelsSkoda model, Color color, FuelType fuelType, GearType gearType, BodyType bodyType,
			int numberOfGear) {
		super(color, fuelType, gearType, bodyType, calculatePrice(model, fuelType, gearType), numberOfGear);
		this.model = model;
	}

	private static int calculatePrice(ModelsSkoda model, FuelType fuelType, GearType gearType) {
		if (model.equals(ModelsSkoda.SUPERB)) {
			if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.AUTOMATIC)) {
				return 71000;
			} else if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.MANUEL)) {
				return 63000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.AUTOMATIC)) {
				return 77000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.MANUEL)) {
				return 69000;
			}
		} else if (model.equals(ModelsSkoda.OCTAVIA)) {
			if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.AUTOMATIC)) {
				return 55000;
			} else if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.MANUEL)) {
				return 50000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.AUTOMATIC)) {
				return 58000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.MANUEL)) {
				return 53000;
			}
		} else if (model.equals(ModelsSkoda.FABIA)) {
			if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.AUTOMATIC)) {
				return 39000;
			} else if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.MANUEL)) {
				return 35000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.AUTOMATIC)) {
				return 43000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.MANUEL)) {
				return 38000;
			}
		}
		return 0;
	}

	@Override
	public void info() {
		System.out.println("SKODA");
		System.out.println("Model: " + this.model);
		super.info();
	}

	public ModelsSkoda getModel() {
		return model;
	}

	public void setModel(ModelsSkoda model) {
		this.model = model;
	}

}
