package attendance;

public class Student implements Attendee{
	
	private String firstName;
	private String lastName;
	private String reportString;
	
	/**In addition to the following methods, please include a 
	 * constructor that takes two parameters: firstName and lastName.
	 * Use these values to instantiate corresponding fields.
	 * @return
	 */
	
	//returns true if the student has been marked present, false otherwise
	public boolean isPresent(){
	    return true;
	    
	}

	//sets whether the student has been marked present
	public void setPresent(boolean present){
	    if(present){
	        
	    }
	    else{
	        
	    }
	}

	//returns the firstName
	public String getFirstName(){
	    return firstName;
	}

	//returns the lastNameName
	public String getLastName(){
	    return lastName;
	}

	//returns true if 'first' and 'last' match this Attendee's firstName and lastName. This should NOT be case sensitive. 
	public boolean mathces(String first, String last){
	    if(first.equals(firstName) && last.equals(lastName)){
	        return true;
	    }
	    else{
	        return false;
	    }
	}

	
	//returns true if 'first' matches this Attendee's firstName. This should NOT be case sensitive.
	public boolean matches(String last){
	    return true;
	}

	//returns three words separated by 20 spaces: 
	//at index 0, the last name
	//at index 20, the first name
	//at index 40, the word PRESENT or ABSENT
	//ADDED CHALLENGE:
	//if last name or first name is longer than 20 characters, 
	//cut off the last three letters and replace with "..."
	public String getReportString(){
	    return reportString;
	}
	

	
}

