package org.example;

public abstract class Employees {
    /**
     * id работника
     */
    protected int id;

    /**
     * name работника
     */
    protected String name;

    /**
     * age работника
     */
    protected int age;

    /**
     * salary работника
     */
    protected double salary;

    public abstract Double averMonthSalary();
    public  String toString(){
        return String.format("\n %10d \t %10s \t %10s \t %10.2f", id, name, age, salary);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
