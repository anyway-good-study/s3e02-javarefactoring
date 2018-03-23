package good.anyway;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Flag {
    public static void main(String[] args) {
        System.out.println("<< FindInt >>");
        int[] data = { 1, 2, 3, 0, 2, 8, 5, 0, 6 };
        // 세 함수 다 결과는 같음
        if ( FindInt.findBefore(data, 5) && FindInt.findAfter(data, 5) && FindInt.findFinal(data, 5)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found...");
        }


        try {
            System.out.println("<< SimpleDatabase >>");

            // 두 함수 다 결과는 같음
            SimpleDatabase db = new SimpleDatabase(new FileReader("02_control_flag_removal/dbfile.txt"));
            SimplerDatabase simplerDb = new SimplerDatabase(new FileReader("02_control_flag_removal/dbfile.txt"));

            printDB(db);
            printDB(simplerDb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printDB(SimpleDatabase db) {
        System.out.println("--DB--");
        Iterator<String> it = db.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println("KEY : " + key);
            System.out.println("VALUE : " + db.getValue(key));
        }
    }
}
