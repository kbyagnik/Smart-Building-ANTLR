package a.b.c;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;
import org.antlr.runtime.*;

public class Controller {
	public static void main(String args[]) throws RecognitionException
	{
		System.out.println("Started Reading grammer... \n\n");
		System.out.println(">>>>> SMART BUILDING EMULATOR <<<<<<\n");			
		
		StringBuffer sb = new StringBuffer();

		try {
		    BufferedReader fileReader = new BufferedReader(new FileReader("/home/master/Desktop/CSL202/ANTLR/input"));
		    String s;
		    while ((s=fileReader.readLine())!=null) {
		            sb.append(s);  sb.append("\n\t");	    }
		    fileReader.close();		 } 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();	} 
		catch (IOException e) {
			e.printStackTrace(); } 
		finally{ }
		
			try{
			    String input=sb.toString();
			    System.out.println("___________INPUT GRAMMAR FILE ___________\n\t"+input+"\n______________OUTPUT FILE ___________________\n");
			    	GrammerLexer lexer = new GrammerLexer(new ANTLRStringStream(input));				    
			    	CommonTokenStream tokens = new CommonTokenStream(lexer);
				    GrammerParser parser = new GrammerParser(tokens);
				 	parser.start();	    }
			
			catch (Exception e){
			      System.err.println("Error: " + e.getMessage());  }
			finally{    }
			
			System.out.println("\n>>>>>>>>>>>> DONE <<<<<<<<<<<<\n");
	}
}