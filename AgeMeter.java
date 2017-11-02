import java.util.Scanner;

// This program takes the age of the user and comments on it.
class AgeMeter {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("Type any - single - key to start.....\n");
		@SuppressWarnings("unused")
		char start = userInput.next("[a-z, A-Z]").charAt(0);
		//System.out.println("");
		int age = 0;

		while(age < 100) {
			
			System.out.println("\nInput your age.\n");
			age = userInput.nextInt();
			System.out.println(" ");
			
			switch (age) {
			case 1:
				System.out.println("You can crawl.");
				break;
			case 2:
				System.out.println("You can walk.");
				break;
			case 3:
				System.out.println("You can talk.");
				break;
			case 4:
				System.out.println("You are in preschool.");
				break;
			case 6:
				System.out.println("You are in kindergarten.");
				break;
			case 7:
				System.out.println("You are in first grade.");
				break;
			case 8:
				System.out.println("You are in second grade.");
				break;
			case 9:
				System.out.println("You are in third grade.");
				break;
			case 10:
				System.out.println("You are in fourth grade.");
				break;
			case 11:
				System.out.println("You are in fifth grade.");
				break;
			case 12: case 13: case 14:
				System.out.println("You are in junior high school.");
				break;
			case 15: case 16: case 17: case 18:
				System.out.println("You are in high school.");
				break;
			case 19: case 20: case 21: case 22:
				System.out.println("You are in college.");
				break;
			case 23: case 24:
				System.out.println("You are probably still in college.?");
				break;
			case 25: case 26: case 27: case 28: case 29: case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40:
				System.out.println("You are living your life.");
				break;
		  /*case 54: case 55: case 56: case 57: case 58: case 59:
		   *	System.out.println("Something funny/different");
		   		break; */
			case 60: case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69:
				System.out.println("You are nearing retirement.?");
				break;
			case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 78: case 79:
				System.out.println("You are retired. Maybe? Hopefully? A few more years...");
				break;
			case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89:
				System.out.println("Great, keep up the good health!");
				break;
			case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99:
				System.out.println("Awesome, your living a long life. Congrats!");
			default:
				System.out.println("Slow Down! What age are you?!");
				break;
				
			}
		}
	}
}