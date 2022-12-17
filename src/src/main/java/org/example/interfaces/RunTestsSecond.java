package JavaLearn.interfaces;

public class RunTestsSecond implements DefaultInterface{
    @Override
    public void run() {
        System.out.println("Another run");
    }

    @Override
    public void defTest() {
        //DefaultInterface.super.defTest();
        System.out.println("Override defTest");
    }
}
