public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int times = 0;
        while (n > 0) {
            if (n % 2 == 0){n = n / 2;}
            else{n--;}
            times++;
        }
        System.out.println(times);
    }
}
