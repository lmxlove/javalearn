package learn;

/**
 * @author <lmx>
 * @since 2022/11/1 12:12
 */
public class learn30 {
  public static void main(String[] args) {
    SpeakeElephant speakeElephant;
    SpeakeCar speakeCar;
    speakeElephant=new SpeakeElephant();
    speakeCar=new SpeakeCar();
    speakeElephant.start();
    speakeCar.start();
    for (int i=1; i<=20;i++){
      System.out.println("主人"+i+" ");
    }
  }
  public static class SpeakeElephant extends Thread{
    @Override
    public  void run() {
      for (int i=1; i<=20;i++){
        System.out.println("大象"+i+"");
      }
    }
  }
  public static class SpeakeCar extends Thread{
    @Override
    public  void run() {
      for (int i=1; i<=20;i++){
        System.out.println("轿车"+i+"");
      }
    }
  }
}
