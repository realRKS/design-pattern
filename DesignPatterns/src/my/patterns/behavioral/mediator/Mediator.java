package my.patterns.behavioral.mediator;

public interface Mediator {

	public void sendMessage(String msg, User user);

	void addUser(User user);
}