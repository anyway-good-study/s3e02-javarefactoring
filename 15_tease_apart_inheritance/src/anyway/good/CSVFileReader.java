package anyway.good;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader extends CSVReader {
    private final BufferedReader bufferedReader;

    public CSVFileReader(String filename) throws IOException {
        bufferedReader = new BufferedReader(new FileReader(filename));
    }

    @Override
    public String[] readCSV() throws IOException {
        String line = bufferedReader.readLine();
        if (line == null) {
            return null;
        }

        String [] items = CSV_PATTERN.split(line);
        return items;
    }

    @Override
    public void close() throws IOException {
        bufferedReader.close();
    }
}
