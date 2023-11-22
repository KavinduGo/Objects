public class programmingLang {

    String languages;

    programmingLang() {
        this.languages = "Java";
    }

    programmingLang(String languages) {
        this.languages = languages;

    }
    public void getName() {
        System.out.println("Programing Languages : " + this.languages);
    }

    public static void main(String[] args) {
        programmingLang pl = new programmingLang();
        programmingLang pl1 = new programmingLang("python");
        pl.getName();
        pl1.getName();
    }
}
