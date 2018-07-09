package romannumerals;

public class Main{

	public static void  main (String[] args) {
			
		//Initialise with instance of an object in this case class RomanNumber.
				RomanNumeralGenerator obj1 = new RomanNumber();
				for (int i =1; i<=3999; i++) {
					if(i==1 || i==5 || i==10 || i==20 || i==3999)
						System.out.println(i+" = "+'"'+ obj1.generate(i)+'"');
		
	}
}
}