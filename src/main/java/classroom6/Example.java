package classroom6;

import com.github.javafaker.Faker;

public class Example {
    public static void main(String[] args) {
        System.out.println("maven");
        Employee employeeOne = new Employee("Juris Muris", "IT", 5000 );
        System.out.println(employeeOne.toString());

        Faker faker =  new Faker();
        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.company().profession());

//        System.out.println(faker.address().city());
//        System.out.println(faker.color().name());
//        System.out.println(faker.company().industry());

        Employee employeeTwo = new Employee(faker.name().firstName(),faker.company().profession(),
                faker.number().randomDouble(2,1000,20000));
        System.out.println(employeeTwo.toString());

        Employee employeeThree = new Employee();
        System.out.println(employeeThree.toString());

        Employee employeeFour = new Employee();
        System.out.println(employeeFour.toString());

        //uztaisit ciklu, kas uztaisis 100 jaunus employees un katru izvadis uz ekrana

//        for (int i=0; i < 100; i++){
//            Employee employee = new Employee();
//            System.out.println(employee.toString());
//        }


    }

}
