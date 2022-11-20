public class Driver extends Employee{
    @Override
    public void say() {
        System.out.println("The driver is talking!");

    }

    @Override
    public void firstAid() {
        System.out.println("The driver will help us!");
    }

    @Override
    public void swim() {
        System.out.println("The driver could not swim in teh water!");
    }

    public void driving(){
        System.out.println("The driver drivers teh car!");

    }
}
