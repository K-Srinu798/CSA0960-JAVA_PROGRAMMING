import java.util.Scanner;
class switchcase {
    public static void main(String[] args){
        Scanner sv = new Scanner(System.in);
        
        System.out.println("Enter the colour: ");
        String input = sv.nextLine();
        switch(input){
            case "green":
            System.out.println("#1");
            break;
            case "red":
            System.out.println("#2");
            break;
            case "black":
            System.out.println("#3");
            break;
            default:
            System.out.println("Colour is not matched");
        }

    }
    
}
