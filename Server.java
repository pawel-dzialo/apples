import java.util.Scanner;

public class Server {
    GameMode game;
    final int amountOfModes = 1;
    public Server(){
        this.game = gamemodeSetup();
        serverSetup();
    }

    private void serverSetup(){

    }
    private GameMode gamemodeSetup(){
        Scanner scanner = new Scanner(System.in);
        GameMode gamemode;
        System.out.println("Select a game mode:");
        System.out.println("[1]Classic");
        switch(getUserInput(1,amountOfModes)){
            case 1:
                gamemode = new Classic();
                break;

        }
        scanner.close();
        return gamemode;

    }

    //Get user input from the selected range
    private int getUserInput(int lower_range, int upper_range){
        Scanner scanner = new Scanner(System.in);
        int input;
        while(true){
            try{
                input = Integer.parseInt(scanner.nextLine());
                if(lower_range<=input&&input<=upper_range){
                    break;
                }
                else{
                    System.out.println("The selected option is not available");
                }
            }
            catch(Exception e){
                System.out.println("The specified input did not contain a valid integer!");
            }
        }
        return input;
    }
}
