import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        int min = 7 ;
        int[] list = {a,b,c,d};
        int num1= 0, num2 =0;
        for (int i = 0; i < list.length; i++) {
            map.put(list[i],map.getOrDefault(list[i],0)+1);
            if(min > list[i]) min = list[i];
        }
        Arrays.sort(list);
        int[] count = new int[4];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                if(num1 == 0){
                    num1 = entry.getKey();
                }else{
                    num2 = entry.getKey();
                }
            }
            map2.put(entry.getValue(),entry.getKey());
            count[entry.getValue()-1]++;
        }
        if(count[3] == 1){
            return 1111*a;
        }else if(count[2] == 1){
            int result = (10*map2.get(3)) + map2.get(1);
            return result*result;
        }else if(count[1] >= 1){
            if(count[1] == 1){
                return num1 * num2;
            }else{
                return (list[0]+list[3]) * (Math.abs(list[0]-list[3]));
            }
        }else{
            return min;
        }
    }
}