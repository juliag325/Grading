import java.io.*;
import java.util.*;

public class HighSchoolStudent extends Student {

	public HighSchoolStudent(String name, String id, String essay, ArrayList<String> errorList, String nameOfSchool) {
		super(name, id, essay, errorList);
		this.nameOfSchool = nameOfSchool; 
		}

	private String nameOfSchool; 
	
	
	public String getSchoolName() {
		return nameOfSchool; 
		
	}
	
	public void setSchoolName(String schoolName) { 
		this.nameOfSchool = schoolName; 
	}
	
	public void writeToFile() { 
		try{
		    PrintWriter writer = new PrintWriter(super.getId() + "_graded.txt");
		    writer.println("High School Student " + super.getName());
		    writer.println("Student ID: " + super.getId());
		    writer.println("School Name: " + getSchoolName());
		    writer.println(super.getPrintableErrorList());
		    writer.close();
		    
		} 
		
		catch (IOException e) {
		   
		}
	}

	
		
}
	

