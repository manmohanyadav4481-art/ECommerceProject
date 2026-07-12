package com.collection.framework.comperatorandcomperable.set.day50;

// both compare name and salary

import java.util.TreeSet;

class Employee9 implements Comparable<Employee9>
{
    int salary;
    String name;

    public Employee9(int _salary, String _name)
    {
        super();
        this.salary = _salary;
        this.name = _name;
    }

    @Override
    public int compareTo(Employee9 o2)
    {
        // Compare by name
        int result = this.name.compareTo(o2.name);

        // If names are same, compare by salary
        if(result == 0)
        {
            return this.salary - o2.salary;
        }

        return result;
    }

    @Override
    public String toString()
    {
        return name + " " + salary;
    }
}

public class Drivar9
{
    public static void main(String[] args)
    {
        Employee9 e1 = new Employee9(120000, "rohit");
        Employee9 e2 = new Employee9(90000, "shubham");
        Employee9 e3 = new Employee9(130000, "ajhar");
        Employee9 e4 = new Employee9(40000, "someone");
        Employee9 e5 = new Employee9(100000, "rohit");

        TreeSet<Employee9> ts = new TreeSet<Employee9>();

        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);

        System.out.println(ts);

        System.out.println("\nEmployee Details:");
        for(Employee9 emp : ts)
        {
            System.out.println(emp.name + " and " + emp.salary);
        }
    }
}