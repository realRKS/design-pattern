package my.patterns.behavioral.visitors;

public class Main {
	public static void main(String[] args) {

     ComputerPart computer = new Computer();
     computer.accept(new ComputerPartDisplayVisitor());
     computer=new Keyboard();
     computer.accept(new ComputerPartDisplayVisitor());
	}

}
