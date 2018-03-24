import java.util.Scanner;

public class Flow {

	public static void start() {
		boolean exitFlag = false;
		do {
			System.out.println("------------------------------");
			int d = Menu.MainScreen();
			switch (d) {
			case 1:
				typeCarFlow();
			case 2:
				CarRepository.showCars();
				System.out.println();
				System.out.println("------------------------------");
				System.out.println();
			case 3:
				exitFlag = true;
			default:
			}
		} while (!exitFlag);

		System.exit(0);
	}

	private static void typeCarFlow() {
		int choice = Menu.carTypeScreen();
		CarDataWrapper c1;
		Scanner in = new Scanner(System.in);
		switch (choice) {
		case 1:
			c1 = CarDataWrapper.readMainParameters();
			System.out.println("Seat numbers: ");
			int seats = in.nextInt();
			FamilyCar fc = new FamilyCar(c1, seats);

		case 2:
			
			c1 = CarDataWrapper.readMainParameters();
			System.out.println("Seats number: ");
			int seat = in.nextInt();
			System.out.println("Standing places: ");
			int places = in.nextInt();
			System.out.println("lenght: ");
			double lenght = in.nextDouble();
			System.out.println("height: ");
			double height= in.nextDouble();
			Bus bs = new Bus(c1, seat, places, lenght, height);
		case 3:
		case 4:
		}
		
	}
	


}
