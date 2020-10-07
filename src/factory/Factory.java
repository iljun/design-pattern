package factory;

public class Factory {

    static Language getInstance(String language) {
        if (language.equals("ko")) {
            return new Korea();
        } else {
            return new English();
        }
    }
}
