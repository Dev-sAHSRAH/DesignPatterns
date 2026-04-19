//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Youtube channel = new Youtube("TechVlogs");
        Subscriber subscriber1 = new Subscriber("John");
        Subscriber subscriber2 = new Subscriber("Jane");

        channel.addObserver(subscriber1);
        channel.addObserver(subscriber2);

        channel.uploadVideo("Java Design Patterns");
    }
}