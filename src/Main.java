import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(1, 100));
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("\n");
        for (Integer a : arrayList) {
            if (a % 2 == 0) {
                arrayList1.add(a);
            } else {
                arrayList2.add(a);
            }
        }
        System.out.println("Jup san");
        for (Integer b : arrayList1) {
            System.out.print(b + " ");
        }
        System.out.println("\nTak san");
        for (Integer b : arrayList2) {
            System.out.print(b + " ");
        }


    }
}