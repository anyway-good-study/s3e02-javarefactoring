package anyway.good;

import java.io.IOException;

public class CSVStringTablePrinter extends CSVStringReader {
    public CSVStringTablePrinter(String string) {
        super(string);
    }

    public void print() throws IOException {
        System.out.println("<table>");
        String[] item;
        while((item = readCSV()) != null) {
            System.out.print("<tr>");
            for(int column = 0; column < item.length; column ++) {
                System.out.print("<td>");
                System.out.print(item[column]);
                System.out.print("</td>");
            }
            System.out.println("</tr>");
        }
        System.out.println("</table>");
    }
}
