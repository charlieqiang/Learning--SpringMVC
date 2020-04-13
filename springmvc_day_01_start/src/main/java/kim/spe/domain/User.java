package kim.spe.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author charlie
 * @date 2020/4/13 - 21:40
 * @description
 */
public class User implements Serializable {

    private String uname;
    private Integer age;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

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

//    @Override
//    public String toString() {
//        return "User{" +
//                "uname='" + uname + '\'' +
//                ", age=" + age +
//                '}';
//    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
