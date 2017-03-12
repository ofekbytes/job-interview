package hd;

public class Hd {

//	public Hd() {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		
		//JavaBasic
	   JavaBasic jb = new JavaBasic();
	   int jbResult = jb.javaTryCatchFinally();
	   System.out.println("javaTryCatchFinally ---> jbResult === " + jbResult);
	   
	   
	   //count get/set calles
	   jb.CountGetSet();
	   jb.CountGetSet();	 
	   
	   
	   //ArrayListExample
	   System.out.println("\n ArrayListExample ");
	   //array lis
	   ArrayListExample ale = new ArrayListExample();
	   
	}

}
