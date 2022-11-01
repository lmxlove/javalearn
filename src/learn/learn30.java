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
    //魔法值是什么
    final int forNum=20;//不加这个，直接用20会报警告，不能使用魔法值
    for (  int i=1; i<=forNum;i++){
      System.out.println("主人"+i+" ");
    }
  }
  public static class SpeakeElephant extends Thread{
    @Override
    public  void run() {
      final int forNum=20;
      for (int i=1; i<=forNum;i++){
        System.out.println("大象"+i+"");
      }
    }
  }
  public static class SpeakeCar extends Thread{
    @Override
    public  void run() {
      final int forNum=20;
      for (int i=1; i<=forNum;i++){
        System.out.println("轿车"+i+"");
      }
    }
  }
}
