
import java.util.ArrayList;
import java.util.List;

public class CR {

    private List<Observer> observers = new ArrayList<Observer>();
    private String state;

    public String getMsg() {
        return state;
    }

    public void setMsg(String state) {
        this.state = state;
        sendEmailToAll();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    private void sendEmailToAll() {
        observers.forEach((observer) -> {
            observer.update();
        });
    }
}
