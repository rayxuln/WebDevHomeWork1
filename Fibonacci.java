

public class Fibonacci{

    static final int MAX_N = 201;
    static long[] nums;
    static boolean isInit = false;

    private static void init(){
        nums = new long[MAX_N];
        for (int i=0;i<MAX_N;++i) nums[i] = 0;
        isInit = true;
    }
    
    public static long of(int n){
        if(!isInit) init();

        if(n == 1) return 1;
        if(n == 2) return 1;
        if (nums[n] != 0) return nums[n];
        nums[n] = of(n-1) + of(n-2);
        return nums[n];
    }
}