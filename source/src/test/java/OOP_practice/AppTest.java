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
        sony.printTimeStamp();
    }

    @Test
    public void shouldturnON()
    {

        Television sony = new Television();
        TV_remote remote = new TV_remote();
        remote.turnON(sony);
    }

    @Test
    public void shouldturnOFF()
    {

        Television sony = new Television();
        TV_remote remote = new TV_remote();
        remote.turnOFF(sony);
    }

    @Test
    public void shouldVolumeUP()
    {

        Television sony = new Television();
        TV_remote remote = new TV_remote();
        remote.volumeUP(sony);
    }

    @Test
    public void shouldVolumeUP_twice()
    {

        Television sony = new Television();
        TV_remote remote = new TV_remote();
        remote.volumeUP(sony);
        remote.volumeUP(sony);
    }

    @Test
    public void shouldVolumeUP_quad()
    {

        Television sony = new Television();
        TV_remote remote = new TV_remote();
        remote.volumeUP(sony);
        remote.volumeUP(sony);
        remote.volumeUP(sony);
        remote.volumeUP(sony);
    }


    /**
     * Testing Televison functionalities
     */
    
}
