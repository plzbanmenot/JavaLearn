package JavaLearn.interfaces;

public interface DefaultInterface {
    void run();

    default void defTest(){
        System.out.println("Default implementation run");
    }
}
