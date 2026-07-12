package com.Kodewala.String.heap.scp.day21;



public class QueryBuffer {

	public static void main(String[] args) {
		
		String employeeId = null; // null
		String salary = " 5000"; //null
		
	QueryBuffer builder = new QueryBuffer ();
	
	builder.generateSQL(employeeId, salary );

	}


public void generateSQL (String empId, String salary)
{
	StringBuffer query = new StringBuffer ("String firstName, String lastName from Employee where");
	
	if(empId !=null)
	{
		query.append("employeeId = "+empId);
	}
	else if(salary !=null)
	{
		query.append(" salary ="+ salary);
	}
	else
	{
	query.append("String firstName, String lastName from Employee where ");	
	}
	query.append(" ,");
	
	System.out.println("Final Query is "+query);
}
}