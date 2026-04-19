//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DBConnection original = new DBConnection("admin", "localhost:3306");
        DBConnection copy1 = original.copy();

        DBConnection copy2 = copy1.copy();

        System.out.println(original);
        System.out.println(copy1);
        System.out.println(copy2);
    }
}