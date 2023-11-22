public class Cars {
    String cars;

    Cars(String car){
        cars = car;
        System.out.println("Brand " + cars);

    }

    public static void main(String[] args) {
        Cars bmw = new Cars("BMW ");
        Cars suzuki = new Cars("SUZUKI ");
        Cars audi = new Cars("AUDI ");
        Cars benz = new Cars("BENZ ");

    }
}
