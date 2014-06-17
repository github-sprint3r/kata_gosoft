package kata.gosoft;

import java.util.HashMap;

public class RomanNumeric {

	public static String convert(int numberArabic) {
		String numberRoman = "";
	
		HashMap<Integer, String> romanHashMap = new HashMap<Integer, String>();
		romanHashMap.put(5, "V");
		romanHashMap.put(4, "IV");
		for(Integer key : romanHashMap.keySet()){
			if(numberArabic >= key){
				numberRoman = romanHashMap.get(key);
				numberArabic -= key;
				break;
			}
		}
		
//		if(numberArabic >= 5){
//			numberRoman = romanHashMap.get(5); 
//			int difference = numberArabic - 5 ;
//			for (int count = 0; count < difference; count++) {
//				numberRoman += "I";
//			}
//			
//		} else if (romanHashMap.containsKey(numberArabic)) {
//			numberRoman = romanHashMap.get(numberArabic);
//		} else {
			for (int count = 0; count < numberArabic; count++) {
				numberRoman += "I";
			}
//		}
		return numberRoman;
	}

}
