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
				return 1350000;
			} else if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.MANUEL)) {
				return 1200000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.AUTOMATIC)) {
				return 1450000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.MANUEL)) {
				return 1300000;
			}
		} else if (model.equals(ModelsSkoda.OCTAVIA)) {
			if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.AUTOMATIC)) {
				return 1050000;
			} else if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.MANUEL)) {
				return 9500000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.AUTOMATIC)) {
				return 1100000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.MANUEL)) {
				return 1000000;
			}
		} else if (model.equals(ModelsSkoda.FABIA)) {
			if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.AUTOMATIC)) {
				return 750000;
			} else if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.MANUEL)) {
				return 675000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.AUTOMATIC)) {
				return 825000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.MANUEL)) {
				return 725000;
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
