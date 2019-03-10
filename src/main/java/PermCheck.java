import java.util.*;
import java.util.stream.Collectors;

public class PermCheck {

        public int solution(int[] A){


            List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
            Set<Integer> setA = new HashSet<>(list);

            if( list.size() != setA.size() ){
                return 0;
            }

            int[] intArray = setA.stream().mapToInt(Integer::intValue).toArray();

            int length = intArray.length-1;

            int start = intArray[0];
            int end = intArray[intArray.length-1];

            if( length == end - start){
                return 1;
            }
            return 0;
        }


}
