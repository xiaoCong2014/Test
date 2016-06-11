package mvvm;

/**
 * Created by Administrator on 2016/6/7.
 */
public class Bean {
    public String name;
    public String age;
    public Boolean isFriend;
    public Boolean isVisible;

    public Bean(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Bean(String name, String age, Boolean isFriend) {
        this.name = name;
        this.age = age;
        this.isFriend = isFriend;
    }
}
