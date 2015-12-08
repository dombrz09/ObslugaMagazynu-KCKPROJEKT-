package obslugamagazynu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class dane {
	
	static String[][] chemia;
	static String[][] nabiał;
	static String[][] mięso;
	static String[][] owoce;
	static String[][] pieczywo;
	static String[][] warzywa;
        
        static int chemiarozmiar;
        static int nabiałrozmiar;
	static int mięsorozmiar;
        static int owocerozmiar;
        static int pieczyworozmiar;
        static int warzywarozmiar;
                
	static void Create_Arrays()
	{
		chemiarozmiar=37;
		chemia = new String[chemiarozmiar][2];
                nabiałrozmiar=34;
		nabiał = new String[nabiałrozmiar][6];
                mięsorozmiar=29;
		mięso = new String[mięsorozmiar][6];
                owocerozmiar=47;
		owoce = new String[owocerozmiar][6];
                pieczyworozmiar=25;
		pieczywo = new String[pieczyworozmiar][6];
                warzywarozmiar=53;
		warzywa = new String[warzywarozmiar][6];
		
		Scanner scanIn = null;
		int Rowc = 0;
		String InputLine = "";
		
		String chemiafileLocation;
		String nabiałfileLocation;
		String mięsofileLocation;
		String owocefileLocation;
		String pieczywofileLocation;
		String warzywafileLocation;
		
		chemiafileLocation = "C:\\Users\\chemia.csv";
		nabiałfileLocation = "C:\\Users\\nabiał.csv";
		mięsofileLocation = "C:\\Users\\mięso.csv";
		owocefileLocation = "C:\\Users\\owoce.csv";
		pieczywofileLocation = "C:\\Users\\pieczywo.csv";
		warzywafileLocation = "C:\\Users\\warzywa.csv";
		
		String dana=chemiafileLocation;
		
		try
		{
			for(int z=0; z<6; z++)
			{
				if(z==1) dana=nabiałfileLocation;
				else if(z==2) dana=mięsofileLocation;
				else if(z==3) dana=owocefileLocation;
				else if(z==4) dana=pieczywofileLocation;
				else if(z==5) dana=warzywafileLocation;
				
				scanIn = new Scanner(new BufferedReader(new FileReader(dana)));
				Rowc=0;
				while (scanIn.hasNextLine())
				{
					InputLine = scanIn.nextLine();
					
					String[] InArray = InputLine.split(";");
					
					
					for (int x = 0; x < InArray.length; x++)
					{
						if(z==0) chemia[Rowc][x] = (InArray[x]);
						else if(z==1) nabiał[Rowc][x] = (InArray[x]);
						else if(z==2) mięso[Rowc][x] = (InArray[x]);
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
}