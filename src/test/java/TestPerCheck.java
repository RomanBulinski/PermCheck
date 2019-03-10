import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPerCheck {


    @Test
    public void testSolution(){
        PermCheck permCheck = new PermCheck();
        int[] A = { 1,2,3,4 };
        assertEquals(  1,  permCheck.solution( A )  );
    }

    @Test
    public void testSolution2(){
        PermCheck permCheck = new PermCheck();
        int[] A = { 13,12,10,11,14 };
        assertEquals(  1,  permCheck.solution( A )  );
    }

    @Test
    public void testSolution3(){
        PermCheck permCheck = new PermCheck();
        int[] A = { 13,12,11,14,8 };
        assertEquals(  0,  permCheck.solution( A )  );
    }




}