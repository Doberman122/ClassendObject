package org.example;

import java.util.Random;

public class Freelancer extends Employees{
    Double hourInDay;
    Double countDay;
    Double rubInhour;


    @Override
    public Double averMonthSalary() {
        setHourInDay(8.0);
        setCountDay(20.8);
        setRubInhour(350.2);
        return rubInhour * getCountDay() * getHourInDay();
    }

    @Override
    public String toString() {
        return "";
    }

    public Double getCountDay() {
        return countDay;
    }

    public void setCountDay(Double countDay) {
        this.countDay = countDay;
    }

    public Double getHourInDay() {
        return hourInDay;
    }

    public void setHourInDay(Double hourInDay) {
        this.hourInDay = hourInDay;
    }

    public Double getRubInhour() {
        return rubInhour;
    }

    public void setRubInhour(Double rubInhour) {
        this.rubInhour = rubInhour;
    }
}
