package application;

// Represents a single Question
public class Question {
    private int id;
    private String text;
    private String category;

    // Constructor
    public Question(int id, String text, String category) {
        this.id = id;
        this.text = text;
        this.category = category;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    @Override
    public String toString() {
        return "Question ID: " + id + " | Text: " + text + " | Category: " + category;
    }
}
