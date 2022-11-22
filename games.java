package sports;

abstract class OutdoorGame
{
    abstract void play();
}

class Football extends OutdoorGame
{
    void play()
    {
        System.out.println("Playing Football");
    }
}

class Cricket extends OutdoorGame
{
    void play()
    {
        System.out.println("Playing Cricket");
    }
}



public class games {

    public static void main(String args[])
    {
        System.out.println("Package Sports");

        Football fobj1=new Football();
        fobj1.play();

        Cricket cobj1=new Cricket();
        cobj1.play();
    }
}