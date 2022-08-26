public class NumberGenerator implements Runnable {
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(name + i);
        }
    }

    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator("A");
        NumberGenerator num2 = new NumberGenerator("B");
        Thread thread1 = new Thread(num1);
        Thread thread2 = new Thread(num2);
        thread1.setPriority(10);
        thread2.setPriority(1);
        thread1.start();
        thread2.start();
    }
}
