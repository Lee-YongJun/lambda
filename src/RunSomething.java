@FunctionalInterface
public interface RunSomething {
    //함수형 인터페이스
    //추상메서드가 하나
    //추상메서드 두개 x
    //abstract 생략가능.

    abstract void doIt();

//    //이것도 functionalInterface
//    static void printName() {
//        System.out.println("YongJun");
//    }
//
//    //이것도 functionalInterface
//    default void printAge() {
//        System.out.println("29");
//    }

}
