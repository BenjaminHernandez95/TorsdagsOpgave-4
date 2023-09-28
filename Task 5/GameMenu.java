import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
Scanner scanner = new Scanner(System.in);	
ArrayList<String> actions = new ArrayList<>();

GameMenu(ArrayList<String> actions){
this.actions = actions;

}

public void displayMenu(){
for(String action: actions){
	System.out.println(action);
}
}

public String getAction(){
displayMenu();
System.out.println("What action would you use?");

String choice = scanner.nextLine();
return choice;

}

}