package comsdavis.magic8ball3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Magic8Ball3 { //POJO - Plain Ole java Object
	
	private String question;
	private List<String> answers; //A type of Java Collections
	Random rand = new Random();
	int choice = (int) (Math.random()*6);//Get a random number from 0 to 5
	
	public Magic8Ball3() {
		this.question= null;
		answers = new ArrayList<String>();
		answers.add("As I see it yes.");
		answers.add("Ask again later.");
		answers.add("Please, quit asking!");
		answers.add("Yes!");
		answers.add("No!");
		answers.add("Maybe");
		
				
	}

	public String getQuestion() {
		return this.question;
	}

	public boolean askQuestion(String question) {
		if(question instanceof String) {
			this.question = question;
			return true;
		}
		else {
		return false;
		}
		
	}

	public String shake() {
		
		Random r = new Random();
		int randomindex=r.nextInt(6);
		
		System.out.println("Random item:" + answers.get(randomindex));
		return answers.get(randomindex);
		
		
		}
 {
		//String randomElement = answers.get(rand.nextInt(answers.size()));
		//System.out.println(randomElement);
		//System.out.println(choice);
		//int rnd = new Random().nextInt(this.answers.length);
		//System.out.println(this.answers[rnd]);
		//return this.answers[rnd];
		//Return a random element from the list.
		//???Use Random class to create random number
		//??? Use Random number to get element from ArrayList
		//return answers.get(choice);
		
	}

}
