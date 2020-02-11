import java.util.Random;

public class Main {
    public static void  main(String[] args){
        Random rand = new Random();
        int min = 5000;
        int max = 0;
        int l = 0;
        double ver = 0;
        int number;
        for (int o = 0; o<5; o++) {
            for (int i = 0; i<5000; i++) {
                number = rand.nextInt();
                if (number%2==0&number!=0) {l++;}
            }
            if (min>l) {min=l;}
            if (max<l) {max=l;}
            ver = ver + ((double) l / 50);
            l = 0;
        }
        ver = ver/5;
        int raz = max-min;
        if (raz<101) {System.out.println("Генератор псевдочисел почти поровну создаёт чётные и не чётные числа");}
        else {System.out.println("Генератор псевдочисел не поровну создаёт чётные и не чётные числа");}
        System.out.println("Вероятность выпадения чётного числа равна " + ver/100);
    }
}
