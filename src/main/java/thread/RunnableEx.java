package thread;

/**
 * Created by sungyeonjo on 2019. 8. 20..
 */
public class RunnableEx {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println(i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });
        thread.start();
    }

}
