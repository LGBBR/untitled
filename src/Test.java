import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {

        boolean bool = true;
        while (bool) {
            Scanner intput = new Scanner(System.in);

            System.out.println("请输入用户名:");
            String userName = intput.next();

            System.out.println("请输如密码：");
            String passWord = intput.next();

            // File file = new File("D:\\Users\\lenovo\\IdeaProjects\\untitled\\src\\users.xlsx");
            InputStream in = Class.forName("Test").getResourceAsStream("/users.xlsx");
            InputStream inPro = Class.forName("Test").getResourceAsStream("/products.xlsx");
            ReadExcel readExcel = new ReadExcel();
            User users[] = readExcel.readExcel(in);




            for (int i = 0; i < users.length; i++) {
                if (userName.equals(users[i].getUserName().trim()) && passWord.equals(users[i].getPassWord().trim()))//判断用户和用户名是否相等，trim（）去掉空格
                {
                    /*
                    显示商品信息
                     */
                    bool = false;
                    System.out.println("登录成功");
                    ReadProduct readProduct = new ReadProduct();
                    Product products[] = readProduct.readProduct(inPro);
                    for (Product product:products) {
                        System.out.print(product.getId());
                        System.out.print("\t"+product.getProductName());
                        System.out.print("\t\t"+product.getPrice());
                        System.out.println("\t"+product.getDescription());
                    }


                    break;
                }
                else
                    {
                    System.out.println("登陆失败");
                    bool = true;
                        break;
                }

            }


        }

    }


}
