package springframework.test.bean;

public class UserService {
    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo(){
        System.out.println("query user info, test" + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}
