package application;

import java.util.ArrayList;
import java.util.List;

// Manages a list of Answers
public class AnswersList {
    private List<Answer> answers;

    public AnswersList() {
        this.answers = new ArrayList<>();
    }

    public void addAnswer(Answer answer) {
        if (answer.getText().trim().isEmpty()) {
            System.out.println("Error: Answer text cannot be empty.");
            return;
        }

        answers.add(answer);
        System.out.println("Answer added successfully.");
    }

    public void removeAnswer(int id) {
        answers.removeIf(a -> a.getId() == id);
        System.out.println("Answer removed successfully.");
    }

    public List<Answer> getAnswersForQuestion(int questionId) {
        List<Answer> result = new ArrayList<>();
        for (Answer a : answers) {
            if (a.getQuestionId() == questionId) {
                result.add(a);
            }
        }
        return result;
    }
}

