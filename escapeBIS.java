import java.util.Scanner;
import java.util.Stack;
import java.time.Instant;
import java.util.ArrayList;

public class escapeBIS {
	static Stack stack = new Stack();
	public static int chooseDirection (String direct) {
		String direction = direct.toUpperCase(); 
		
		while (!direction.equals("N")&&(!direction.equals("E"))&&(!direction.equals("S"))&&(!direction.equals("W"))&&(!direction.equals("X"))&&(!direction.equals("UNDO"))) {
			System.out.println("Please re-enter the direction"); 
			Scanner input = new Scanner (System.in);
			String direction2 = input.nextLine();
			direction = direction2.toUpperCase();
		}
		
		if (direction.equals("N")) {
			return 0;
		} else if (direction.equals("E")) {
			return 1;
		} else if (direction.equals("S")) {
			return 2;
		} else if (direction.equals("W")){
			return 3;
		} else if (direction.equals("UNDO")){
			return 5;
		} else {
			return 4;
		}
	}
	
	public static boolean checkDirection (int currentRoom, int direction, int[][] maze) {
		if (maze[currentRoom][direction]==-1) {
			return false;
		} else {
			return true; 
		}
	}
	
	public static int getLevel (String levelInput) {
		String level = levelInput.toLowerCase();
		while (!level.equals("easy")&&(!level.equals("medium"))&&(!level.equals("hard"))) {
			System.out.println("Please re-enter the level"); 
			Scanner input = new Scanner (System.in);
			String level2 = input.nextLine();
			level = level2.toLowerCase();
		}
		
		if (level.equals("easy")) {
			return 0;
		} else if (level.equals("medium")) {
			return 1;
		} else 
			return 2;
		
	}
	
	public static boolean playAgain () {
		
		String  playing = ("");
		
		while (!playing.equals("y")&&!playing.equals("n")) {
			System.out.println("Do you want to play again? y for yes and n for no");
			Scanner input = new Scanner (System.in);
			String yn = input.nextLine();
			playing = yn.toLowerCase();
		}
		
		if (playing.equals("y")) {
			return true;
		}else {
			return false;
		}
			
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Directions are NE(right)SW(left)
		//-1 is where the walls are
//		int[][]easyMaze = { 
//				{-1,1,-1,-1}, //0
//				{-1,2,-1,0}, //1
//				{-1,-1,5,1}, //2
//				{-1,-1,6,4}, //3
//				{-1,5,7,3},//4
//				{2,4,-1,-1},//5	
//				{3,-1,-1,-1},//6
//				{3,-1,-1,6},//7
//				{4,8,-1,-1},//8
//		};
				
		
		int[][]mediumMaze = { 
						{-1,1,-1,-1}, //0
						{-1,2,5,0}, //1
						{-1,3,-1,1}, //2
						{-1,-1,7,2}, //3
						{-1,5,8,-1},//4
						{1,-1,-1,4},//5
						{-1,7,-1,-1},//6
						{3,-1,-1,6},//7
						{4,9,12,-1},//8   
						{-1,-1,-1,8},//9
						{-1,11,14,-1},//10
						{-1,-1,15,10},//11
						{8,13,-1-1},//12
						{-1,14,-1,12},//13
						{10,-1,-1,13},//14
						{11,-1,-1,-1},//15
					};
		
//		String [] easyDescriptions = {
//				"0","1","2","3","4","5","6","7"};

		
		String[]mediumDescriptions = {
				
					"You're in the music practice room right now and Mr Airdrie is \n"
					+"trying to find you for SHAFT, you have to now navigate \n"
					+"around the school in the dark to escape him. Good luck! ", //0 (music room)
					
					"You have ran into the auditorium as a hindout from the hallway. \n"
					+"Be careful there before any teachers find you! ", //1 (auditorium) 
					
					"Ahh Hitler, tbh still less scary than Mr Airdrie right now. \n"
					+"You're in the history class room, \n"
					+"run fast before you get on Ms Peter's nerves ", //2(history) 
					
					"Bonjour Madame Dorr- oh no not les devoirs, time to go, Salut! ", //3(french) 
					
					"Hey is that Ms Wilson or Ms Price in the english corridor? \n"
					+"Better run fast though but this time to escape not because \n"
					+"you're late from English again", //4(english) 
					
					"Mr Mortimer gave you a weird look as you walk down the science corridor \n"
					+"'Mr Airdrie is finding you' he said, as you continued sprinting", //5 (science)
					
					"You rolled into the library hoping you can find a place to hide. \n"
					+"Suddenly a deep angery voice shouted from behind 'Who's there!?'", //6 (library) 
					
					"Sprinting out of the library as fast as you can from another exit, you bumped your \n"
					+"head into the pricipal's office. She was startled but didn't see you so she called \n "
					+"for a lockdown situation", //7 (principal's office) 
					
					"You dashed to the maths room as you go in for a Hi5 with Ms Shanks, \n"
					+"good for you Mr Airdrie isn't here right now!", //8 (maths)
					
					"Welp that's your bladder asking you to go to the toilet, \n"
					+"at least he can't find you in here now", //9 toilet
					
					"Ms Miller asked you for your long dued art homework. \n"
					+"You continued running as you realised \n"
					+"that was the reason why you have to go to SHAFT >:0", //10 art
					
					"AYOOO is that you bro, your friend ran to you for a hug. At that moment, \n"
					+"you see Mr Airdrie come over to the common room. You hide under the table \n"
					+"and he asked your friends if they have seen you. \n"
					+"They told him you were in the library so he left.", //11 common room
					
					"You headed for the door but it was closed by the reception \n"
					+"so you continued running down the hallway.", //12 door 
					
					"A cup of iced coffee would be nice right now! I should grab one"
					+"really quick before I go", //13 (joma)
					"Oh no! Mr Casey and his class just saw you, oh wait \n"
					+ "they're just a bunch of sleep-deprived CS Students. Where to next now?", //14 (cs classroom)
					
					"Running out to finally catch a glimpse of fresh air, \n"
					+"you continued to jog out of the school's back door "
					+"as you have finally made it." //15 back gate
					
					};
		
		
		boolean playing = true; 
		ArrayList<String> leaderBoardNames = new ArrayList<String>();
		ArrayList<Integer> leaderBoardScores = new ArrayList <Integer>();
		
		while (playing) {
			long startTime = Instant.now().toEpochMilli();
			int currentRoom = 0; 
			boolean go = false;
			int tries = 0;
			
			System.out.println("Enter the level you want to play in: (easy/medium/hard)");
			Scanner levelInput = new Scanner (System.in); 
			String getLevel = levelInput.nextLine(); 
			int level = getLevel(getLevel); 
			
			int totalRoom = 0;
//			if (level == 0) {
//				totalRoom = 9;
//				String [] roomDescription  = easyDescriptions;
//			}
//			else {
			totalRoom = 15;
//			}
			
			
			
			
			System.out.println(mediumDescriptions[currentRoom]);
			
			while (currentRoom != totalRoom) {	
				System.out.println("Enter the direction (n/s/e/w) to go or X to exit game "); 
				Scanner input = new Scanner (System.in);
				String direction = input.nextLine();
				int directionNum = chooseDirection(direction); 
				
				if (directionNum == 4) {
					System.out.println("Game Over </3");
					System.exit(0); 
				} else if (directionNum == 5){
					if (stack.isEmpty()) {
						System.out.println("Stack is empty");
					}
					else {
						int newDirection = (int) stack.pop();
						currentRoom = mediumMaze[currentRoom][newDirection];
						System.out.println(mediumDescriptions[currentRoom]);
				}
				}
				
				else {
					go = checkDirection(currentRoom,directionNum,mediumMaze);
					if (directionNum==0) {
						stack.push(2);
					} else if (directionNum==1) {
						stack.push(3);
					} else if (directionNum==2) {
						stack.push(0);
					} else {
						stack.push(1);
					}

					
					if (go) {
						currentRoom = mediumMaze[currentRoom][directionNum];
						System.out.println(mediumDescriptions[currentRoom]);
					} else {
						System.out.println("Oh no there's a wall! Run fast before Mr. Airdrie catches you");
						tries++;
					}
					
				}
				
				
				
			}
			System.out.println("Congrats! You have escaped from SHAFT!");
			System.out.println("You took " + tries + " tries");
			long endTime = Instant.now().toEpochMilli(); 
			long timeElapsed = (endTime - startTime)/1000; 
			System.out.println("The execution time is "+timeElapsed+"seconds.");
			
			leaderBoardScores.add(tries);
			System.out.println("Enter your name:");
			Scanner input = new Scanner (System.in);
			String name = input.nextLine();
			leaderBoardNames.add(name);
			playing = playAgain();
			
		}
		int n = 0;
		for (int i : leaderBoardScores) {
			n++;
		}
		
		System.out.println("Score Board");
		for (int m = 0;m<n;m++) {
			System.out.println(leaderBoardNames.get(m)+": "+leaderBoardScores.get(m)+"tries");
		}
		
	}

}
