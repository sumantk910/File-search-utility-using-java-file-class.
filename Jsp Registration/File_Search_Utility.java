package File_Class;

import java.io.File;
import java.util.Scanner;
public class File_Search_Utility 
{
static int count; 
static void searchFile(File[] arr, String str)
{
	if(arr==null)
	{
		return;
	}
for (File f : arr)
{
	System.out.println("Searching.......");
if(f.isFile())
{
String s1=f.getName();
if(s1.equals(str))
{
count++;
String S1=f.getParent();
long l=f.length();
System.out.println("Path : "+S1+" \t Size : "+l+" Bytes ");
}
}
else if(f.isDirectory())
{ searchFile(f.listFiles(),str);
}
}
}
public static void main(String[] args)
{
// String[] S1=new String[100];
Scanner sc=new Scanner(System.in);
System.out.print("Enter the path of file : ");
String path = sc.nextLine();
System.out.print("Enter the name of file : ");
String str = sc.nextLine();
File F = new File(path);
if(F.exists() && F.isDirectory())
{
File arr[] = F.listFiles(); searchFile(arr,str);
}
System.out.println("Total no of files are : "+count);
}
}

