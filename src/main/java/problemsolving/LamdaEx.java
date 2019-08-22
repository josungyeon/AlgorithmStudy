package problemsolving;

/**
 * Created by sungyeonjo on 2019. 8. 20..
 */
public class LamdaEx {
    public static void exec(Compare compare) {
        int a = 10;
        int b = 20;
        System.out.println(compare.compareTo(a, b));
    }

    public static void main(String[] args) {
        exec((i, j) -> {
            return i+j;
        });
    }
}

interface Compare {
    int compareTo(int a, int b);
}
