public class Teacher extends Employee{
    @Override
    public void say() {
        System.out.println("Tell the teacher!");

    }
    public void teaching(){
        System.out.println("The teacher teaches us!");


    }

    @Override
    public void firstAid() {
        System.out.println("The teacher helps us!");
    }

    @Override
    public void swim() {
        System.out.println("The teacher can swim!");
    }
}
