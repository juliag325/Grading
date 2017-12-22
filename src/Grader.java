import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Grader {

	private boolean available;
	private Student student;
	private Dictionary dict;
	private ArrayList<String> dictionary = new ArrayList<>();
	private ArrayList<String> fileContentArrayList;
	

	

	public Grader(Dictionary dict) {
		this.dict = dict;

	}

	public boolean gradeStudent(String fileName) {
		File eFile = new File(fileName);
	    ArrayList<String> essay = new ArrayList<>(); 
	    
	    Scanner input = new Scanner (fileName); 
	    
	 	
	    	String id;
	    	String name;
	    	String nameOfSchool;
	    	String major;
	 		String advisor;
	 		String student;
	 		ArrayList<String> errorList = new ArrayList<String>(); 
	 		
	    
	        try { 
	        	
	        	student = input.next(); 
	        	name = input.next(); 
	        	id= input.next();
	        	nameOfSchool = input.next(); 
	        	String essayFile; 
	        	
	        			
	        	
	           
				BufferedReader in = new BufferedReader(new FileReader(new File(fileName)));
			
	            
				
				String studentType = null; 
				if (studentType.equalsIgnoreCase("HighSchool Student")) { 
					
					for (int i = 0; i < essay.size(); i++) { 
						((Appendable) essay).append(input.next()); 
						essayFile = input.next(); 
						essayFile = essayFile.replace(".", " "); 
						essayFile = essayFile.replace("?"," "); 
						essayFile = essayFile.replace("!", " "); 
						essayFile = essayFile.replaceAll("()", " "); 
						
						if (!essay.get(i).equals(dict)) {
							errorList.add(essayFile);  
							
							
						
						
						}
					}
				} 
			
				
				else if (studentType.equalsIgnoreCase("Undergraduate Student")) { 
					major = input.next(); 
					
					for (int i= 0; i < essay.size(); i++) { 
						((Appendable) essay).append(input.next()); 
						essayFile = input.next(); 
						essayFile = essayFile.replace(".", " "); 
						essayFile = essayFile.replace("?"," "); 
						essayFile = essayFile.replace("!", " "); 
						essayFile = essayFile.replaceAll("()", " "); 
						
						if (!essay.get(i).equals(dict)) { 
							errorList.add(essayFile); 
							
						
						}
					} 
				} 
				
				else if (studentType.equalsIgnoreCase("Graduate Student")) { 
					major = input.next(); 
					advisor = input.next(); 
					
					for (int i = 0; i < essay.size(); i++) { 
						((Appendable) essay).append(input.next()); 
						essayFile = input.next(); 
						essayFile = essayFile.replace(".", " "); 
						essayFile = essayFile.replace("?"," "); 
						essayFile = essayFile.replace("!", " "); 
						essayFile = essayFile.replaceAll("()", " "); 
						
						if (!essay.get(i).equals(dict)) { 
							errorList.add(essayFile); 
							
							
						}
					} 
				
				} 
	        } 
	       
	                
	                
	         catch (IOException ex)
	        {
	           
	        }
	    
	
	        return true; 
		
	}

	public boolean isAvailable() {
		if (student == null && available == true) {
			return true;
		}

		else {
			return false;
		}
	}

	public Student getStudent() {
		return student;

	}

	public void reset() {
		student = null;
		available = true;
	}

}
