package zKingland;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class industryWords {
	 public static void industry() throws FileNotFoundException{ 
		 ArrayList<String> ag_mine = new ArrayList<>();		//89
		 ArrayList<String> constr = new ArrayList<>();		//90
		 ArrayList<String> edu = new ArrayList<>();			//91
		 ArrayList<String> eng_util = new ArrayList<>();	//92
		 ArrayList<String> ent_trav = new ArrayList<>();	//93
		 ArrayList<String> food = new ArrayList<>();		//94
		 ArrayList<String> health = new ArrayList<>();		//95
		 ArrayList<String> hotel_game = new ArrayList<>();	//96
		 ArrayList<String> man = new ArrayList<>();			//97
		 ArrayList<String> prof = new ArrayList<>();		//98
		 ArrayList<String> realEst = new ArrayList<>();		//99
		 ArrayList<String> retail = new ArrayList<>();		//100
		 ArrayList<String> tech = new ArrayList<>();		//101
		 ArrayList<String> trans = new ArrayList<>();		//102
		 ArrayList<String> whole = new ArrayList<>();		//103
		 ArrayList<String> nonProfit = new ArrayList<>();	//104
		 ArrayList<String> indiv = new ArrayList<>();		//107
		 
		 addTo("89", ag_mine);
		 addTo("90", constr);
		 addTo("91", edu);
		 addTo("92", eng_util);
		 addTo("93", ent_trav);
		 addTo("94", food);
		 addTo("95", health);
		 addTo("96", hotel_game);
		 addTo("97", man);
		 addTo("98", prof);
		 addTo("99", realEst);
		 addTo("100", retail);
		 addTo("101", tech);
		 addTo("102", trans);
		 addTo("103", whole);
		 addTo("104", nonProfit);
		 addTo("107", indiv);
		 
		}
	 
	 public static void addTo(String industry, ArrayList<String> temp) throws FileNotFoundException {
		 File file = new File("C:\\Users\\donald24\\Industry\\" + industry + ".txt");
		 Scanner in = new Scanner(file);
		 while (in.hasNextLine()){
			 temp.add(in.nextLine());
			 }
		}
}
