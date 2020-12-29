import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Test {
    public static void main(String [] args) throws ClassNotFoundException {

        boolean bool = true;
        while(bool) {
            Scanner intput = new Scanner(System.in);

            System.out.println("请输入用户名:");
            String userName = intput.next();
            System.out.println("输入的用户名为：" + userName);


            System.out.println("请输如密码：");
            String passWord = intput.next();
            System.out.println("输入密码为：" + passWord);


            // File file = new File("D:\\Users\\lenovo\\IdeaProjects\\untitled\\src\\users.xlsx");
            InputStream in = Class.forName("Test").getResourceAsStream("/users.xlsx");
            ReadExcel readExcel = new ReadExcel();
            User users[] = readExcel.readExcel(in);

            for (int i = 0; i < users.length; i++) {
                if (userName.equals(users[i].getUserName().trim()) && passWord.equals(users[i].getPassWord().trim())) {
                    System.out.println("登录成功");
                    bool = false;
                } else{
                    System.out.println("登陆失败");
                    bool = true;
                }

            }
        }
    }



}
