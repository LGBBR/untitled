import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String [] args){


        Scanner intput = new Scanner(System.in);

        System.out.println("请输入用户名:");
        String userName = intput.next();
        System.out.println("输入的用户名为："+userName);


        System.out.println("请输如密码：");
        String passWord = intput.next();
        System.out.println("输入密码为："+passWord);
    }
    File file = new File("D:\\lanqiao\\untitled\\src\\users.xlsx");
    ReadExcel readExcel= new ReadExcel();
    User users[] = readExcel.readExcel(file);

    for(int i=0;i<users.length;i++){
        if()
    }

    }

}
