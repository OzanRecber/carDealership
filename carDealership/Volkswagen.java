package carDealership;

public class Volkswagen extends Car {

	public enum ModelsVw {
		PASSAT(1),
		GOLF(2),
		POLO(3);

		public int id;

		ModelsVw(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

	}

	private ModelsVw model;

	public Volkswagen(ModelsVw model, Color color, FuelType fuelType, GearType gearType, BodyType bodyType,
			int numberOfGear) {
		super(color, fuelType, gearType, bodyType, calculatePrice(model, fuelType, gearType), numberOfGear);
		this.model = model;
	}

	private static int calculatePrice(ModelsVw model, FuelType fuelType, GearType gearType) {
		if (model.equals(ModelsVw.PASSAT)) {
			if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.AUTOMATIC)) {
				return 1400000;
			} else if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.MANUEL)) {
				return 1250000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.AUTOMATIC)) {
				return 1500000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.MANUEL)) {
				return 1350000;
			}
		} else if (model.equals(ModelsVw.GOLF)) {
			if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.AUTOMATIC)) {
				return 1050000;
			} else if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.MANUEL)) {
				return 9500000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.AUTOMATIC)) {
				return 1100000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.MANUEL)) {
				return 1000000;
			}
		} else if (model.equals(ModelsVw.POLO)) {
			if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.AUTOMATIC)) {
				return 775000;
			} else if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.MANUEL)) {
				return 700000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.AUTOMATIC)) {
				return 850000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.MANUEL)) {
				return 750000;
			}
		}
		return 0;
	}

	@Override
	public void info() {
		System.out.println("VOLKSWAGEN");
		System.out.println("Model: " + this.model);
		super.info();
	}

	public ModelsVw getModel() {
		return model;
	}

	public void setModel(ModelsVw model) {
		this.model = model;
	}

}
