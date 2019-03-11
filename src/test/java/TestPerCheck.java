import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPerCheck {


    @Test
    public void testRepetedNumber(){
        PermCheck permCheck = new PermCheck();
        int[] A = { 1,2,3,4,4 };
        assertEquals(  0,  permCheck.solution( A )  );
    }

    @Test
    public void testSimpleCheck_1(){
        PermCheck permCheck = new PermCheck();
        int[] A = { 13,12,10,11,14 };
        assertEquals(  1,  permCheck.solution( A )  );
    }

    @Test
    public void testSimpleCheck_0(){
        PermCheck permCheck = new PermCheck();
        int[] A = { 13,12,11,14,8 };
        assertEquals(  0,  permCheck.solution( A )  );
    }

    @Test
    public void testArrayLength_2(){
        PermCheck permCheck = new PermCheck();
        int[] A = { 13,11 };
        assertEquals(  0,  permCheck.solution( A )  );
    }

    @Test
    public void testArrayLength_1(){
        PermCheck permCheck = new PermCheck();
        int[] A = { 11 };
        assertEquals(  1,  permCheck.solution( A )  );
    }

    @Test
    public void testREpetedNumbers(){
        PermCheck permCheck = new PermCheck();
        int[] A = { 10,11,11,11,11,15 };
        assertEquals(  0,  permCheck.solution( A )  );
    }



}
