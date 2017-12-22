import java.io.*;
import java.util.*;

public class UndergraduateStudent extends Student {
	
	public UndergraduateStudent(String name, String id, String essay, ArrayList<String> errorList, String major) {
		super(name, id, essay, errorList);
		this.major = major; 
	}

	private String major; 
	
	public String getMajor () { 
		return major; 
	}
	
	public void setMajor (String major) { 
		this.major = major; 
	}
	
	public void writeToFile() { 
		try{
		    PrintWriter writer = new PrintWriter(super.getId() + "_graded.txt");
		    writer.println("Undergraduate Student " + super.getName());
		    writer.println("Student ID: " + super.getId());
		    writer.println("Major " + getMajor());
		    writer.println(super.getPrintableErrorList());
		    writer.close();
		    
		} 
		
		catch (IOException e) {
		   
		}
	}
	
	
	}


