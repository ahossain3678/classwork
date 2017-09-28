package chatbot;

public class Chatbot {

	private String username;
	private boolean chatting;
	private Topic abid;
	
	public void Chatbot() {
		abid = new ChatbotAbid();
		username = "Unknown User";
		chatting = true;
	}
	public void startChatting() {
		ChatbotMain.print("Hi. Tell me your name.");
		username = ChatbotMain.getInput();
		while(chatting) {
			ChatbotMain.print("what's up");
			String response = ChatbotMain.getInput();
			if(abid.isTriggered(response)) {
				chatting = false; // exit the while loop. 
				abid.talk(response);
			}else {
				ChatbotMain.print("I'm sorry. I don't understand");
			}
		}
	}

}
