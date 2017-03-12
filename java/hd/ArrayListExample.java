package hd;

import java.util.*;

public class ArrayListExample {
	
	
   public ArrayListExample() {
	  //String ArrayList
	  ArrayList<String> obj = new ArrayList<String>();

	  //add
	  obj.add("Gal"); 
	  obj.add("Uri"); 
	  obj.add("Michal"); 
	  obj.add("Noam"); 
	  obj.add("Avishay"); 

	  //dispay the all Obj array
	  System.out.println("Currently the array list has following elements:"+obj); //[Gal, Uri, Michal, Noam, Avishay]

	  //add in index
	  obj.add(0, "ori"); //Gal --> ori
	  obj.add(1, "Anat"); //Uri --> Anat

	  //remove
	  obj.remove("Michal");
	  obj.remove("Uri");
	  
	  //dispay the all Obj array
	  System.out.println("Current array list is:"+obj); // [Gal, Uri, Michal, Noam, Avishay]

	  //remove in index
	  obj.remove(1); //Anat

	  //dispay the all Obj array
	  System.out.println("Current array list is:"+obj); // [ori, Gal, Noam, Avishay]
   }
 
}