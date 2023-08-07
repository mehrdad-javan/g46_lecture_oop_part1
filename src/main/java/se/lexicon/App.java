package se.lexicon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {



        /*Car volvoObj = new Car();
        volvoObj.brand = "VOLVO";
        volvoObj.model="V60";

        System.out.println(volvoObj.carInfo());


        Car vwObj = new Car();
        vwObj.brand = "VW";
        vwObj.model="ID 4";
        vwObj.mileage = 500;
        vwObj.year = null;

        System.out.println(vwObj.carInfo());*/



        /*Car volvoCar = new Car();
        volvoCar.setBrand("Volvo");
        volvoCar.setModel("V60");
        volvoCar.setColor(null);
        volvoCar.setYear(2022);

        System.out.println(volvoCar.getMileage()); // 0.0
        System.out.println(volvoCar.getColor()); // GRAY


        System.out.println("---------------------------");

        Person erik = new Person("Erik","Svensson", "123456-1111", 42, false);
        System.out.println(erik.personInfo());

        Person test = new Person("Test", "Testsson", "000000-0000",22);
        test.setFirstName("Maria");
        test.setLastName("Svensson");

        System.out.println(test.personInfo());
         */


        /*Person anahita = new Person();
        System.out.println(anahita.getFirstName()); // null
        anahita.setFirstName("Anahita");
        System.out.println(anahita.getFirstName()); // Anahita*/


        Person simon = new Person("Simon", "Elbrink", "123456-0000", 30);
        Car volvo = new Car("VOLVO", "V70");

        System.out.println(simon.personInfo());
        System.out.println(volvo.carInfo());
        volvo.setOwner(simon);
        System.out.println(volvo.carInfo());



    }
}
