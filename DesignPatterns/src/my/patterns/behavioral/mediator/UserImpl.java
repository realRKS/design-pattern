package my.patterns.behavioral.mediator;

public class UserImpl extends User {

	public UserImpl(Mediator med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg){
		System.out.println(this.name+": Sending Message="+msg);
		mediator.sendMessage(msg, this);
	}
	@Override
	public void receive(String msg) {
		System.out.println(this.name+": Received Message:"+msg);
	}

}