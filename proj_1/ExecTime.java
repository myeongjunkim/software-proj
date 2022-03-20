public class ExecTime{
    public static void main(String[] args){
        long startTime, endTime, execTime;
        int N = 1000000; // 반복 수행 횟수
        startTime = System.nanoTime();
        for (int i=0; i<N; i++) {// 반복 수행을 해서 측정을 하면, 보다 정확한 결과 // statement(s) to be measured
            isPrime(1237);
        }
        endTime = System.nanoTime();
        execTime = endTime-startTime;
        System.out.println("Execution Time in nano seconds = " + (double)(execTime/N));
    }

    static boolean isPrime(int n){
        boolean flag = true;
        for (int i=2; i<n; i++) {  
            if ( n%i == 0){
                flag = false;
                break;
            }
        }
        return flag;
            
    }

}