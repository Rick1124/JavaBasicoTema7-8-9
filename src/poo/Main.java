package poo;

public class Main {
    public static void main(String[] args) {
        reverse("Hello World");
        uni();
        bi();
    }

    public static void reverse (String text) {
        System.out.println("Reverse function:");
        StringBuilder input = new StringBuilder();
        input.append(text);
        input.reverse();
        System.out.println(input);
    }

    public static void uni(){
        System.out.println("\nUni function:");
        String[] uni = {"Hi", "Hello", "Good Morning", "What's up?"};
        for ( String element:uni ) {
            System.out.println(element);
        }
    }

    public static void bi(){
        System.out.println("\nBi function:");
        int[][] bi = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] ints : bi) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
