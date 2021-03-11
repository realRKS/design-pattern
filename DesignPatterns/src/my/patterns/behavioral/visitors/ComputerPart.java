package my.patterns.behavioral.visitors;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}