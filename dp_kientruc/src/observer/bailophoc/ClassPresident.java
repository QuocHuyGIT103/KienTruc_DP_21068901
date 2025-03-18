package observer.bailophoc;

import java.util.ArrayList;
import java.util.List;

public class ClassPresident implements Subject {
    private List<Observer> students = new ArrayList<>();
    private String message;

    @Override
    public void attach(Observer observer) {
        students.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        students.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer student : students) {
            student.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
