package com.collection.framework.comperatorandcomperable.set.day50;

import java.util.TreeSet;

class Employee11 implements Comparable<Employee11>
{
    int salary;
    String name;

    public Employee11(int _salary, String _name)
    {
        this.salary = _salary;
        this.name = _name;
    }

    @Override
    public int compareTo(Employee11 o2)
    {
        // First compare names
        int result = this.name.compareTo(o2.name);

        // If names are same, compare salaries
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

public class Drivar11
{
    public static void main(String[] args)
    {
        Employee11 e1 = new Employee11(120000, "rohit");
        Employee11 e2 = new Employee11(90000, "shubham");
        Employee11 e3 = new Employee11(130000, "ajhar");
        Employee11 e4 = new Employee11(40000, "someone");
        Employee11 e5 = new Employee11(100000, "rohit");
        Employee11 e6 = new Employee11(80000, "ajhar");

        TreeSet<Employee11> ts = new TreeSet<Employee11>();

        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);
        ts.add(e6);

        System.out.println("Sorted Employee Details:");

        for(Employee11 emp : ts)
        {
            System.out.println(emp.name + " and " + emp.salary);
        }
    }
}

// 1st Priority: Name (A → Z)
// 2nd Priority: Salary (Low → High) when names are the same.