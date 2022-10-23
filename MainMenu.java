import java.util.Scanner;
public class MainMenu {
    public MainMenu(){
    }
    public void showMenu(){
        System.out.println("Welcome to Apples2Apples!");
        System.out.println("Select an option:");
        System.out.println("[1]Start Game as Server");
        System.out.println("[2]Join Game as Client");
        System.out.println("[3]Quit");
    }
    public int getMenuInput(){
        int input;
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                input = Integer.parseInt(scanner.nextLine());
                break;
            }
            catch(Exception e){
                System.out.println("The specified input did not contain a valid integer!");
            }
        }
        scanner.close();
        return input;
    }
}
