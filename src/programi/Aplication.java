package programi;

import java.util.Scanner;

import entities.CesarCode;
import entities.Hexadecimal;

public class Aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o vin: ");
		String vin= sc.next();
		sc.nextLine();
		System.out.println("Criptografas ou descriptografar? (c/d)");
		String metodo= sc.nextLine();
		CesarCode cesar = new CesarCode();
		if(metodo == "c") {
		String passo1 =	cesar.criptogradia(vin);
		Hexadecimal hex = new Hexadecimal();
		String result = hex.changeForHexa(passo1);
		System.out.println(result);
		}else {
			String passo2 =	cesar.descriptografia(vin);
			Hexadecimal hex = new Hexadecimal();
			String result = hex.changeDecimal(passo2);
			System.out.println(result);
		}
		cesar.descriptografia(vin);
		sc.close();
	
	}

}
