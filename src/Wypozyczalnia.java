import java.util.Collections;

public class Wypozyczalnia {

public static void main(String[] args) {

FamilyCar familyCar = new FamilyCar("audi", 2000, 200, "blue", "a4", 20, "ee", 40);

Collections.sort(CarRepository.carList, new CarComparator1());
Flow.start();
//


}
	
}

