package JavaLearn.interfaces;

public class RunTests implements ConstantsInterface,
        DefaultInterface, StaticInterface, DuplicateRunInterface{

    public void run(){
        System.out.println("Override run");
    }

    public static void main(String[] args){
        //ConstantsInterface.BASE_VAL = 1; // Ошибка компиляции - попытка присвоить значение константе
        System.out.println(ConstantsInterface.BASE_VAL);
        DefaultInterface def = new RunTests();
        RunTestsSecond run2 = new RunTestsSecond();
        def.defTest(); //Default implementation run
        def = run2;
        def.defTest(); // Override defTest
        StaticInterface.staticTest();
    }
}
