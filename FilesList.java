/* A Java program to list all the files in a directory including the files present in all its
subdirectories. */
import java.io.*;

public class FilesList{

public static void main(String args[])
{
File ff = new File("path-to-directory");

if(ff.isDirectory()==false){
System.out.println("Not a directory");
return;
 }
else{
ListOfFiles(ff);
}
}

public static void ListOfFiles(File ff){
String[] fileList = ff.list();

for(String Name : fileList)
{
File f1 = new File(Name);

if(f1.isDirectory()){
System.out.println("<DIR>"+Name);
ListOfFiles(f1);
}
else
System.out.println(Name);
}
}
}