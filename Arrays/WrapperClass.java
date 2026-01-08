import java.util.ArrayList;
import java.util.Collections;

public class WrapperClass {

    static void reverseList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;

        while (i < j) {
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(121);
        list.add(122);
        list.add(123);
        list.add(124);
        list.add(125);
        list.add(126);

        System.out.println("Original list " + list);
//        reverseList(list);
        Collections.reverse(list);
        System.out.println("Reversed list " + list);
        Collections.sort(list);
        System.out.println("Ascending order " + list);
        list.sort(Collections.reverseOrder());
        System.out.println("Descending order " + list);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("PW");
        l1.add("Skills");

        System.out.println(l1);
        l1.sort(Collections.reverseOrder());
        System.out.println(l1);
    }
}
