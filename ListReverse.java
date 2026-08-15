import java.util.ArrayList;

public class ListReverse {

    public static ArrayList<Integer> reverseList(ArrayList<Integer> original) {
        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = original.size() - 1; i >= 0; i--) {
            reversed.add(original.get(i));
        }
        return reversed;
    }

    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>();
        for (int i = 11; i <= 20; i++) {
            original.add(i);
        }

        System.out.println("Original Sequence: " + original);
        ArrayList<Integer> reverse = reverseList(original);
        System.out.println("Reverse Sequence:  " + reverse);
    }
}