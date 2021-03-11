package my.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
   private List<ConcreteMemento> ConcreteMementoList = new ArrayList<ConcreteMemento>();

   public void add(Memento memento){
      ConcreteMementoList.add((ConcreteMemento) memento);
   }

   public ConcreteMemento get(int index){
      return ConcreteMementoList.get(index);
   }
}