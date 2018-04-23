package anyway.good;

import java.io.IOException;

public class CSVStringTablePrinter extends CSVPrinter {
    public CSVStringTablePrinter(String string) {
        super(new CSVStringReader(string));
    }

    @Override
    public String[] readCSV() throws IOException {
        return csvReader.readCSV();
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
