package p42;

import java.util.Random;

public class p42 {

	public static void main(String[] args) {
		Random random = new Random();
		char znak=97;
		int liczba=0;
		String tekst="";
		for(int i=1;i<=10;i++)
		{
		liczba=random.nextInt(26)+97;
		znak=(char)liczba;
		System.out.print(znak);
		tekst+=znak;
		}
		
		System.out.println("\n"+tekst);
		
		System.out.println("HEY");
	}

}
