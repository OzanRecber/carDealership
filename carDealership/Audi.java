package carDealership;

public class Audi extends Car {

	public enum ModelsAudi {
		A3(1),
		A4(2),
		A5(3);

		public int id;

		ModelsAudi(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

	}

	private ModelsAudi model;

	public Audi(ModelsAudi model, Color color, FuelType fuelType, GearType gearType, BodyType bodyType,
			int numberOfGear) {
		super(color, fuelType, gearType, bodyType, calculatePrice(model, fuelType, gearType), numberOfGear);
		this.model = model;
	}

	private static int calculatePrice(ModelsAudi model, FuelType fuelType, GearType gearType) {
		if (model.equals(ModelsAudi.A3)) {
			if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.AUTOMATIC)) {
				return 55000;
			} else if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.MANUEL)) {
				return 50000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.AUTOMATIC)) {
				return 58000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.MANUEL)) {
				return 53000;
			}
		} else if (model.equals(ModelsAudi.A4)) {
			if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.AUTOMATIC)) {
				return 74000;
			} else if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.MANUEL)) {
				return 66000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.AUTOMATIC)) {
				return 79000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.MANUEL)) {
				return 71000;
			}
		} else if (model.equals(ModelsAudi.A5)) {
			if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.AUTOMATIC)) {
				return 79000;
			} else if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.MANUEL)) {
				return 71000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.AUTOMATIC)) {
				return 85000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.MANUEL)) {
				return 77000;
			}
		}
		return 0;
	}

	@Override
	public void info() {
		System.out.println("AUDI");
		System.out.println("Model: " + this.model);
		super.info();
	}

	public ModelsAudi getModel() {
		return model;
	}

	public void setModel(ModelsAudi model) {
		this.model = model;
	}

}
