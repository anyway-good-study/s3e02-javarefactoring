package anyway.good;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;

public abstract class CSVReader {
    protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*");
    private final BufferedReader bufferedReader;

    protected CSVReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }
    public String[] readCSV() throws IOException {
        String line = bufferedReader.readLine();
        if (line == null)
            return null;

        String[] items = CSV_PATTERN.split(line);
        return items;
    }
    public void close() throws IOException {
        bufferedReader.close();
    }
}
