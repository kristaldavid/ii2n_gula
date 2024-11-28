import java.util.Scanner;

public class Pyramid {
    public void startCalc(){
    System.out.println("gúla térfogat számítása");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("oldal: ");
        String sideStr = sc.nextLine();
        Double side= Double.parseDouble(sideStr);

        System.out.println("Magasság: ");
        String heightStr = sc.nextLine();
        Double height = Double.parseDouble(heightStr);

        Double volume = 1.0/3.0* Math.pow(side, 2)*height;
        System.out.printf("Térfogat: %f\n", volume);
        sc.close();

    }
}
