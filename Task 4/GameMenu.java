import java.util.ArrayList;

class GameMenu{
	
ArrayList<String> actions = new ArrayList<>();

GameMenu(ArrayList<String> actions){
this.actions = actions;

}

public void displayMenu(){
for(String action: actions){
	System.out.println(action);
}

}

}