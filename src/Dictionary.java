import java.io.*;
import java.util.*;



public class Dictionary {
	
	
	int vocabSize; 

private ArrayList<String> dictionary = new ArrayList<>();
	


public int getVocabularySize() {
	
	return dictionary.size(); 
	
	

}

public boolean loadDictionaryFromFile(String filePath) {
	File file = new File(filePath);  
	if (file.exists()) { 
		try { 
			Scanner input = new Scanner(file); 
			while (input.hasNext()) { 
				String word = input.next(); 
				dictionary.add(word); 
			}
			return true; 
		}
		
		catch (FileNotFoundException ex) { 
			ex.printStackTrace(); 
		}
	} 
		return false; 
	}

		


public boolean isWord(String word) { 
	for (int i = 0; i < dictionary.size(); i++) { 
		if (dictionary.get(i).equals(word)) { 
			return true; 
		}
	}
	
	return false; 
	} 
} 
	
	




	

