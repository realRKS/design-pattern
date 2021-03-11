package my.patterns.behavioral.memento;

public interface Originator {
	public Memento saveStateToMemento();
	public void getStateFromMemento(ConcreteMemento memento);

}
