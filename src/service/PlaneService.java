package service;

import model.Plane;

public class PlaneService {

    public void Task1(Plane plane){
        System.out.println("Name of the plane: " + plane.getModel());
        System.out.println("The country the plane belongs to: " + plane.getCountry());
        System.out.println("Year of production: " + plane.getYear());
        System.out.println("Hours in air: " + plane.getHours());
        System.out.println("Is this plane military plane? " + (plane.isMilitary()?"Yes":"No"));
        System.out.println("The weight of the plain: " + plane.getWeight());
        System.out.println("The maximum extent across the wings of the plane: " + plane.getWingspan());
        System.out.println("Maximal speed per hours: " + plane.getTopSpeed());
        System.out.println("Number of seats: " + plane.getSeats());
        System.out.println("Cost of the plane: " + plane.getCost());
    }

    public void Task2(Plane plane){
        if(plane.isMilitary()){
            System.out.println("Top speed is: " + plane.getTopSpeed());
            System.out.println("Cost of the plane is: " + plane.getCost());
        } else {
            System.out.println("Model of the plane: " + plane.getModel());
            System.out.println("Country of production: " + plane.getCountry());
        }
    }

    public Plane Task3(Plane p1, Plane p2){
        if(p1.getYear()>=p2.getYear()){
            return p1;
        } else {
            return p2;
        }
    }

    public String Task4(Plane p1, Plane p2){
        if(p1.getWingspan()>p2.getWingspan()){
            return p1.getModel();
        } else if (p1.getWingspan()==p2.getWingspan()){
            return p2.getModel();
        } else {
            return p2.getModel();
        }
    }

    public void Task5(Plane p1, Plane p2, Plane p3){
        if((p1.getSeats()>p2.getSeats() && p1.getSeats()>p3.getSeats()) || (p1.getSeats()==p2.getSeats() && p2.getSeats()==p3.getSeats())){
            System.out.println(p1.getCountry());
        } else if (p2.getSeats()>p1.getSeats() && p2.getSeats()> p3.getSeats()){
            System.out.println(p2.getCountry());
        } else {
            System.out.println(p3.getCountry());
        }

    }

    public void Task6(Plane [] planes){
        for (int i = 0; i < planes.length; i++) {
            if(planes[i]!=null && !planes[i].isMilitary()){
                Task1(planes[i]);
                System.out.println();
            }
        }
    }

    public void Task7(Plane [] planes){
        for (int i = 0; i < planes.length; i++) {
            if(planes[i]!=null && planes[i].isMilitary() && planes[i].getHours()>100){
                Task1(planes[i]);
                System.out.println();
            }
        }
    }

    public Plane Task8(Plane [] planes){
        Plane minimal = planes[0];
        int index = 0;
        for (int i = 1; i < planes.length; i++) {
            if(planes[i]!=null && planes[i].getWeight()>minimal.getWeight()){
                minimal=planes[i];
                index = i;
            }
        }

        for (int i = index+1; i < planes.length; i++) {
            if((planes[i]!=null && minimal!=null) && planes[i].getWeight()==minimal.getWeight()){
               minimal=planes[i];
            }
        }
        return minimal;
    }

    public Plane Task9(Plane [] planes){
        Plane planeWithMinCost = planes[0];
        for (int i = 0; i < planes.length; i++) {
           if((planes[i]!=null && planeWithMinCost!=null) && planes[i].getCost()<planeWithMinCost.getCost()){
               planeWithMinCost = planes[i];
           }
        }
        return planeWithMinCost;
    }

    public void Task10(Plane [] planes){


        for (int i = 0; i < planes.length-1; i++) {
            for (int j = i+1; j <planes.length ; j++) {
                if((planes[i]!=null && planes[j]!=null) && planes[i].getYear()>planes[j].getYear()){
                    Plane temp = planes[j];
                    planes[j] = planes[i];
                    planes[i] = temp;
                }
            }
        }

        for (Plane x: planes){
            if(x!=null){
                Task1(x);
                System.out.println();
            }
        }
    }
}
