package com.javacode;

/*public class Constr {

	public static void main(String[] args) {
Modifair s = new Modifair();
Modif m = new Modif ();
s.brand();
m.model();

//System.out.println(s.brand);
//System.out.println(m.model);

	}

}

//import com.javacode.Modifair;

public class Constr{
	public static void main(String[]args) {
		Modifair m = new Modifair ();
		
		System.out.println(m.name);
		System.out.println(m.id);
	}
}

public class Constr{
	public static void main(String[]args) {
		Modifair m = new Modifair();
		m.accessPin();
	}
}

public class Constr{
	public static void main(String []args) {
		Modifair t = new Modifair();
		t.tech();
	}
}


class User {
	public static  int totallivesUsers = 0;
	
	private String name;
	
	public  User(String name) {
		this.name = name;
		totallivesUsers = totallivesUsers +1;
	}
}

public class Constr {
	public static void main (String [] args) {
		
		User u1 =  new User("Ram");
		User u2 =  new User ("Mohan");
		User u3 =  new User ("Rohan");
		
		System.out.print("Total live viswer : "+User.totallivesUsers);
	}
}

*/

class Employee {
    
    String empName;
    String empId;
    
    static int count = 1;   
    
    
    Employee(String name) {
        empName = name;
        empId = "Kodewala-" + count;
        count++;
    }
    
    
    void display() {
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee ID   : " + empId);
        System.out.println("--------------------------");
    }
}

public class Constr {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Rahul");
        Employee e2 = new Employee("Priya");
        Employee e3 = new Employee("Aman");
        
        e1.display();
        e2.display();
        e3.display();
    }
}
