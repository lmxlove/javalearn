package learn;

import org.jetbrains.annotations.NotNull;

/**
 * @author <lmx>
 * @since 2022/11/1 13:58
 */
public class learn33 {
  @FunctionalInterface
  interface People2 {
    void run();
  }

  public static void pk(@NotNull  People2 p) {
      // @NotNull是什么,限制参数不是null但可以为空
    System.out.println("跑步轻快");
    p.run();
  }

  public static void main(String[] args) {

    People2 p =
        () -> {
          System.out.println("run");
        };
   /*  People2 pk=()->{
        System.out.println("跑的很快");
     };*/
    pk(
        () -> {
          System.out.println("跑得很快");
        });

    p.run();
  }
}
