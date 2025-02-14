package application;

// Represents a single Answer
public class Answer {
    private int id;
    private int questionId;
    private String text;

    // Constructor
    public Answer(int id, int questionId, String text) {
        this.id = id;
        this.questionId = questionId;
        this.text = text;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getQuestionId() { return questionId; }
    public void setQuestionId(int questionId) { this.questionId = questionId; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    @Override
    public String toString() {
        return "Answer ID: " + id + " | Question ID: " + questionId + " | Text: " + text;
    }
}
