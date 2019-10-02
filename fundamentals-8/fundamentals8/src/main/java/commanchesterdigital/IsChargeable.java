package commanchesterdigital;

public interface IsChargeable {

    void supercharge();
    default void describe(){
        System.out.println("Im green");
    }

}
