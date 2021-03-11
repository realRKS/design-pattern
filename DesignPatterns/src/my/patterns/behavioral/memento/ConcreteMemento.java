package my.patterns.behavioral.memento;

public class ConcreteMemento implements Memento {
   private String state;
   public ConcreteMemento(String state){
      this.state = state;
   }
   public String getState(){
      return state;
   }	
   
   void otherMethods() {
	   System.out.println("Other methods");
   }
}