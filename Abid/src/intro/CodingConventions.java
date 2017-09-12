package intro;

public class CodingConventions {
	
		//Fields are at the top!!
		private String name;
		/*
		 * IOW, don't do this:
		 * private String name = "Mr.Nockles";
		 */
		private String description;
			
			/*
			 * this is a constructor it's like a method except the "return type" is an instance of the class
			 * for this reason, a constructor must ALWAYS be named after the class
			 */
		
		public CodingConventions(String name, int descriptionIndex) {
			//instantiate variables now
			// there are two variables called "name" the local variable and the field
			// distinguish between the two using the reserved word "this"
			this.name = name;
			// this is a static call to a constant
			description = IntroMain.DESCRIPTIONS[descriptionIndex];
		}
		public void doStuff() {
			String output = name + description;
			System.out.println(output);
		}
}