package exception;

import java.io.FileOutputStream;

public class exception1 {
    void get1()
        {

            try(FileOutputStream fos=new FileOutputStream("D:\\f1.txt"))
            {
                String name="azar";
                byte s[]=name.getBytes();
                fos.write(s);
                System.out.println("FileInserted!!!");
            }
            catch(Exception t)
            {
                System.out.println(t);
            }
// finally
// {
//	 fos.close();
// }

        }
        public static void main(String[] args)
        {
            exception1 h=new exception1();
            h.get1();

        }

    }


