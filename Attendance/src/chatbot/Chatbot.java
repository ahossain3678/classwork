package chatbot;

public class Chatbot {

	private String username;
	private boolean chatting;
	private Topic abid;
	
	public Chatbot() {
		abid = new ChatbotAbid();
		username = "Unknown User";
		chatting = true;
	}
	public String getUsername() {
		return username;
	}

	public void startChatting() {
		//whenever you print or get input, use these methods
		ChatbotMain.print("Hi! I am an intelligent machine that can respond to your input. Tell me your name.");
		username = ChatbotMain.getInput();
		while(chatting) {
			ChatbotMain.print("What would you like to talk about?");
			String response = ChatbotMain.getInput();
			if(abid.isTriggered(response)) {
				chatting = false;//exits the while loop. IMPORTANT you get graded for this!
				abid.talk(response);
			}else {
				ChatbotMain.print("I'm sorry. I don't understand. I never said I was perfect.");
			}
		}
	}

}
