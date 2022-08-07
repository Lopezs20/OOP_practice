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
}
