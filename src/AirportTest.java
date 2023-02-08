import model.Plane;
import service.PlaneService;

import java.util.Scanner;

public class AirportTest {

    public static void main(String[] args) {


        Plane plane = new Plane();

        Plane p1 = new Plane();
        Plane p2 = new Plane();
        Plane p3 = new Plane();

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please input the model of the plane");
        String model = scanner.next();
        p1.setModel(model);
        System.out.println("Please input country the plane belongs to");
        String country = scanner.next();
        p1.setCountry(country);
        System.out.println("Please input year of production");
        int year = scanner.nextInt();
        p1.setYear(year);
        System.out.println("Please input hours in air");
        int hours = scanner.nextInt();
        p1.setHours(hours);
        System.out.println("Please input if the plane is military or not");
        boolean isMilitary = scanner.nextBoolean();
        p1.setMilitary(isMilitary);
        System.out.println("Please input weight of the plane");
        double weight = scanner.nextDouble();
        p1.setWeight(weight);
        System.out.println("Please input wingspan of the plane");
        double wingspan = scanner.nextDouble();
        p1.setWingspan(wingspan);
        System.out.println("Please input the maximum speed of the plane");
        int topSpeed = scanner.nextInt();
        p1.setTopSpeed(topSpeed);
        System.out.println("Please input number of seats");
        int seats = scanner.nextInt();
        p1.setSeats(seats);
        System.out.println("Please input the cost of the plane");
        double cost = scanner.nextDouble();
        p1.setCost(cost);

        System.out.println("Please input the model of the plane");
        String model2 = scanner.next();
        p2.setModel(model2);
        System.out.println("Please input country the plane belongs to");
        String country2 = scanner.next();
        p2.setCountry(country2);
        System.out.println("Please input year of production");
        int year2 = scanner.nextInt();
        p2.setYear(year2);
        System.out.println("Please input hours in air");
        int hours2 = scanner.nextInt();
        p2.setHours(hours2);
        System.out.println("Please input if the plane is military or not");
        boolean isMilitary2 = scanner.nextBoolean();
        p2.setMilitary(isMilitary2);
        System.out.println("Please input weight of the plane");
        double weight2 = scanner.nextDouble();
        p2.setWeight(weight2);
        System.out.println("Please input wingspan of the plane");
        double wingspan2 = scanner.nextDouble();
        p2.setWingspan(wingspan2);
        System.out.println("Please input the maximum speed of the plane");
        int topSpeed2 = scanner.nextInt();
        p2.setTopSpeed(topSpeed2);
        System.out.println("Please input number of seats");
        int seats2 = scanner.nextInt();
        p2.setSeats(seats2);
        System.out.println("Please input the cost of the plane");
        double cost2 = scanner.nextDouble();
        p2.setCost(cost2);



        System.out.println("Please input the model of the plane");
        String model3 = scanner.next();
        p3.setModel(model3);
        System.out.println("Please input country the plane belongs to");
        String country3 = scanner.next();
        p3.setCountry(country3);
        System.out.println("Please input year of production");
        int year3 = scanner.nextInt();
        p3.setYear(year3);
        System.out.println("Please input hours in air");
        int hours3 = scanner.nextInt();
        p3.setHours(hours3);
        System.out.println("Please input if the plane is military or not");
        boolean isMilitary3 = scanner.nextBoolean();
        p3.setMilitary(isMilitary3);
        System.out.println("Please input weight of the plane");
        double weight3 = scanner.nextDouble();
        p3.setWeight(weight3);
        System.out.println("Please input wingspan of the plane");
        double wingspan3 = scanner.nextDouble();
        p3.setWingspan(wingspan3);
        System.out.println("Please input the maximum speed of the plane");
        int topSpeed3 = scanner.nextInt();
        p3.setTopSpeed(topSpeed3);
        System.out.println("Please input number of seats");
        int seats3 = scanner.nextInt();
        p3.setSeats(seats3);
        System.out.println("Please input the cost of the plane");
        double cost3 = scanner.nextDouble();
        p3.setCost(cost3);

        
        PlaneService planeservice = new PlaneService();
        Plane [] planes = {p1, p2, p3};
        planeservice.Task1(p1);
        planeservice.Task2(p3);
        planeservice.Task3(p1,p2);
        planeservice.Task4(p1,p2);
        planeservice.Task5(p1,p2,p3);
        planeservice.Task6(planes);
        planeservice.Task7(planes);
        planeservice.Task8(planes);
        planeservice.Task9(planes);
        planeservice.Task10(planes);

    }
}
