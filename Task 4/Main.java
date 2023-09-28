import java.util.ArrayList;
class Main{

	public static void main(String[]args){
    ArrayList<String> gameOptions = new ArrayList<>();
    
    gameOptions.add("Start game");
    gameOptions.add("Resume game");
    gameOptions.add("Pause game");
    gameOptions.add("End game");

GameMenu t1 = new GameMenu(gameOptions);
t1.displayMenu();


}

	
}