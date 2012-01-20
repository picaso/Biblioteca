package main.mainlibrary;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Osaide Ogbeifun
 *         date: 1/15/12
 *         time: 3:45 AM
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

