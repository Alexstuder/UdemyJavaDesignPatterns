import java.util.ArrayList;

public abstract class NewsletterSubject {

    private ArrayList<NewsletterObserver> observers = new ArrayList<NewsletterObserver>();


    public void subscribe(NewsletterObserver observer) {
        if (!observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    public void unsubscribe(NewsletterObserver observer) {
        if (observers.contains(observer)) {

            this.observers.remove(observer);
        }
    }

    public void sendNewsLetter(Newsletter newsletter){
        for(NewsletterObserver o: observers){
            o.update(newsletter);
        }


    }

}
