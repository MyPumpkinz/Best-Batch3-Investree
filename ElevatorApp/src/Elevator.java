import java.util.Scanner;

public class Elevator {
    public static void sistemElevator(){
        Scanner sc = new Scanner(System.in);
        int currentFloor=1;
        do{
            System.out.println("Go to Floor :");
            int input = sc.nextInt(); // https://www.javatpoint.com/how-to-get-input-from-user-in-java
            int i;
            terminate(input);
            if(input > currentFloor) {
                for( i = currentFloor; i < input; i++) {
                    System.out.println("Elevator at floor " + i);
                }
            }
            else {
                for( i = currentFloor; i > input; i--) {
                    System.out.println("Elevator at floor " + i);
                }
            }
            System.out.println("Elevator stop at floor "+ i);
            checkFloor(currentFloor, input);
            currentFloor = input; //update
        }while(true);
    }

    static void terminate(int input){
        if (input == -1) {
            System.exit(0);
        }//https://stackoverflow.com/questions/66085060/how-to-stop-a-program-with-user-input
    }

    static void checkFloor(int CurrentFloor,int input){
        if(CurrentFloor == input){
            System.out.println("heii you still in "+ CurrentFloor + " floor. Pick the another floor");
        }
    }//https://www.delftstack.com/howto/java/how-to-call-a-variable-in-another-method/
}