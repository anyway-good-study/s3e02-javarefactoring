package anyway.good;

import java.io.IOException;

public class CSVFileTreePrinter extends CSVFileReader {
    public CSVFileTreePrinter(String filename) throws IOException {
        super(filename);
    }

    public void print() throws IOException {
        String[] prevItem = new String[0];
        String[] item;
        while((item = readCSV()) != null) {
            boolean justPrint = false;
            for(int column = 0; column < item.length; column++) {
                if (justPrint) {
                    print_line(column, item[column]);
                } else {
                    if (prevItem.length<= column || !item[column].equals(prevItem[column])) {
                        print_line(column, item[column]);
                        justPrint = true;
                    }
                }
            }
            prevItem = item;
        }
    }

    private void print_line(int indent, String s) {
        for(int i = 0; i < indent; i++)
            System.out.print("\t");
        System.out.println(s);
    }
}
