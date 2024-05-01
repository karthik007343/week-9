import java.io.*;
import java.util.*;
class FileIPOPStreamJava{
	public static void copyFile(File f1,File f2) throws Exception {
            FileInputStream ip=new FileInputStream(f1);
            FileOutputStream op=new FileOutputStream(f2);
        try{
            int ch=ip.read();
            while(ch!=-1){
                op.write(ch);
                ch=ip.read();
             }
        }
        finally{
            if(ip!=null){
                ip.close();
            }
            if(op!=null){
                op.close();
            }
            System.out.println("File copied successfully");
        }
    }
    public static void main(String[] args) throws Exception{
        try{
            Scanner s =new Scanner(System.in);
            System.out.println("Enter source filePath : ");
            String source=s.nextLine();
            System.out.println("Enter destination filePath : ");
            String dest=s.nextLine();
            File f1=new File(source);
            File f2=new File(dest);
            copyFile(f1,f2);
        }catch(FileNotFoundException e){
            System.out.println("File not found ...... ");
			e.getStackTrace();

        }
    }
}



