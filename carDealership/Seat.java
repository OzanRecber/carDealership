package carDealership;

public class Seat extends Car {

	public enum ModelsSeat {
		LEON(1),
		IBIZA(2);

		public int id;

		ModelsSeat(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

	}

	private ModelsSeat model;

	public Seat(ModelsSeat model, Color color, FuelType fuelType, GearType gearType, BodyType bodyType,
			int numberOfGear) {
		super(color, fuelType, gearType, bodyType, calculatePrice(model, fuelType, gearType), numberOfGear);
		this.model = model;
	}

	private static int calculatePrice(ModelsSeat model, FuelType fuelType, GearType gearType) {
		if (model.equals(ModelsSeat.LEON)) {
			if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.AUTOMATIC)) {
				return 53000;
			} else if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.MANUEL)) {
				return 47000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.AUTOMATIC)) {
				return 55000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.MANUEL)) {
				return 50000;
			}
		} else if (model.equals(ModelsSeat.IBIZA)) {
			if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.AUTOMATIC)) {
				return 41000;
			} else if (fuelType.equals(FuelType.GASOLINE) && gearType.equals(GearType.MANUEL)) {
				return 37000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.AUTOMATIC)) {
				return 45000;
			} else if (fuelType.equals(FuelType.DIESEL) && gearType.equals(GearType.MANUEL)) {
				return 39000;
			}
		}
		return 0;
	}

	@Override
	public void info() {
		System.out.println("SEAT");
		System.out.println("Model: " + this.model);
		super.info();
	}

	public ModelsSeat getModel() {
		return model;
	}

	public void setModel(ModelsSeat model) {
		this.model = model;
	}

}
