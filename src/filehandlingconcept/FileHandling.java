package filehandlingconcept;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandling {

	public static void main(String[] args) throws IOException {
     File f=new File("test1.txt");
     f.createNewFile();    
     // Write into the file using FileWriter
     FileWriter fw= new FileWriter(f);
     fw.write("Write using FileWriter\n");
     fw.write("My Name is sudeep\n");
     fw.write("My\n");
     fw.write("My Name is Khna\n");
     fw.write("My Name is Testing\n");
     fw.write("My Name is raj");
     fw.flush();
     
     
     //Write into the file using BufferedWriter  (it has the advantage of newLine() function for the line change ---we get rid of \n which is used in the FileWiter
     // the argument of the bufferedwriter() is a any writer object
     BufferedWriter bw= new BufferedWriter(fw);
     bw.newLine();
     bw.write("*******************************");
     bw.newLine();
     bw.write("Write using bufferedWriter");
     bw.newLine();
     bw.write("bufferedWriter Testing");
     bw.newLine();
     bw.write(" using file concert ");
     bw.flush();
     
     
     //Write into the file using the PrintWriter (it can accept both filename and writer object as their argument
     //it has the print() and println() function which will move to the next line automatically 
     //it is the most powerfull writer available in the java there is no need of the \n and newLine anymore.
     
     
     PrintWriter pw1= new PrintWriter(fw);
     pw1.println();
     pw1.println("*******************************");
     pw1.println("Write using printWriter");
     pw1.write("Testing write");
     pw1.println();
     pw1.println("Using print function");
     pw1.flush();
     pw1.close();
     
     /*PrintWriter pw2= new PrintWriter("test1.txt");
     pw2.append("Testing append func");
     pw2.println();
     pw2.println("tesifb usfkdnf");
     pw2.print("lestining music");
     pw2.flush();
     pw2.close();*/
     
     
     
     /*
      * Read the file using FileReader()
      * 
      */
     
     FileReader fr= new FileReader(f); 
     int ch= fr.read();
     while(ch!=-1) {
    	 System.out.print((char)ch);
    	 ch=fr.read();
    	 
     }
    
     BufferedReader br=new BufferedReader(fr);
     System.out.println("**************** Using BufferedReader**********************");
     String str=br.readLine();
     //String arr[]=str.split(" ");
     while(str!=null) {
    	 System.out.println(str);
    	 str=br.readLine();
     }
     br.close();
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     

	}

}
