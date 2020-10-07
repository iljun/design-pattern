package simpleFactory;

public class Hello {

    String greeting(String lang) {
        var language = factory(lang);
        return language.text();
    }

    public static Language factory(String lang) {
        if (lang.equals("ko")) {
            return new Korea();
        } else {
            return new English();
        }
    }
}
