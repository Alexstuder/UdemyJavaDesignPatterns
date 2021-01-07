public class Demo {

    public static void main(String[] args) {
        SportNewsletter sn = new SportNewsletter(new Newsletter("WM2018", "...."));

        Person person1 = new Person("Hendrix");
        Person person2 = new Person("BB.King");
        Person person3 = new Person("Santana");


        sn.subscribe(person1);
        sn.subscribe(person2);


        sn.setCurrentNewsletter(new Newsletter("Olympiade","..."));

        sn.unsubscribe(person2);
        sn.subscribe(person3);
        sn.setCurrentNewsletter(new Newsletter("Turmspringen","..."));
    }
}
