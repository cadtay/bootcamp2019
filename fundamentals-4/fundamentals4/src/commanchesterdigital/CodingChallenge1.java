package commanchesterdigital;

public class CodingChallenge1 {

    public static void main(String[] args) {
        party(10,5);
    }

    private static Integer party (int tea, int candy){
   if(tea <5 && candy <5){
       System.out.println("0");
       return 0;
   }

   else if(tea >= (candy * 2)  || candy >= (tea *2) ){
       System.out.println("2");
       return 2;
   }
        System.out.println("1");
   return 1;
    }
}
