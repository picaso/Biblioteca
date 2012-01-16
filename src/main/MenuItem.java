package main;

/**
 * Created by IntelliJ IDEA.
 * User: Osaide Ogbeifun
 * Date: 1/15/12
 * Time: 3:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class MenuItem {

    private int questionID = 0;
    private String question = "";

    public MenuItem(int questionID, String question) {
        this.questionID = questionID;
        this.question = question;
    }

    public int getQuestionID() {
        return questionID;
    }

    public String getQuestion() {
        return question;
    }

}

