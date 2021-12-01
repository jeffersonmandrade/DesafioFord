package entities;

public class CesarCode {
	
	
	
	public String criptogradia(String vin) {
		String encripted = "";
		
		for(int i = 0; i < vin.length();i++) {
			char caracter = vin.charAt(i);
			int valueChar = caracter + 3;
			encripted +=(char)valueChar;
		}
		return encripted;
	}

	public String descriptografia(String vin) {
	String decode = "";
	for(int i = 0; i < vin.length();i++) {
		char caracter = vin.charAt(i);
		int valueChar = caracter + 3;
		decode +=(char)valueChar;
	}
	return decode;
}
	
	
}
