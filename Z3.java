class Man {
    private String i;  // Имя
	private String f;   // Фамилия
    private int y;     // Год рождения

    // Конструктор
    public Man (String i, String f, int y) {
        this.i = i;
        this.f = f;
        this.y = y;
    }

    public String getI() {
		return i;
	}

    // Метод, выводящий значения всех полей
    public void printVse() {
        System.out.println(f + " " + i +
                ", год рождения " + y);
    }

}

class Car {
    private String brand;         
    private int makeYear;  
    private double engineVolume;  

 
    public Car(String brand, int makeYear, double engineVolume) {
        this.brand = brand;
        this.makeYear = makeYear;
        this.engineVolume = engineVolume;
    }


    public void printVse() {
        System.out.println("Автомобиль: марка " + brand +
                ", год выпуска: " + makeYear +
                ", объём двигателя: " + engineVolume + " л");
    }

   
    public String getBrand()          { return brand; }
}

 class Book {
    private String title;    // Название
    private String avtor;   // Автор
    private int year;        // Год выпуска

    // Конструктор
    public Book(String title, String avtor, int year) {
        this.title = title;
        this.avtor = avtor;
        this.year = year;
    }

    // Метод, выводящий значения всех полей
    public void printVse() {
        System.out.println("Книга: «" + title + "», автор: " + avtor +
                ", год выпуска: " + year);
    }

    public void readBy(Man man, Car car) {
        System.out.println(man.getI() +
                " читает книгу «" + title +
                "» про машину " + car.getBrand() + ".");
    }

}

public class Z3 {
    public static void main(String[] args) {
        
        Man man = new Man("Иван", "Петров", 1990);
        Car car = new Car("McLaren M23", 1974, 1.6);
        Book book = new Book("Формула-1", "Автор", 2021);

        
        man.printVse();
        car.printVse();
        book.printVse();

        System.out.println();
        
        book.readBy(man, car);
        
        
    }
}