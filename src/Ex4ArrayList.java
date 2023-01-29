import java.util.ArrayList;
import java.util.List;

public class Ex4ArrayList {
    public static void main(String[] args) {
        int size = 10;
        List<Double> arrayList = new ArrayList<Double>();

        for (int i = 0; i < size; i++) {
            arrayList.add(i * 3.0);
        }

        System.out.println("The ArrayList now looks like: " + arrayList);
    }
}
