public class Entry {
    String entry;
    String tags;

    public Entry(String entry, String tags) {
        this.entry = entry;
        this.tags = tags;
    }

    public String toString() {
        return "Entry: " + entry + "\nTags: " + tags + "\n";
    }
}
