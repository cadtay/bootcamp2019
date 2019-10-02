package commanchesterdigital;

public class Navigator {
    public static Integer x = 0;
    public static Integer y = 0;

    public static void main(String[] args) {
        System.out.println("Current position is " + Navigator.x + ", "+ Navigator.y + "Facing north");
        forward(5);
    }

    public static Integer forward(int numOfStepsForward){
        int newPositionX = 0;
        newPositionX =  x + numOfStepsForward;
        System.out.println("New position " + newPositionX + ", " + Navigator.y );
        return newPositionX + Navigator.y;
    }

    public static Integer backwards(int numOfStepsBackwards){
        return 0;
    }

    public static Integer left(int numOfStepsLeft){
        return 0;
    }

    public static Integer right(int numOfStepsRight){
        return 0;
    }

    public static Integer rotate(int rotation){
        return 0;
    }
}
