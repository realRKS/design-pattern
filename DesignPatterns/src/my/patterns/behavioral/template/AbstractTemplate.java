package my.patterns.behavioral.template;

public abstract class AbstractTemplate {
	
	abstract public void toDo1();
	abstract public void toDo2();
	abstract public void toDo3();
	public final void arrangeTemplate() {
		toDo1();
		toDo2();
		toDo3();
	}

}
