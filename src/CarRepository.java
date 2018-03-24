import java.util.ArrayList;

public class CarRepository {

static ArrayList<Car> carList = new ArrayList<Car>();

public static void showCars() {
for(Car c: carList) {
System.out.print(c.toString());	
}
}



}
