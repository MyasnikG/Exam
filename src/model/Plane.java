package model;

public class Plane {

    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean isMilitary;

    private double weight;
    private double wingspan;
    private int topSpeed;
    private int seats;
    private double cost;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>=1903 && year<=2022){
            this.year = year;
        } else if (year<1903) {
              this.year = 1903;
        } else if(year>2022){
            this.year = 2022;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours>=0 && hours<=10000){
            this.hours = hours;
        } else if (hours<0){
            this.hours=0;
        } else if (hours>10000){
            this.hours=10000;
        }
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight>=10000 && weight<=160000) {
            this.weight = weight;
        } else if (weight<10000){
            this.weight=10000;
        } else if (weight>160000){
            this.weight=160000;
        }

    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        if(wingspan>=10 && wingspan<=45){
            this.wingspan = wingspan;
        } else if(wingspan<10){
            this.wingspan=10;
        } else if (wingspan>45){
            this.wingspan=45;
        }

    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if(topSpeed>0){
            this.topSpeed = topSpeed;
        }else {
            this.topSpeed=0;
        }

    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if(seats>0){
            this.seats = seats;
        } else {
            this.seats=0;
        }

    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost>0){
            this.cost = cost;
        } else {
            this.cost=0;
        }

    }
}
