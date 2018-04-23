package anyway.good;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class CSVStringReader extends CSVReader {
    public CSVStringReader(String string) {
        super(new BufferedReader(new StringReader(string)));
    }
}
