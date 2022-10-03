package OOP_practice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Testing Student Object Class
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Student std = 
            new Student(
                    145,
                    "Steven",
                    "Pembroke University",
                    "187 Royal Lane"
                    );
        System.out.println(
            std.getStudentID()+"\t"+std.getStudentName()+"\n"+
            std.getStudentCollegeName()+"\t"+std.getStudentAddress());
    }


    /**
     * Testing TV_remote functionalities
     */
    @Test
    public void shouldPrintTimeStamp()
    {

        Television sony = new Television();
        System.out.println("------------Print time stamp test---------------");
        sony.printTimeStamp();
    }

    @Test
    public void shouldturnON()
    {

        Television sony = new Television();
        TV_remote remote = new TV_remote();
        System.out.println("----------------turn on tv test------------------------");
        remote.turnON(sony);
    }

    @Test
    public void shouldturnOFF()
    {

        Television sony = new Television();
        TV_remote remote = new TV_remote();
        System.out.println("----------------turn off tv test------------------------");
        remote.turnOFF(sony);
    }

    @Test
    public void shouldVolumeUP_once()
    {

        Television sony = new Television();
        TV_remote remote = new TV_remote();
        System.out.println("-----------------volume up once test---------------------");
        remote.volumeUP(sony);
    }

    @Test
    public void shouldVolumeUP_twice()
    {
        Television sony = new Television();
        TV_remote remote = new TV_remote();
        System.out.println("------------------volume up twice test---------------------");
        remote.volumeUP(sony);
        remote.volumeUP(sony);
    }

    @Test
    public void shouldVolumeUP_quad()
    {

        Television sony = new Television();
        TV_remote remote = new TV_remote();
        System.out.println("----------------------Volume up quad test---------------------");
        remote.volumeUP(sony);
        remote.volumeUP(sony);
        remote.volumeUP(sony);
        remote.volumeUP(sony);
    }

    @Test
    public void shouldVolumeDown_once()
    {

        Television sony = new Television();
        TV_remote remote = new TV_remote();
        System.out.println("--------------------Volume down once test---------------------");
        remote.volumeDOWN(sony);
    }


    /**
     * Testing Televison functionalities
     */
    
}
