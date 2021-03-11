package my.patterns.behavioral.memento;

public class ConcreteOriginator implements Originator{
   private String state;

   public void setState(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }

   public Memento saveStateToMemento(){
      return new ConcreteMemento(state);
   }

   public void getStateFromMemento(ConcreteMemento memento){
      state = memento.getState();
   }
   
}