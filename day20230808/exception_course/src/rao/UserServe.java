package rao;

@SuppressWarnings({"all"})
public class UserServe {
    public void register(String userName, String password) throws IllegalRegException {
        if(null == userName || password.length() < 6 || password.length() > 14) {
            throw new IllegalRegException("用户名不能为空、密码长度必须是【6-14】之间");
        }
        System.out.println("恭喜您注册成功!");
        System.out.println("欢迎进入用户管理系统!");
    }
}
