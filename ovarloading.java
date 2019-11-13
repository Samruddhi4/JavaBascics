package inheritance;

public class ovarloading {
int i= 10, j =20;
char c=30;
public void add(int i)
{
System.out.println("Add() ");	

}
public void add(char c)
{
System.out.println("Add() ");	

}
public void add(int i , int j)
{
System.out.println("Add() ");	

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ovarloading o = new ovarloading();
	
	}

}
