package ua.org.oa.ilyakaramanov;

public class MyBook extends Book {
    @Override
    void setTitle(String s) {
        title = s;
    }

    String getTitle() {
        return "The title is: " + title;
    }
}
