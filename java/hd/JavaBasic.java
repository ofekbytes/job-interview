package hd;

public class JavaBasic {
	
	private final int constNumber = 10;

	public static int intCountGet = 0;
	public static int intCountSet = 0;
	public int intluckNumber = 0;
	
	
	
	public JavaBasic() {
	}

		//javaTryCatchFinally - try..catch..finally - example.
		public int javaTryCatchFinally()
		{
			int i = 11;
			if (i == 11)
			{
				try {
					System.out.println(0);
			        return 0;
			    }
				catch (Exception e) {
					System.out.println("catch");
					return 1;
				}
			    finally {
			        System.out.println("finally allways execute.");
			        return 2;
			    }
			}
				
			return 3;		
		}

		
		
		public int getIntluckNumber() {
			intCountGet++;
			return intluckNumber;
		}


		public void setIntluckNumber(int intluckNumber) {
			intCountSet++;
			this.intluckNumber = intluckNumber;
		}
		
		
		//CountGetSet() - count the get/set call. 	
		public void CountGetSet()
		{
			setIntluckNumber(22);
			getIntluckNumber ();
			getIntluckNumber (); 
			
			System.out.println("setIntluckNumber === " + intCountGet + "getIntluckNumber === " + intCountSet);
		}
		
}
