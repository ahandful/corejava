package ahandful;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

public class RelativePath {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
//        FileInputStream fin=new FileInputStream("relativePath.txt");
//        byte[] b=new byte[4096];
//        fin.read(b);
//        System.out.println(new String(b));
//        System.out.println(File.separator);
//        System.out.println(Paths.get("relativePath.txt"));
//        writeFile();
//        outPut();
        inputTest();
    }
    public static void inputTest(){
        try (FileInputStream fin = new FileInputStream("xuyu.txt")) {
            int available = fin.available();
            int a=0;
            while(a!=-1){
                a=fin.read();
                System.out.println(a);
                System.out.println((char)a);
            }
            System.out.println(available);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void outPut() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter out=new PrintWriter("xuyu.txt", "UTF-8");
        PrintWriter out2=new PrintWriter(out);
        out2.println("fdfd");
        out2.print("a");
        out2.print("b");
        out.flush();
    }

    public static void writeFile() throws IOException {
        FileOutputStream fin=new FileOutputStream("relativePath.txt",true);
        DataOutputStream out=new DataOutputStream(fin);
        out.writeDouble(100.11);
        System.out.println((char)100);
    }
}
