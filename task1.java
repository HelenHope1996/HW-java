public class task1 {
    public static void main(String[] args) {
        int num[] = new int [] {1, 2 , 9 , 0, 5, 4, 3};
        int min = num[0];
        int max = num[0];
        for(int i = 1; i < num.length; i++) {
            if(num[i] > max) max = num [i];
            else if (num[i] < min) min = num[i];
        }
        System.out.println("Максимум: " +max);
        System.out.println("Минимум: " +min);

        
    }
}
