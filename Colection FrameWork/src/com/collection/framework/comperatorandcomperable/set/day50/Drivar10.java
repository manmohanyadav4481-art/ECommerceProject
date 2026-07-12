package com.collection.framework.comperatorandcomperable.set.day50;

import java.util.TreeSet;

class Employee10 implements Comparable<Employee10>
{
    int salary;
    String name;

    public Employee10(int _salary, String _name)
    {
        super();
        this.salary = _salary;
        this.name = _name;
    }
    @Override
    public int compareTo(Employee10 o2)
    {
        if(this.salary == o2.salary)
        {
            return this.name.compareTo(o2.name);
        }

        return this.salary - o2.salary;
    }

    
    @Override
    public String toString()
    {
        return name + " " + salary;
    }
}

public class Drivar10
{
    public static void main(String[] args)
    {
        Employee10 e1 = new Employee10(120000, "rohit");
        Employee10 e2 = new Employee10(90000, "shubham");
        Employee10 e3 = new Employee10(130000, "ajhar");
        Employee10 e4 = new Employee10(40000, "someone");
        Employee10 e5 = new Employee10(100000, "rohit");

        TreeSet<Employee10> ts = new TreeSet<Employee10>();

        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);

        System.out.println(ts);

        System.out.println("\nEmployee Details:");
        for(Employee10 emp : ts)
        {
            System.out.println(emp.name + " and " + emp.salary);
        }
    }
}

//2nd Priority: Salary (Low → High) when names are the same.
// 1st Priority: Name (A → Z)