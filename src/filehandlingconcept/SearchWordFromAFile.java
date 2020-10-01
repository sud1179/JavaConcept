package filehandlingconcept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// Testing
public class SearchWordFromAFile {

	public static void main(String[] args) throws IOException {
		File f= new File("test1.txt");
		BufferedReader br= new BufferedReader(new FileReader(f));
		String s=br.readLine();
		
		while(s!=null) {
			String str[]= s.split(" ");
			for(String st:str) {
				if(st.equals("sudeep")) {
					System.out.println(st+" is found in this doc");
				}
			}
			s=br.readLine();
		}

	}

}
