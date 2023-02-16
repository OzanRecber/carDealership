package carDealership;

import java.util.*;
import carDealership.Audi.ModelsAudi;
import carDealership.Car.BodyType;
import carDealership.Car.Color;
import carDealership.Car.FuelType;
import carDealership.Car.GearType;
import carDealership.Seat.ModelsSeat;
import carDealership.Skoda.ModelsSkoda;
import carDealership.Volkswagen.ModelsVw;

public class main {

	public enum Transactions {
		VOLKSWAGEN(1),
		AUDI(2),
		SKODA(3),
		SEAT(4),
		EXIT(5);

		public int id;

		Transactions(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Car> carList = new ArrayList<Car>();
		while (true) {
			System.out.println("Choose:");
			for (Transactions t : Transactions.values()) {
				System.out.println(t + ": " + t.getId());
			}
			int choose = scan.nextInt();
			if (choose == Transactions.EXIT.getId()) {
				break;
			} else if (choose == Transactions.VOLKSWAGEN.getId()) {
				System.out.println("Model:");
				for (ModelsVw m : ModelsVw.values()) {
					System.out.println(m + ": " + m.getId());
				}
				int selectModel = scan.nextInt();
				ModelsVw selectedModel = null;
				for (ModelsVw m : ModelsVw.values()) {
					if (selectModel == m.getId()) {
						selectedModel = m;
					}
				}
				System.out.println("Color:");
				for (Color c : Color.values()) {
					System.out.println(c + ": " + c.getId());
				}
				int selectColor = scan.nextInt();
				Color selectedColor = null;
				for (Color c : Color.values()) {
					if (selectColor == c.getId()) {
						selectedColor = c;
					}
				}
				System.out.println("Fuel Type:");
				for (FuelType f : FuelType.values()) {
					System.out.println(f + ": " + f.getId());
				}
				int selectFuelType = scan.nextInt();
				FuelType selectedFuelType = null;
				for (FuelType f : FuelType.values()) {
					if (selectFuelType == f.getId()) {
						selectedFuelType = f;
					}
				}
				System.out.println("Gear Type:");
				for (GearType g : GearType.values()) {
					System.out.println(g + ": " + g.getId());
				}
				int selectGearType = scan.nextInt();
				GearType selectedGearType = null;
				for (GearType g : GearType.values()) {
					if (selectGearType == g.id) {
						selectedGearType = g;
					}
				}
				System.out.println("Body Type:");
				for (BodyType b : BodyType.values()) {
					System.out.println(b + ": " + b.getId());
				}
				int selectBodyType = scan.nextInt();
				BodyType selectedBodyType = null;
				for (BodyType b : BodyType.values()) {
					if (selectBodyType == b.getId()) {
						selectedBodyType = b;
					}
				}
				System.out.println("Number Of Gear:");
				int numberOfGear = scan.nextInt();
				Volkswagen v = new Volkswagen(selectedModel, selectedColor, selectedFuelType, selectedGearType,
						selectedBodyType, numberOfGear);
				carList.add(v);
			} else if (choose == Transactions.AUDI.getId()) {
				System.out.println("Model:");
				for (ModelsAudi m : ModelsAudi.values()) {
					System.out.println(m + ": " + m.getId());
				}
				int selectModel = scan.nextInt();
				ModelsAudi selectedModel = null;
				for (ModelsAudi m : ModelsAudi.values()) {
					if (selectModel == m.getId()) {
						selectedModel = m;
					}
				}
				System.out.println("Color:");
				for (Color c : Color.values()) {
					System.out.println(c + ": " + c.getId());
				}
				int selectColor = scan.nextInt();
				Color selectedColor = null;
				for (Color c : Color.values()) {
					if (selectColor == c.getId()) {
						selectedColor = c;
					}
				}
				System.out.println("Fuel Type:");
				for (FuelType f : FuelType.values()) {
					System.out.println(f + ": " + f.getId());
				}
				int selectFuelType = scan.nextInt();
				FuelType selectedFuelType = null;
				for (FuelType f : FuelType.values()) {
					if (selectFuelType == f.getId()) {
						selectedFuelType = f;
					}
				}
				System.out.println("Gear Type:");
				for (GearType g : GearType.values()) {
					System.out.println(g + ": " + g.getId());
				}
				int selectGearType = scan.nextInt();
				GearType selectedGearType = null;
				for (GearType g : GearType.values()) {
					if (selectGearType == g.id) {
						selectedGearType = g;
					}
				}
				System.out.println("Body Type:");
				for (BodyType b : BodyType.values()) {
					System.out.println(b + ": " + b.getId());
				}
				int selectBodyType = scan.nextInt();
				BodyType selectedBodyType = null;
				for (BodyType b : BodyType.values()) {
					if (selectBodyType == b.getId()) {
						selectedBodyType = b;
					}
				}
				System.out.println("Number Of Gear:");
				int numberOfGear = scan.nextInt();
				Audi a = new Audi(selectedModel, selectedColor, selectedFuelType, selectedGearType, selectedBodyType,
						numberOfGear);
				carList.add(a);
			} else if (choose == Transactions.SKODA.getId()) {
				System.out.println("Model:");
				for (ModelsSkoda m : ModelsSkoda.values()) {
					System.out.println(m + ": " + m.getId());
				}
				int selectModel = scan.nextInt();
				ModelsSkoda selectedModel = null;
				for (ModelsSkoda m : ModelsSkoda.values()) {
					if (selectModel == m.getId()) {
						selectedModel = m;
					}
				}
				System.out.println("Color:");
				for (Color c : Color.values()) {
					System.out.println(c + ": " + c.getId());
				}
				int selectColor = scan.nextInt();
				Color selectedColor = null;
				for (Color c : Color.values()) {
					if (selectColor == c.getId()) {
						selectedColor = c;
					}
				}
				System.out.println("Fuel Type:");
				for (FuelType f : FuelType.values()) {
					System.out.println(f + ": " + f.getId());
				}
				int selectFuelType = scan.nextInt();
				FuelType selectedFuelType = null;
				for (FuelType f : FuelType.values()) {
					if (selectFuelType == f.getId()) {
						selectedFuelType = f;
					}
				}
				System.out.println("Gear Type:");
				for (GearType g : GearType.values()) {
					System.out.println(g + ": " + g.getId());
				}
				int selectGearType = scan.nextInt();
				GearType selectedGearType = null;
				for (GearType g : GearType.values()) {
					if (selectGearType == g.id) {
						selectedGearType = g;
					}
				}
				System.out.println("Body Type:");
				for (BodyType b : BodyType.values()) {
					System.out.println(b + ": " + b.getId());
				}
				int selectBodyType = scan.nextInt();
				BodyType selectedBodyType = null;
				for (BodyType b : BodyType.values()) {
					if (selectBodyType == b.getId()) {
						selectedBodyType = b;
					}
				}
				System.out.println("Number Of Gear:");
				int numberOfGear = scan.nextInt();
				Skoda s = new Skoda(selectedModel, selectedColor, selectedFuelType, selectedGearType, selectedBodyType,
						numberOfGear);
				carList.add(s);
			} else if (choose == Transactions.SEAT.getId()) {
				System.out.println("Model:");
				for (ModelsSeat m : ModelsSeat.values()) {
					System.out.println(m + ": " + m.getId());
				}
				int selectModel = scan.nextInt();
				ModelsSeat selectedModel = null;
				for (ModelsSeat m : ModelsSeat.values()) {
					if (selectModel == m.getId()) {
						selectedModel = m;
					}
				}
				System.out.println("Color:");
				for (Color c : Color.values()) {
					System.out.println(c + ": " + c.getId());
				}
				int selectColor = scan.nextInt();
				Color selectedColor = null;
				for (Color c : Color.values()) {
					if (selectColor == c.getId()) {
						selectedColor = c;
					}
				}
				System.out.println("Fuel Type:");
				for (FuelType f : FuelType.values()) {
					System.out.println(f + ": " + f.getId());
				}
				int selectFuelType = scan.nextInt();
				FuelType selectedFuelType = null;
				for (FuelType f : FuelType.values()) {
					if (selectFuelType == f.getId()) {
						selectedFuelType = f;
					}
				}
				System.out.println("Gear Type:");
				for (GearType g : GearType.values()) {
					System.out.println(g + ": " + g.getId());
				}
				int selectGearType = scan.nextInt();
				GearType selectedGearType = null;
				for (GearType g : GearType.values()) {
					if (selectGearType == g.id) {
						selectedGearType = g;
					}
				}
				System.out.println("Body Type:");
				for (BodyType b : BodyType.values()) {
					System.out.println(b + ": " + b.getId());
				}
				int selectBodyType = scan.nextInt();
				BodyType selectedBodyType = null;
				for (BodyType b : BodyType.values()) {
					if (selectBodyType == b.getId()) {
						selectedBodyType = b;
					}
				}
				System.out.println("Number Of Gear:");
				int numberOfGear = scan.nextInt();
				Seat s = new Seat(selectedModel, selectedColor, selectedFuelType, selectedGearType, selectedBodyType,
						numberOfGear);
				carList.add(s);
			}

		}
		int total = 0;
		for (Car c : carList) {
			c.info();
			total += c.getPrice();
		}
		System.out.println("Total Amount: " + total + " $");
		scan.close();
	}

}
