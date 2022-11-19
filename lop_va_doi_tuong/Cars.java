package lop_va_doi_tuong;

public class Cars {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Cars(String name, String engine){
        this.name = name;
        this.engine =engine;
        numberOfCars++;
    }

}

