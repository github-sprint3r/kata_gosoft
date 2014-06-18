package kata.gosoft;

import java.util.ArrayList;

public class RomanNumeric {
	static ArrayList<ArabicRoman> arabicRomanList = new ArrayList<ArabicRoman>() {
		{
			add(new ArabicRoman(10, "X"));
			add(new ArabicRoman(5, "V"));
			add(new ArabicRoman(4, "IV"));
		}
	};

	public static String convert(int numberArabic) {
		String numberRoman = "";
		ArabicRoman arabicRoman = searchArabicRoman(arabicRomanList,
				numberArabic);

		if (arabicRoman != null) {
			numberRoman = arabicRoman.getValue();
			numberArabic -= arabicRoman.getKey();
		}

		for (int count = 0; count < numberArabic; count++) {
			numberRoman += "I";
		}
		return numberRoman;
	}

	private static ArabicRoman searchArabicRoman(
			ArrayList<ArabicRoman> arabicRomanList, int numberArabic) {
		for (ArabicRoman key : arabicRomanList) {
			if (numberArabic >= key.getKey()) {
				return key;
			}
		}
		return null;
	}

}

class ArabicRoman {
	private int key;
	private String value;

	public ArabicRoman(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
