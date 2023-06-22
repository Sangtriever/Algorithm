class Solution {
    public int[] solution(int[] arr, int k) {
        if(k % 2 == 0) arr = jjack (arr, k);
        else arr = hole(arr,k);
        return arr;
    }
    public int[] jjack (int[] arr, int k){
        for (int i = 0; i < arr.length; i++){
            arr[i] += k;
        }
        return arr;
    }
    public int[] hole (int[] arr, int k){
        for (int i = 0; i < arr.length; i++){
            arr[i] *= k;
        }
        return arr;
    }
}