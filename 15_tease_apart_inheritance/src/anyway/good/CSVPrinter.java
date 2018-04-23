package anyway.good;

import java.io.IOException;

public abstract class CSVPrinter {
    protected final CSVReader csvReader;
    protected CSVPrinter(CSVReader csvReader) {
        this.csvReader = csvReader;
    }
    public abstract void print() throws IOException;
}
