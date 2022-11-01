package learn;

/**
 * @author <lmx>
 * @since 2022/10/30 13:45
 */
public class learn14 {
    class Student{

    }
    class GraduateStudent extends  Student{
        Student s=new GraduateStudent();//向上造型,把一个类的子类引用赋值给父类变量
        GraduateStudent g=(GraduateStudent) s;//向下造型，把父类对象赋值给子
        // 类对象需要强制类型转换，
        // 向下造型必须满足一个前提条件:父类对象必须是从子类对象向上造型过来的
        //对象造型机制有两个原则
        //1.对象只能转换为有继承关系的子类和父类对象，不能转换为没有继承关系的类的实例
        //2.一个类地实例也是其所有基类的实例


    }
}
