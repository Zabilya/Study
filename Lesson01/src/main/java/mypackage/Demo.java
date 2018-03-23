package mypackage;
import static mypackage.DemoUtils.myUtilsStaticMethod;

/**
 * @author Kirill Nigmatullin
 */
public class Demo {

    public static void main(String[] args) {

        // Варианты вызова статического метода внутри класса или внутри одного и того же файла.java
        // 1) метод() - короткий синтаксис. Этот способ нужно запомнить, как чаще всего используемый для вызова из класса собственного статического метода
        staticMethodExample();

        // 2) Класс.метод() - обычный синтаксис.
        Demo.staticMethodExample();

        // 3) пакеты.Класс.метод() - полный путь или fully-qualified name + имя_метода()
        mypackage.Demo.staticMethodExample();

        // 3) экземпляр.метод() - обычно не используется так, IDEA подсвечивает, но такое возможно и выполнится без ошибок
        Demo demo = new Demo();
        demo.staticMethodExample();


        // Теперь такими же способами вызови статический метод myUtilsStaticMethod() из класса соседнего файла DemoUtils.java
        // 1) подсказка, понадобится сделать статический импорт
        myUtilsStaticMethod();

        // 2) Этот способ нужно запомнить, как чаще всего используемый для вызова статического метода из друго класса
        DemoUtils.myUtilsStaticMethod();
        // 3) этот способ кажется громоздким, но его нужно знать
        mypackage.DemoUtils.myUtilsStaticMethod();
        // 4) этот способ не используется, но он работает и его тоже нужно знать
        DemoUtils demoUtils = new DemoUtils();
        demoUtils.myUtilsStaticMethod();
    }

    public static void staticMethodExample() {
        System.out.println("inner static method");

    }
}
