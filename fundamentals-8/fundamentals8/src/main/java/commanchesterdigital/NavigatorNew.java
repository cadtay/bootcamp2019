package commanchesterdigital;

public class NavigatorNew {
    private Integer forward;
    private Integer backwards;
    private Integer left;
    private Integer right;
    private Integer finalPosx = 0;
    private Integer finalPosy = 0;

    public NavigatorNew(Integer forward, Integer backwards, Integer left, Integer right) {
        this.forward = forward;
        this.backwards = backwards;
        this.left = left;
        this.right = right;
    }

    public void forward(){
        int newPosY = 0 + forward;
        finalPosy = newPosY;
        System.out.println("Moved forward " + newPosY + " Steps");
        System.out.println("New position after moving forward " + finalPosx + "," + finalPosy);
    }

    public void backward(){
    int newPosYBackwards = finalPosy - backwards;
    finalPosy = newPosYBackwards;
    System.out.println("New position after moving back " + finalPosx + ", " + finalPosy );

    }

    public void  left(){
        int newPosLeft = finalPosx - left;
        finalPosx = newPosLeft;
        System.out.println("New position after moving left " + finalPosx + ", " + finalPosy);
    }

    public void  right(){
        int newPosRight = finalPosx + right;
        finalPosx = newPosRight;
        System.out.println("New position after moving right " + finalPosx + ", " + finalPosy);
    }

    public void  rotate(int rotation){

    }
}
