package anyway.good;

import java.io.IOException;

public class CSVTreePrinter extends CSVPrinter {
    public CSVTreePrinter(String filename) throws IOException {
        super(new CSVFileReader(filename));
    }

    @Override
    public String[] readCSV() throws IOException {
        return csvReader.readCSV();
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
