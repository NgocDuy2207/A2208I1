package lop_va_doi_tuong;

public class TestStaticProperty {
    public static void main(String[] args) {
        Cars car1 = new Cars("Mazda 3", "Skyactiv 4");
        System.out.println(Cars.numberOfCars);
        Cars car2 = new Cars("Toyota", "Skyactiv 6");
        System.out.println(Cars.numberOfCars);
    }


}
