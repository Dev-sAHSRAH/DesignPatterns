public class Subscriber implements Observer{
    private String name;

    Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + " received msg: " + msg);
    }
}
