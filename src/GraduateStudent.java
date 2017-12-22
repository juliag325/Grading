import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GraduateStudent extends Student {
	
	public GraduateStudent(String name, String id, String essay, ArrayList<String> errorList, String advisor, String major) {
		super(name, id, essay, errorList);
		this.advisor = advisor; 
		this.major = major; 
	}

	private String theMajor; 
	private String theAdvisor;
	private String advisor; 
	private String major; 
	
	public String getMajor() { 
		return major; 
	}
	
	public void setMajor(String major) { 
		this.major = theMajor; 
	}
	
	public String getAdvisor() { 
		return advisor; 
	}
	
	public void setAdvisor(String advisor) { 
		this.advisor = theAdvisor; 
	}
	
	public void writeToFile() { 
		try{
		    PrintWriter writer = new PrintWriter(super.getId() + "_graded.txt");
		    writer.println("Graduate Student " + super.getName());
		    writer.println("Student ID: " + super.getId());
		    writer.println("Advisor " + getAdvisor());
		    writer.println("Major " + getMajor());
		    writer.println(super.getPrintableErrorList());
		    writer.close();
		    
		} 
		
		catch (IOException e) {
		   
		}
	}
	
	
}
