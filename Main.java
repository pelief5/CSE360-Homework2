package application;

public class Main {
    public static void main(String[] args) {
        
        QuestionsList questionList = new QuestionsList();

       
        System.out.println("Adding Questions...");
        questionList.addQuestion(new Question(1, "What is Java?", "Programming"));
        questionList.addQuestion(new Question(2, "What is OOP?", "Programming"));

        
        System.out.println("\nAll Questions:");
        for (Question q : questionList.getAllQuestions()) {
            System.out.println(q);
        }

        
        AnswersList answerList = new AnswersList();

        
        System.out.println("\nAdding Answers...");
        answerList.addAnswer(new Answer(1, 1, "Java is a programming language."));
        answerList.addAnswer(new Answer(2, 1, "Java is a type of coffee."));
        answerList.addAnswer(new Answer(3, 2, "OOP stands for Object-Oriented Programming."));

        
        System.out.println("\nAnswers for Question ID 1:");
        for (Answer a : answerList.getAnswersForQuestion(1)) {
            System.out.println(a);
        }

       
        System.out.println("\nRemoving Question ID 1...");
        questionList.removeQuestion(1);

        
        System.out.println("\nUpdated Questions List:");
        for (Question q : questionList.getAllQuestions()) {
            System.out.println(q);
        }

        
        System.out.println("\nAttempting to add an empty question...");
        questionList.addQuestion(new Question(3, "", "General"));


        System.out.println("\nAttempting to add a duplicate question...");
        questionList.addQuestion(new Question(4, "What is Java?", "Programming"));

       
        System.out.println("\nAttempting to add an empty answer...");
        answerList.addAnswer(new Answer(4, 2, ""));
    }
}
