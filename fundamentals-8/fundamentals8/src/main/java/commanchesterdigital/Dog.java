package commanchesterdigital;

public class Dog {

   private String breed;
   private String dogColour;
   private Integer age;
   private Integer eyeColour;
   private Integer aggressionLevel;
   private DogSize dogSize;
   private Integer hungerLevel;

    public Dog(DogSize dogSize) {
        this.dogSize = dogSize;
    }

    public void bark(){
       System.out.println(dogSize.getNoise());
   }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setDogColour(String dogColour) {
        this.dogColour = dogColour;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEyeColour(Integer eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void setAggressionLevel(Integer aggressionLevel) {
        this.aggressionLevel = aggressionLevel;
    }

    public void setHungerLevel(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void hungry (){
        if (hungerLevel > 10){
            for (int i = 0; i < 10; i++) {
                bark();
            }
            System.out.println("Gimmee food!!" + dogSize.getNoise() );
        }

        else{
            System.out.println("Im Stuffed");
        }
   }
}
