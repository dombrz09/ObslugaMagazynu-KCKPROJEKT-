package projekcik;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class CSV_TO_ARRAY {
	
	static String[][] chemia;
	static String[][] nabia³;
	static String[][] miêso;
	static String[][] owoce;
	static String[][] pieczywo;
	static String[][] warzywa;
	
	static void Create_Arrays()
	{
		chemia = new String[37][2];
		nabia³ = new String[34][6];
		miêso = new String[29][6];
		owoce = new String[47][6];
		pieczywo = new String[25][6];
		warzywa = new String[53][6];
		
		Scanner scanIn = null;
		int Rowc = 0;
		String InputLine = "";
		
		String chemiafileLocation;
		String nabia³fileLocation;
		String miêsofileLocation;
		String owocefileLocation;
		String pieczywofileLocation;
		String warzywafileLocation;
		
		//Poni¿sze œcie¿ki to czêœæ, która siê nie zmienia nigdy, czyli miejsce plików CSV w projekcie.
		chemiafileLocation = "\\src\\projekcik\\chemia.csv";
		nabia³fileLocation = "\\src\\projekcik\\nabia³.csv";
		miêsofileLocation = "\\src\\projekcik\\miêso.csv";
		owocefileLocation = "\\src\\projekcik\\owoce.csv";
		pieczywofileLocation = "\\src\\projekcik\\pieczywo.csv";
		warzywafileLocation = "\\src\\projekcik\\warzywa.csv";
	
		
		//Tutaj pobieramy œcie¿kê do naszego projektu, a nastêpnie ³¹czymy go ze œcie¿k¹ do konkretnego pliku CSV.
		String dana=chemiafileLocation;
		String filePath = new File("").getAbsolutePath();
		filePath = filePath.concat(dana);
		System.out.println(filePath);
		
		try
		{
			for(int z=0; z<6; z++)
			{
				if(z==1) 
					{
						dana=nabia³fileLocation;
						filePath = new File("").getAbsolutePath();
						filePath = filePath.concat(dana);
					}
				if(z==2) 
					{
						dana=miêsofileLocation;
						filePath = new File("").getAbsolutePath();
						filePath = filePath.concat(dana);
					}
				if(z==3) 
					{
						dana=owocefileLocation;
						filePath = new File("").getAbsolutePath();
						filePath = filePath.concat(dana);
					}
				if(z==4) 
					{
						dana=pieczywofileLocation;
						filePath = new File("").getAbsolutePath();
						filePath = filePath.concat(dana);
					}
				if(z==5)
					{
						dana=warzywafileLocation;
						filePath = new File("").getAbsolutePath();
						filePath = filePath.concat(dana);
					}
				
				scanIn = new Scanner(new BufferedReader(new FileReader(filePath)));
				Rowc=0;
				while (scanIn.hasNextLine())
				{
					InputLine = scanIn.nextLine();
					
					String[] InArray = InputLine.split(";");
					
					
					for (int x = 0; x < InArray.length; x++)
					{
						if(z==0) chemia[Rowc][x] = (InArray[x]);
						else if(z==1) nabia³[Rowc][x] = (InArray[x]);
						else if(z==2) miêso[Rowc][x] = (InArray[x]);
						else if(z==3) owoce[Rowc][x] = (InArray[x]);
						else if(z==4) pieczywo[Rowc][x] = (InArray[x]);
						else if(z==5) warzywa[Rowc][x] = (InArray[x]);
					}
					
					Rowc++;
					
				}

			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	

	public static void main(String[] args) {
		Create_Arrays();
		
		// WYŒWIETLANIE WYBRANEJ TABLICY
		for(int i=0; i< chemia.length; i++){
		    for(int j=0; j< chemia[i].length; j++)
		        System.out.print(chemia[i][j] + " ");
		    System.out.println();
		}
	}

}