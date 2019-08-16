package inheritancepackage;

public class Eagle extends Animal {
    @Override
    public void Hunt() {
        //super.Hunt();
        System.out.println("Eagles hunting...");
    }

    public  void Fly()
    {
        System.out.println("Eagles flying...");
    }
}
