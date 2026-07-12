package com.collection.framework.set.day46;


import java.util.HashSet;
import java.util.Set; 

class Employe1 
{

}   // if override not  we call akchuwal functionality 
   // id is not here call object class

public class Drivar8a {

	public static void main(String[] args) {
		
		Set<Employe1>city = new HashSet <Employe1>(16);
		
		Employe1 em = new Employe1();
		Employe1 em2 = new Employe1(); // 
		
		System.out.println(em.hashCode()+"and"+em2.hashCode());

		
	}

}
