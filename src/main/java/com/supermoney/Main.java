package com.supermoney;

import com.supermoney.model.AdminUser;
import com.supermoney.model.NonAdminUser;
import com.supermoney.model.surveyform.Page;
import com.supermoney.model.surveyform.SurveyForm;
import com.supermoney.model.surveyform.answer.Answer;
import com.supermoney.model.surveyform.answer.MultipleChoiceAnswer;
import com.supermoney.model.surveyform.answer.ParagraphAnswer;
import com.supermoney.model.surveyform.answer.RadioButtonAnswer;
import com.supermoney.model.surveyform.question.*;
import java.util.Map;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        //Requirement: Multi-Step Form
        final Question question1 = getRadioButtonQuestion();
        final Question question2 = getParagraphQuestionQuestion();
        final Question question3 = getMCQQuestion();
        final Page page1 = new Page(1);
        final Page page2 = new Page(2);
        final SurveyForm surveyForm1 = new SurveyForm(1);

        //Requirement: New surveys onboarding
        final AdminUser adminUser = new AdminUser(1);
        adminUser.addQuestionToGivenPage(question1, page1);
        adminUser.addQuestionToGivenPage(question2, page2);
        adminUser.addQuestionToGivenPage(question3, page2);
        adminUser.addPageToGivenForm(page1, surveyForm1);
        adminUser.addPageToGivenForm(page2, surveyForm1);

        //Requirement: Save
        final NonAdminUser nonAdminUser1 = new NonAdminUser(2);
        final Answer user1FirstQuestionAnswer = new RadioButtonAnswer(question1.getId(), "Thai cuisine");
        nonAdminUser1.saveAnswer(surveyForm1.getId(), question1.getId(), user1FirstQuestionAnswer);
        final Answer user1SecondQuestionAnswer = new ParagraphAnswer(question2.getId(), "Mah life mah choice :P");
        nonAdminUser1.saveAnswer(surveyForm1.getId(), question2.getId(), user1SecondQuestionAnswer);
        final Map<Integer, Answer> user1Form1ResponsePreview = nonAdminUser1.previewResponseProvideTillNow(
                surveyForm1.getId());

        //Requirement: Preview Feature
        printResponsePreview(nonAdminUser1.getId(), user1Form1ResponsePreview);

        final NonAdminUser nonAdminUser2 = new NonAdminUser(3);
        final Answer user2FirstQuestionAnswer = new RadioButtonAnswer(question1.getId(), "Italian cuisine");
        nonAdminUser2.saveAnswer(surveyForm1.getId(), question1.getId(), user2FirstQuestionAnswer);
        final Answer user2SecondQuestionAnswer = new ParagraphAnswer(question2.getId(),
                "Java is best because of it's community support");
        nonAdminUser2.saveAnswer(surveyForm1.getId(), question2.getId(), user2SecondQuestionAnswer);
        final Answer user2ThirdQuestionAnswer = new MultipleChoiceAnswer(question3.getId(),
                asList("To grow & learn professionally", "To have work life balance"));
        nonAdminUser2.saveAnswer(surveyForm1.getId(), question3.getId(), user2ThirdQuestionAnswer);
        final Map<Integer, Answer> user2Form1ResponsePreview = nonAdminUser2.previewResponseProvideTillNow(
                surveyForm1.getId());
        printResponsePreview(nonAdminUser2.getId(), user2Form1ResponsePreview);

        //Requirement: Resume
        //Requirement: Skip functionality
        final Answer user1ThirdQuestionAnswer = null;
        nonAdminUser1.saveAnswer(surveyForm1.getId(), question3.getId(), user1ThirdQuestionAnswer);
        printResponsePreview(nonAdminUser1.getId(), user1Form1ResponsePreview);
    }

    private static Question getRadioButtonQuestion() {

        Question question = new RadioButtonQuestion(1, "Which cuisine do you like ?", QuestionType.RADIO_BUTTON);
        String questionChoice1 = "Thai cuisine";
        String questionChoice2 = "Indian cuisine";
        String questionChoice3 = "Italian cuisine";
        question.addChoices(questionChoice1);
        question.addChoices(questionChoice2);
        question.addChoices(questionChoice3);

        return question;
    }

    private static Question getParagraphQuestionQuestion() {

        return new ParagraphQuestion(2, "What is your favourate probgramming language & why?", QuestionType.PARAGRAPH);
    }

    private static Question getMCQQuestion() {

        Question question = new MultipleChoiceQuestion(3, "Why you want to join SuperMoney?",
                QuestionType.MULTIPLE_CHOICE);
        String questionChoice1 = "To earn more money";
        String questionChoice2 = "To grow & learn professionally";
        String questionChoice3 = "To have work life balance";
        question.addChoices(questionChoice1);
        question.addChoices(questionChoice2);
        question.addChoices(questionChoice3);

        return question;
    }

    private static void printResponsePreview(Integer userId, Map<Integer, Answer> responsePreview) {

        for (Integer questionId : responsePreview.keySet()) {
            Answer answer = responsePreview.get(questionId);
            System.out.println(
                    "For user id: [" + userId + "], the answer submitted for question id: [" + questionId + "] is: ["
                            + answer + "]");
        }

        System.out.println("=======");

    }
}
