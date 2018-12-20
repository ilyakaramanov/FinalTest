package ua.org.oa.ilyakaramanov;

/*
Класс MyBook наследуется от класса Book
Переопределяет его методы
 */

public class MyBook extends Book {
    @Override
    void setTitle(String s) {
        title = s;
    }

    String getTitle() {
        return "The title is: " + title;
    }
}
