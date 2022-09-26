import models.*;
import models.dataSaver.DataSaver;
import models.dataSaver.FileDataSaver;
import models.dataSaver.InMemoryDataSaver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");

        final int x = 10; //deklarace konstanty (final)
        final double pi = 3.14;

        ExampleClass2 exampleClass2 = new ExampleClass2(); //instance třídy

        exampleClass2.pokus();

        System.out.println(MyMathClass.pi);

        int resultSum = MyMathClass.sum(10,20);

        ExampleClass2.InnerClass inner = new

        //Vehicle skoda = new Vehicle("Škoda");
        Car skodaFabia = new Car("Škoda", "ryhle");

        Box<Car> boxOfCar = new Box<>(skodaFabia);

        Box<String> boxOfString = new Box<>("Hello");

        Box<Integer> boxOfInt = new Box<>(20);

        Car car2 = boxOfCar.getData();


        Pair<Integer, Car> pairOfCar = new Pair<>(1, skodaFabia);

        Pair<String, String> pairOfStr = new Pair<>("key", "val");

        Box<Pair<Integer, Car>> pairOf = new Pair<>();

        DataSaver<String> dataSaver;

        if (true){
            dataSaver = new FileDataSaver<>();
        }
        else{
            dataSaver = new InMemoryDataSaver<>();
        }


        System.out.println(dataSaver.load());

        try{
            dataSaver.save("My text");
        }catch (NullPointerException e){
            System.out.println("Nepodařilo se uložit");
        }
        catch (Exception e){
            dataSaver = new InMemoryDataSaver<>();
            dataSaver.save("My text");

            System.out.println("Nepodařilo se uložit");

        }

        //teorie: vlákno - paralelní zpracovávání dat, typy souborů - XML - párové znaky; co je VCS - version control system; co je HTTP;
        // co je protokol - sada pravidel, podle kterých probíhá komunikace; stream; socket;

    }
}
