package good.anyway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class SimplerDatabase extends SimpleDatabase {
    public SimplerDatabase(Reader r) throws IOException {
        BufferedReader reader = new BufferedReader(r);
        String line;
        while (true) {
            line = reader.readLine();
            if (line == null) {
                break;
            }
            int equalIndex = line.indexOf("=");
            if (equalIndex>0) {
                String key = line.substring(0, equalIndex);
                String value = line.substring(equalIndex+1 , line.length());
                _map.put(key, value);
            }
        }
    }
}
