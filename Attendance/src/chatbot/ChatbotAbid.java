package chatbot;

public class ChatbotAbid implements Topic{

	private String[] keywords;
	private String goodbyeKeyword;
	private String secretKeyword;
	private String response;
	
	public ChatbotAbid() {
		String [] temp = {"stuff", "things", "whatever", "nothing"};
		keywords = temp;
		goodbyeKeyword = "bye";
		secretKeyword = "pudding";
		response = "";
	}
	public void talk(String response) {
		ChatbotMain.print("You want to talk about that? Tell me about it.");
		while(ChatbotMain.findKeyword(response, goodbyeKeyword, 0) != -1) {
			if(ChatbotMain.findKeyword(response, secretKeyword, 0) >= 0 ) {
				ChatbotMain.print("OMG LET ME GET SOME PUDDING. I LOVEEE PUDDDING");
				response = ChatbotMain.getInput();
			}else {
				ChatbotMain.print("Yeah that's great. Tell me something interesting");
				response = ChatbotMain.getInput();
			}
		}
		// access other classes
		ChatbotMain.print("Well it was nice talking to you, "+ChatbotMain.chatbot.getUsername()+"!");
		ChatbotMain.chatbot.startChatting();
	}

	public boolean isTriggered(String response) {
		for(int i =0; i < keywords.length; i++) {
			if(ChatbotMain.findKeyword(response, keywords[i], 0) >= 0) {
				return true;
			}
		}
		return false;
	}

}
