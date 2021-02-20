package domain;

/**
 * @author promise
 * @date 2020/4/22 - 11:16
 * 用户实体类
 */
public class User {
    private String username;
    private String password;
    private String checkCode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", checkCode='" + checkCode + '\'' +
                '}';
    }
}
