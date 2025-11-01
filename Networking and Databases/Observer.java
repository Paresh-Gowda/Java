import java.util.*;
import java.util.ArrayList;
class Subject
{
    private List<Observer> observers=new ArrayList<>();
    private int state;
    public int getState()
    {
        return state;
    }
    public void setState(int state)
    {
        this.state=state;
        notifyObserver();
    }
    public void attach(Observer observer)
    {
        observers.add(observer);
    }
    public void detach(Observer observer)
    {
        observers.remove(observer);
    }
    public void notifyObserver()
    {
        for(Observer observer:observers)
        {
            observer.update();
        }
    }
}
public interface Observer
{
    void update();
}
class Concrete_Observer implements Observer
{
    private Subject subject;
    public Concrete_Observer(Subject subject)
    {
        this.subject=subject;
        this.subject.attach(this);
    }
    public void update()
    {
        System.out.println("Observer received an update.New state:"+subject.getState());
    }
}
class Observe_Pattern
{
    public static void main(String args[])
    {
        Subject subject=new Subject();
        Concrete_Observer co1=new Concrete_Observer(subject);
        Concrete_Observer co2=new Concrete_Observer(subject);
        subject.setState(11);
        subject.detach(co1);
        subject.setState(16);
        subject.detach(co2);
    }
}
