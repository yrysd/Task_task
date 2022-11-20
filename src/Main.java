public class Main {
    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~Teacher~~~~~~~~~~~~~~~~~~~~~~~");
        Teacher teacher = new Teacher();
        teacher.say();
        teacher.teaching();
        teacher.firstAid();
        teacher.swim();

        Teacher teacher1 = new Teacher();
        teacher1.say();
        teacher1.teaching();
        teacher1.firstAid();
        teacher1.swim();


        System.out.println("~~~~~~~~~~~~~~~~~~POLIMORFIZM~~~~~~~~~~~~~~~~~~~~");

        Employee teacher2 = new Teacher();
        teacher2.say();
        teacher2.firstAid();
        teacher2.swim();


        Employee teacher3 =new Teacher();
        teacher3.say();
        teacher3.firstAid();
        teacher3.swim();




        System.out.println("~~~~~~~~~~~~~~~~~~~~~~Driver~~~~~~~~~~~~~~~~~~~~~~~");
        Driver driver = new Driver();
        driver.say();
        driver.driving();
        driver.firstAid();
        driver.swim();


        Driver driver1 = new Driver();
        driver1.say();
        driver1.driving();
        driver1.firstAid();
        driver1.swim();
        System.out.println("~~~~~~~~~~~~~~~~~~POLIMORFIZM~~~~~~~~~~~~~~~~~~~~");

        Employee driver2 = new Driver();
        driver2.say();
        driver2.firstAid();
        driver2.swim();

        Employee driver3 = new Driver();
        driver3.say();
        driver3.firstAid();
        driver3.swim();







    }
}