package kim.spe.domain;

import java.io.Serializable;

/**
 * @author charlie
 * @date 2020/4/13 - 21:40
 * @description
 */
public class User implements Serializable {

    private String uname;
    private Integer age;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }
}
