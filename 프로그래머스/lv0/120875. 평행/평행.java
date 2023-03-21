class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        boolean same = false;
        // 12 34
        same = slope(dots[0],dots[1],dots[2],dots[3]);
        if(same)return 1;
        // 13 24
        same = slope(dots[0],dots[2],dots[1],dots[3]);
        if(same)return 1;
        // 14 23
        same = slope(dots[0],dots[3],dots[1],dots[2]);
        if(same)return 1;
        return 0;
    }
    public boolean slope (int[] a, int[] b,int[] c, int[] d){
        double slope1 = ((double) a[1]-b[1])/ (a[0]-b[0]);
        double slope2 = ((double) c[1]-d[1])/ (c[0]-d[0]);
        System.out.println(slope1);
        System.out.println(slope2);
        System.out.println();
        if(slope1 == slope2){
            return true;
        }else{
            return false;
        }
    }
}