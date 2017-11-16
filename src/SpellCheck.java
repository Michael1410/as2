import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

public class SpellCheck {
	/**
	  Reads all words from a file.
	  @param filename the name of the file
	  @return a set with all lowercased words in the file. Here, a
	  word is a sequence of upper- and lowercase letters.
	  */
	  public static Set<String> readWords(String inputfilename)
	  throws FileNotFoundException
	  {
	  Set<String> words = new HashSet<>();
	  Scanner console = new Scanner(new File(inputfilename));
	  console.useDelimiter("[^a-zA-Z]+");
	  while (console.hasNext())
	  {
	  words.add(console.next().toLowerCase());
	  }
	  return words;
}
	 public static void main(String args[])
		 throws FileNotFoundException{
	 //Create two arraylists, one containing dictionary words the other containing bonk words 
		 Set<String> dictionaryWords = readWords("dict");
		 Scanner scan = new Scanner(System.in);
		 String textfilename = scan.next();
		 Set<String> documentWords = readWords(textfilename);
		 
		 //Check if text file words and dictionary words are contained
		 for (String word : documentWords)
			  {
			  if (!dictionaryWords.contains(word))
			  {
			  System.out.println(word);
			  }
			  }
			  }
			 
			  
}