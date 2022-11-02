package learn;


import lombok.Data;

/**
 * @author <lmx>
 * @since 2022/11/2 19:46
 */
public class study1 {
  @Data

  public class User {
    private int id;
    private String name;
    private String password;
  }

  public void main(String[] args) {
    User user = new User();
    user.setId(1);
    user.setName("jj");
    System.out.println(user.getId());
    System.out.println(user.getName());

  }

}
