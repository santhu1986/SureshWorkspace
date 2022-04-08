package com.ebanking.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//Instance Class
		
				Library LB=new Library();
				
				String Rval=LB.OpenApp("http://122.175.8.158/ranford2");
				System.out.println(Rval);
				LB.AdminLgn("Admin","Te$ting@");
				Rval=LB.Branches();
			    System.out.println(Rval);

	}

}
