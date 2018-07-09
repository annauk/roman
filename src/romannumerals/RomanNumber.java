package romannumerals;
import java.util.TreeMap;
public class RomanNumber implements RomanNumeralGenerator  {

	private static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

	static {
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");

	}
	@Override
	public  String generate(int number) {
		int l= map.floorKey(number);
		if ( number == l && number <= 3999) {
			return map.get(number);
		}
		return map.get(l) + generate(number-l);
	}
	@Override
	public void FinalResult() {
		
	}


}



