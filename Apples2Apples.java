public class Apples2Apples{
    public static void main(String[] argv){
        MainMenu menu = new MainMenu();
        menu.showMenu();
        while(true){
            int input = menu.getMenuInput();
            switch(input){
                case 1:
                    Server server = new Server();
                    break;
                case 2:
                    Client client = new Client();
                    break;
                case 3:
                    System.out.println("Have a nice day!");
                    break;
                default:
                    System.out.println("The specified input was not valid!");
                    continue;
            }
            break;
        }
    }
}