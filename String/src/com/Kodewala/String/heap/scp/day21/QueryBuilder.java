package com.Kodewala.String.heap.scp.day21;



public class QueryBuilder {

	public static void main(String[] args) {
		
		String employeeId = null; // null
		String salary = "5000"; //null
		
	QueryBuilder builder = new QueryBuilder ();
	
	builder.generateSQL(employeeId, salary );

	}


public void generateSQL (String empId, String salary)
{
	StringBuilder query = new StringBuilder ("String firstName, String lastName from Employee where");
	
	if(empId !=null)
	{
		query.append("employeeId = "+empId);
	}
	else if(salary !=null)
	{
		query.append("salary ="+salary);
	}
	else
	{
	query.append("String firstName, String lastName from Employee where");	
	}
	query.append(",");
	
	System.out.println("final Query is"+query);
}
}
