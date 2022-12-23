import java.util.*;
import java.io.*;
class Question{
	String prompt;
	String answer;
	
	public Question(String prompt, String answer){
		this.prompt = prompt;
		this.answer = answer;
	}
}

public class App{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		String qa1 = "1. Seven years ago, my sister was twice the age I was then "
					+"plus two years making her thirty-two,\n"
					+" the combined age of us two years ago was fifty-seven, how old am I now?\n"
					+ "(a) 22\n(b) 17\n(c) 20\n(d) 30\n->";
		String qa2 = "2. Which of the following words is a palindrome?\n" 
				   + "(a) yacht\n(b) airplane\n(c) racecar\n(d) train\n->";
		String qa3 = "3. If some cats are independent and no independent cat is affectionate "
					+"then which of the following statements is true?\n"
					+"1.Some cats are not affectionate\n"
					+"2.Some cats are affectionate\n"
					+"(a)1 & 2\n(b)1\n(c)2\n(d)none\n->";
		String qa4 = "4. Which former Great British prime minister is an anagram of 'random advice'?\n"
					+"(a)David Cameron\n(b)Damir Cavedon\n->";
		String qa5 = "5. Which of the following is least like the others?\n"
					+"(a)Length\n(b) Millimetre\n(c) Yard\n(d) Meter\n->";
		String qa6 = "6. Mia and Tilly have the same amount of sweets each.\n"
					+"How many sweets should Mia give Tilly so that she has four sweets more?\n"
					+"(a)4\n(b)2\n(c)6\n(d)1\n->";
		String qa7 = "7. Which letter should appear next in the following sequence: Z B Y D X F W H?\n"
					+"(a)K\n(b)A\n(c)V\n(d)R\n->";
		String qa8 = "8. the following words correspond to the following number sequence: \n"
					+"car, spider, hexagon, unlucky = 4, 8, 5, 13\n"
					+"(a)True\n(b)False\n->";
		String qa9 = "9. If the word EWE is written above the word ZOO and\n"
					+"the word TOE is written above the word EWE, would the number TWO appear diagonally?\n"
					+"(a)Yes\n(b)No\n->";
		String qa10 = "10. MELON is to ENMOL as 83425 is to?\n"
					+"(a)28345\n(b)54328\n(c)82435\n(d)35824\n->";
		Question [] brain = {
				new Question(qa1,"a"),
				new Question(qa2,"c"),
				new Question(qa3,"c"),
				new Question(qa4,"a"),
				new Question(qa5,"a"),
				new Question(qa6,"b"),
				new Question(qa7,"c"),
				new Question(qa8,"b"),
				new Question(qa9,"a"),
				new Question(qa10,"d")
		};
		String qb1 = "1. In the comic book series, who were the original Avengers?\n"
					+"a. Batman, Spider-Man, Superman and Wonder Woman\n"
					+"b. Ant-Man, The Hulk, Iron Man, Thor, and the Wasp\n"
					+"c. The Hulk, Howard The Duck, Thor and Black Widow\n"
					+"d. The Incredibles\n->";
		String qb2 = "2. In the 2012 movie, the Avengers features Captain America. What is his real name?\n"
					+"a. Buck Rogers\nb. Ted Rogers\nc. Steve Rogers\nd. Tony Stark\n->";
		String qb3 = "3. Who is the leader of shield?\n"
					+"a. Nick Fury\nb. Tony Stark\nc. Bruce Banner\nd. Diana Prince\n->";
		String qb4 = "4. Which superhero does Bruce Banner transform into?\n"
					+"a. Iron man\nb. Hawkeye\nc. Thor\nd. The Hulk\n->";  
		String qb5 = "5. Who is Loki's adoptive brother?\n"
					+"a. Thor\nb. Tony Stark\nc. Peter Parker\nd. Bruce Wayner\n->";
		String qb6 = "6. What is the name of the mysterious blue glowing cube that Loki uses as a weapon?\n"
					+"a. The Orb\nb. Tesseract\nc. The Force\nd. UV lamp\n->";
		String qb7 = "7. Which US city do the Avengers battle the Chitauri?\n"
					+"a. Los Angeles\nb. New York city\nc. Washington, DC\nd. Miami\n->";
		String qb8 = "8. Who  diverts a nuclear missile into a wormhole and defeats the Chitauri army?\n"
					+"a. Black Widow\nb. The Hulk\nc. Iron Man\nd. Thor\n->";
		String qb9 = "9. What weapon does Thor carry?\n"
					+"a. A bow and arrow\nb. A catapult\nc. A hammer\nd. A sword\n->";
		String qb10 = "10. In Avengers: Age of Ultron, what is the name of the villain who wants to destroy Earth?\n"
					+"a. Green goblin\nb. Ultron\nc. The penguin\nd. The joker\n->";
		Question [] marvel  = {
				new Question(qb1,"b"),
				new Question(qb2,"c"),
				new Question(qb3,"a"),
				new Question(qb4,"d"),
				new Question(qb5,"a"),
				new Question(qb6,"b"),
				new Question(qb7,"b"),
				new Question(qb8,"c"),
				new Question(qb9,"c"),
				new Question(qb10,"b")
		};
		String qc1 = "1.Indian food in the UK is completely different to Indian food in India.\n"
					+"a. True\nb. False\n->";
		String qc2 = "2. What is a Gulab Jamun?\n"
					+"a. A type of drink\nb. A type of deep-fried sweet\nc. A type of meatball\nd. A sauce\n->";
		String qc3 = "3. Chicken Tikka Masala was invented in Scotland-not India.\n"
					+"a. True\nb. False\n->";
		String qc4 = "4. Which of these is not a region of India famous for its food?\n"
					+"a. Gujarat\nb. Kerala\nc. Punjab\nd. Banagladesh\n->";  
		String qc5 = "5. Which one of these classic UK curries is hotter?\n"
					+"a. Korma\nb. Madras\nc. Vindaloo\nd. Balti\n->";
		String qc6 = "6. Which of these is not a type of bread?\n"
					+"a. Paratha\nb. Roti\nc. Naam\nd. Paneer\n->";
		String qc7 = "7. Why are there usually no beef dishes on the menu at Indian restaurants?\n"
					+"a. Beef tastes weird in curry\nb. Indians are all vegan\nc. Cows are sacred for hindus\n"
					+"d. Beef is really bad for the environment\n->";
		String qc8 = "8. In Britain, curry is the most popular type of food to cook at home.\n"
					+"a. True\nb. False\n->";
		String qc9 = "9. What is daal made out of?\n"
					+"a. Beans\nb. Lentils\nc. Rice\nd. Some kind of delicious goo\n->";
		String qc10 = "10. Parsley is a common ingredient in Indian curries.\n"
					+"a. True\nb. False\n->";
		Question [] food = {
				new Question(qc1,"a"),
				new Question(qc2,"b"),
				new Question(qc3,"a"),
				new Question(qc4,"d"),
				new Question(qc5,"c"),
				new Question(qc6,"d"),
				new Question(qc7,"c"),
				new Question(qc8,"a"),
				new Question(qc9,"b"),
				new Question(qc10,"b")
		};
		String qd1 = "1. Master Ji, Pitaji ki patlun ek bilan choti kar do\n"
					+"a) Perk\nb) Eclairs\nc) 5 Star\nd) Melody\n->";
		String qd2 = "2. Surakshit, kaale mere baal, ______ ne kiya kamaal\n"
					+"a) Parachute\nb) Garnier\nc) Dabur Amla\nd) Vasmol\n->";
		String qd3 = "3. Har ek friend zaroori hota hai\n"
					+"a) Vodafone\nb) Airtel\nc) Idea\nd) Jio\n->";
		String qd4 = "4. Men will be Men\n"
					+"a) Old Monk\nb) Imperial blue\nc) Budweiser\nd) Johnnie Walker\n->";  
		String qd5 = "5. the end of the world should not be the only thing coming\n"
					+"a) Durex\nb) PornHub\nc) Trustex\nd) Beyond Seven\n->";
		String qd6 = "6. Doodh si safedi,____ se aaye, rangeen kapda bhi, khil khil jaaye\n"
					+"a) Ujala\nb) Rin\nc) Nirma\nd) Amul\n->";
		String qd7 = "7.___, Dimaag ki batti jala de\n"
					+"a) Center fresh\nb) Syska\nc) Philips\nd) Mentos\n->";
		String qd8 = "8. jab ghar ki raunak badhani ho, deewaron ko jab sajana ho\n"
					+"a) Cerelac\nb) Nerolac\nc) Dulux\nd) Asian Paints\n->";
		String qd9 = "9. ___ki goli lo, khich khich door karo\n"
					+"a) Gems\nb) Bandook\nc) Vicks\nd) Tic tac\n->";
		String qd10 = "10. you are my pumpkin pumpkin, hello honey bunny! toko tokooooo\n"
					+"a) Idea\nb) Airtel\nc) Vodafone\nd) Reliance\n->";
		Question [] ads = {
				new Question(qd1,"c"),
				new Question(qd2,"d"),
				new Question(qd3,"b"),
				new Question(qd4,"b"),
				new Question(qd5,"a"),
				new Question(qd6,"c"),
				new Question(qd7,"d"),
				new Question(qd8,"b"),
				new Question(qd9,"c"),
				new Question(qd10,"a")
		};
		System.out.println("Choose the quiz you want to take\n"
					+ "a) Brain teasers\nb) Avengers\nc) Indian Food\nd) Indian Advertisements\n");
			String choice = sc.next();
			switch(choice){
				case "a":
				takeTest(brain);
				break;
				
				case "b":
				takeTest(marvel);
				break;
				
				case "c":
				takeTest(food);
				break;
				
				case "d":
				takeTest(ads);
				break;
			}
		
		
		}
		public static void takeTest(Question [] questions){
			int score = 0;
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<questions.length;i++){
				System.out.println(questions[i].prompt);
				String answer = sc.next();
				if(answer.equals(questions[i].answer)){
					score++;
				}
				}
				System.out.println("You got "+score+"/"+questions.length);			
		}
	
}