package zKingland;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 * This class is used for HTML parsing from URL using Jsoup.
 * @author Andrew Schwartz
 */

public class Scraper {
	public static void main(String args[]){
		print("running...");
		Document document;
		Document test;
		
		Connection connection = Jsoup.connect("https://www.dnb.com/");
		try {
			//Get Document object after parsing the html from given url.
			connection.timeout(100*1000);
			document = Jsoup.connect("https://www.dnb.com/business-directory/company-profiles.tesla_inc.e337e93c824d992066152d1a14d8d8e8.html").get();
			test = connection.data("button", "Tesla").post();
			//test = connection.data("text", "Tesla").post();
			
			String title = test.title(); //Get title
			print("  Title: " + title); //Print title.
			
			Elements aElem = document.getElementsByClass("company_summary");
			String para =  aElem.text();
			print("  Info: " + para); 

		} catch (IOException e) {
			e.printStackTrace();
		}
		print("done");
	}

	public static void print(String string) {
		System.out.println(string);
	}
}