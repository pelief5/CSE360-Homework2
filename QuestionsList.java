package application;

import java.util.ArrayList;
import java.util.List;


public class QuestionsList {
    private List<Question> questions;

    public QuestionsList() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        if (question.getText().trim().isEmpty()) {
            System.out.println("Error: Question text cannot be empty.");
            return;
        }

        
        
        if (isDuplicateQuestion(question.getText())) {
            System.out.println("Error: Duplicate question detected.");
            return;
        }

        questions.add(question);  
        System.out.println("Question added successfully.");
    }

    
    private boolean isDuplicateQuestion(String text) {
        return questions.stream()
                .anyMatch(q -> q.getText().trim().equalsIgnoreCase(text.trim()));
    }

    public void removeQuestion(int id) {
        questions.removeIf(q -> q.getId() == id);
        System.out.println("Question removed successfully.");
    }

    public Question getQuestion(int id) {
        return questions.stream().filter(q -> q.getId() == id).findFirst().orElse(null);
    }

    public List<Question> getAllQuestions() {
        return questions;
    }
}
