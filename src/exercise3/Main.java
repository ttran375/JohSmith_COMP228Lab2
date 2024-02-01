package exercise3;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(1, 1, 2024);
        System.out.println(date.toString());

        date.add(31);
        System.out.println(date.toString());

        date.add(0, 29);
        System.out.println(date.toString());

        Date otherDate = new Date(1, 1, 1);
        date.add(otherDate);
        System.out.println(date.toString());
    }
}
