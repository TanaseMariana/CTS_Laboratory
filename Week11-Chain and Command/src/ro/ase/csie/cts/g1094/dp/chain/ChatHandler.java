package ro.ase.csie.cts.g1094.dp.chain;

public abstract class ChatHandler {
	
	ChatHandler next;
	
	public abstract void processMessage(Message msg);

	public void setNext(ChatHandler next) {
		this.next = next;
	}
	
	
	

}
