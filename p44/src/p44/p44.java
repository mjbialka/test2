package p44;

public class p44 {

	public static void main(String[] args) {
		
		//napisac każda z literek z osobna, przedzieloną przecinkiem
		//niech w kazdym słowie zsumuje ilosc liter a (ile wystapi w danym słowie)
		
		String tab[]=new String[3];
		tab[0]="Kasia";
		tab[1]="janek";
		tab[2]="ola";

		
	
		for(int i=0;i<tab.length;i++)
		{
			for(int x=0;x<tab[i].length();x++)
			{
				System.out.print(tab[i].charAt(x)+", ");
			}
			System.out.print("\n");
			
		}
		int LiteraA = 0;
		
		for(int i=0;i<tab.length;i++)
		{
			LiteraA=0;
			for (int x=0;x<tab[i].length();x++) 
			{
				if (tab[i].charAt(x) == 'a'){
					LiteraA++;
				}
		}
			System.out.print("\n litera 'a' wystepuje " + LiteraA + " razy w słowie ");
			System.out.print(tab[i]);
	}
		

}
}