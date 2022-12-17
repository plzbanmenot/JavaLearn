package org.example.classes;

public class SubClasses {
    int a = 0;
    static int st = 1;
    public SubClasses(){
        System.out.println(SubSubStatic.b);
    }

    class SubSubClass{
        public SubSubClass(){
            a = 10;
        }
    }
    static class SubSubStatic{

        private static int b = 15;
        void setOuterClassValue(){
            SubClasses.st = 10;
            //SubClasses.this.a = 11; // неправильно.
                        // Попытка обращения из статического контекста к нестатической переменной
            SubClasses sc = new SubClasses();
            sc.a = 11; // правильно
        }

    }

    class SubInnerExt extends SubInnerClass{
        void tryOuterVars(){
            SubInnerExt.this.siA = 123; // работает. Мы наследуемся и видим все поля
            siA = 125; // и тоже работает.
            a = 124; // тоже работает. Мы внутри класса
            // SubInnerClass - прилегающий класс.
        }
    }
}

class SubInnerClass{
    int siA = 1;
}
