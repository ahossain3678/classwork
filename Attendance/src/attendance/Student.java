
package attendance;

public class Student implements Attendee{
	
	private String firstName;
	private String lastName;
	private boolean isHere;
	
	/**In addition to the following methods, please include a 
	 * constructor that takes two parameters: firstName and lastName.
	 * Use these values to instantiate corresponding fields.
	 * @return
	 */
	 
	 public Student(String first, String last){
		this.firstName = first;
		this.lastName = last;
	}
	
	//returns true if the student has been marked present, false otherwise
	public boolean isPresent(){
	    if(isHere){
	    	return true;
	    }
	    else{
	    	return false;
	    }
	}

	//sets whether the student has been marked present
	public void setPresent(boolean present){
	    this.isHere = present;
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
	    if(first.toLowerCase().equals(firstName.toLowerCase()) && last.toLowerCase().equals(lastName.toLowerCase())){
	        return true;
	    }
	    else{
	        return false;
	    }
	}

	
	//returns true if 'last' matches this Attendee's lastName. This should NOT be case sensitive.
	public boolean matches(String last){
	    if(last.toLowerCase().equals(lastName.toLowerCase())){
	    	return true;
	    }
	    else{
	    	return false;
	    }
	}

	//returns three words separated by 20 spaces: 
	//at index 0, the last name
	//at index 20, the first name
	//at index 40, the word PRESENT or ABSENT
	//ADDED CHALLENGE:
	//if last name or first name is longer than 20 characters, 
	//cut off the last three letters and replace with "..."
	public String getReportString(){
		if(lastName.length() > 20){
		lastName = lastName.substring(0,17) + "...";
		}
		if(lastName.length() > 20){
			lastName = lastName.substring(0,17) + "...";
		}
		
	    while(lastName.length() < 20){
	    	lastName += " ";
	    }
	    
	   	String name = lastName + firstName;
	    	
	    while(name.length() < 40){
	    	name += " ";
	    }
	    
	    if(isHere){
	    	return name + "PRESENT"+"\n";
	    }
	    else{
	    	return name + "ABSENT" +"\n";
	    }
	}

}