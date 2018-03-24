import java.util.Scanner;

public class Menu {

public static int MainScreen() {
Scanner in = new Scanner(System.in);

System.out.println("1. ADD CAR \n");
System.out.println("2. LIST CARDS \n");

return in.nextInt();
}

public static boolean Validator(int a) {
boolean isTrue = false;
while(isTrue = false) {
if(a == 1) isTrue = true;
if(a == 2) isTrue = true;
else isTrue = false;
}
return isTrue;
}
	
public static int carTypeScreen(){
Scanner in = new Scanner(System.in);
System.out.println("1. Family Car");
System.out.println("2. Bus");
System.out.println("3. Trucks");
System.out.println("4. Offroad");
System.out.println("5. Back");
return in.nextInt();
}
	
	
}
