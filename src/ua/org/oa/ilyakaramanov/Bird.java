package ua.org.oa.ilyakaramanov;

/*
Класс Bird наследует Animal
Переопделеляет его метод и дополняется своим
 */

public class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}
