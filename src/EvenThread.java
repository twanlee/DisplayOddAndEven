public class EvenThread implements Runnable{

    @Override
    public void run() {
        try {
            for (int i=0; i<10; i+=2){
                System.out.println(i);
            }
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
