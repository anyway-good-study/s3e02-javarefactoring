import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

class AddressFile {
    private final Database database;
    public AddressFile(String filename) {
        this.database = new Database(filename);
    }

    public Enumeration names() {
        return this.database.getProperties().propertyNames();
    }

    public void set(String key, String value) {
        this.database.set(key, value);
    }

    public String get(String key) {
        return this.database.get(key);
    }

    public void update() throws IOException {
        this.database.update();
    }
}

class Database {
    private final Properties properties;
    private final String filename;

    public Database(String filename) {
        this.filename = filename;
        this.properties = new Properties();
        try {
            this.properties.load(new FileInputStream(filename));
        } catch (IOException ignore) {
        }
    }

    public void set(String key, String value) {
        this.properties.setProperty(key, value);
    }

    public String get(String key) {
        return this.properties.getProperty(key, null);
    }

    public void update() throws IOException {
        this.properties.store(new FileOutputStream(filename), "");
    }

    public Properties getProperties() {
        return this.properties;
    }
}

public class StudyDelegate {
    public static void main(String[] args) {
        try {
            AddressFile file = new AddressFile("address.txt");
            file.set("Jang Youngwhan", "nathaniel@anyway.com");
            file.set("Lee Kihyun", "varian@anyway.com");
            file.set("Park Sanguk", "murray@anyway.com");
            file.set("Hwang Yeonju", "joanne@anyway.com");
            file.update();

            Enumeration e = file.names();
            while (e.hasMoreElements()) {
                String name = (String)e.nextElement();
                String mail = file.get(name);
                System.out.println("name=" + name + ", mail=" + mail);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
