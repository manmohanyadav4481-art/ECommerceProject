package com.collection.framework.compreableandcomperator.Set.day50;

import java.util.Comparator;

public class FirstNameComperator implements Comparator <Employee>
{

	@Override
	public int compare(Employee arg0, Employee arg1) {
		
		return arg0.firstName.compareTo(arg1.lastName);
	}

}
// do sorting the those class object