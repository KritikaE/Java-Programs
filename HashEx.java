import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashEx
{
public static void main(String[] args)
{
Hashtable<String, String> map = new Hashtable<>();
String filePath = "contacts.txt";
try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(filePath)))
{
String line;
while ((line = br.readLine()) != null)
{
String[] parts = line.split(",");
if (parts.length == 2)
{
map.put(parts[0].trim(), parts[1].trim());
}
}
br.close();
}
catch (IOException e)
{
e.printStackTrace();
}
Enumeration<String> e1 = map.keys();
while (e1.hasMoreElements())
{
String name = e1.nextElement();
System.out.println("Name: " + name + ", Phone No: " + map.get(name));
}
}
}