package org.example;

import java.util.Random;

public class Worker extends Employees{

    Random random = new Random();

    @Override
    public Double averMonthSalary() {
      //  return random.nextDouble(30000.0, 80000.0);
        return 30000.0;
    }
}
