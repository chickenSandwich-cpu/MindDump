import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    String entry;
    String tags;
    String timestamp;
    String pattern = "dd/MM/yyyy HH:mm:ss";

    public Entry(String entry, String tags) {
        this.entry = entry;
        this.tags = tags;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern));
    }

    public String toString() {
        return "[" + timestamp + "]\nEntry: " + entry + "\nTags: " + tags + "\n";
    }
}
