import java.util.Arrays;

public class PermCheck {

        public int solution(int[] A){

            Arrays.sort(A);
            int length = A.length -1;
            int start = A[0];
            int end = A[A.length-1];

            if( length == end - start){
                return 1;
            }
            return 0;
        }


}
