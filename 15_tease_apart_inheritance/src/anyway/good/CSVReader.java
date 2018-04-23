package anyway.good;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;

public abstract class CSVReader {
    protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*");

    public abstract String[] readCSV() throws IOException;
    public abstract void close() throws IOException;
}
