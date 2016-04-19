import java.io.*;
import java.util.*;

class main {
  public static void main(String[] args)
  throws IOException {
    BST campers = new BST();
    Scanner file = new Scanner(new FileReader("camp.txt"));
    String line;
    System.out.println("Welcome to Camp Posanivee.");
    while ((line = file.nextLine()) != null) {
		String[] curline = line.split(" ");
		switch (line.charAt(0)) {
		case 'H':
			handleH();
		case 'E':
			handleE(curline, campers);
		case 'W':
			handleW(curline, campers);
		case 'D':
			handleD(curline, campers);
		case 'A':
			handleA(curline, campers);
		case 'L':
			handleL(curline, campers);
		case 'S':
			handleS(curline, campers);
		case 'P':
			handleP(curline, campers);
		}
    }
  }

  static void handleH() {
      String help = "H: Print this help\n"
	  + "E: Enroll a new camper\n"
	  + "W: Withdraw a camper\n"
	  + "D: Display the age and gender of a camper\n"
	  + "A: Print the average age of the campers\n"
	  + "L: List all campers names in alphabetical order\n"
	  + "S: Print the number of boy and girl campers\n"
	  + "P: List all campers names in preoder\n"
	  + "Q: Quit";
      System.out.print(help);
  }

  static void handleE(String[] line, BST campers) {
      camper Camper = new camper();
      Camper.name = line[1];
      Camper.age = Integer.parseInt(line[2]);
      Camper.sex = line[3].charAt(0);
      campers.insert(Camper);
	  String gender = (Camper.sex == 'F') ? "female" : "male";
      System.out.println("Adding camper " + line[1]
			 + " with the age " + line[2]
			 + " and is " + gender);
  }

  static void handleW(String[] line, BST campers) {
	camper Camper = new camper();
	Camper.name = line[1];
	campers.delete(Camper);
	String gender = (Camper.sex == 'F') ? "female" : "male";
	System.out.println("Removing camper " + line[1]
			 + " with the age " + line[2]
			 + " and is " + gender);
  }

  static void handleD(String[] line, BST campers) {
		
  }

  static float handleA(String[] line, BST campers) {
      float total = 0;
      camper Camper = new camper();
      while(campers.search(Camper) != null)
	  total += Camper.age;
		System.out.println("Average age is: " + (int) total);
      return total/campers.size();
  }

  static void handleL(String[] line, BST campers) {

  }

  static void handleS(String[] line, BST campers) {

  }

  static void handleP(String[] line, BST campers) {

  }

  static void handleQ() {

  }
}
