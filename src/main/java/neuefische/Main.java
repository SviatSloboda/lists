package neuefische;

public class Main {
    public static void main(String[] args) {
        OurLinkedList firstTry = new OurLinkedList();

        firstTry.add(4);
        System.out.println(firstTry);

        firstTry.add(5);
        System.out.println(firstTry);

        firstTry.add(0);
        System.out.println(firstTry);

        firstTry.add(5);
        System.out.println(firstTry);

        firstTry.add(1234);
        System.out.println(firstTry);

        firstTry.remove(4);
        System.out.println(firstTry);
    }

}