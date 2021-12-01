package entities;

public class Hexadecimal {
	
	
	public String changeForHexa(String parte1) {
		String encript = "";
		
				for (int i=0;i< parte1.length();i++) {
					
					char caracter = parte1.charAt(i);
					encript +=  Integer.toHexString(caracter);
				}
		return encript;
		
	}
	
	public String changeDecimal(String parte2) {
		String decript = "";
		for (int i=0;i< parte2.length();i += 16) {
			String  caracter = parte2;
			decript  +=   Integer.parseInt(caracter, 16);
		}
		return decript ;
	}

}