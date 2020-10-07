package factory;

public class Hello {

    String greeting(String lang) {
        var language = Factory.getInstance(lang);
        return language.text();
    }
}
