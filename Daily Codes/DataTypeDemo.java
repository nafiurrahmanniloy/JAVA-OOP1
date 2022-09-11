public class DataTypeDemo
{
boolean b1;
char c1, c2;
float f1, f2, f3, f4;
double d1, d2, d3, d4;
byte bt1, bt2;
short s1, s2;
int i1, i2;
long l1, l2;
public static void main(String args[ ])
{
DataTypeDemo dtd = new DataTypeDemo( );
System.out.println("Default Value of boolean: "+dtd.b1);
System.out.println("Default Value of char: "+dtd.c1);
dtd.c1 = '\u0000';
System.out.println("Lowest Range of char: "+dtd.c1);
dtd.c2 = '\uFFFF';
System.out.println("Highest Range of char: "+dtd.c2);
System.out.println("Default Value of float: "+dtd.f1);
dtd.f1 = -99999999999999999999999999999999999999.0F*3.40F; 
System.out.println("Lowest Range of Negetive float: "+dtd.f1);
dtd.f2 = -0.000000000000000000000000000000000000000000001F;
System.out.println("Highest Range of Negetive float: "+dtd.f2);
dtd.f3 = 0.000000000000000000000000000000000000000000001F;
System.out.println("Lowest Range of Positive float: "+dtd.f3);
dtd.f4 = 99999999999999999999999999999999999999.0F*3.40F; 
System.out.println("Highest Range of Positive float: "+dtd.f4);
System.out.println("Default Value of byte: "+dtd.bt1);
dtd.bt1 = -128;
System.out.println("Lowest Range of byte: "+dtd.bt1);
dtd.bt2 = 127;
System.out.println("Highest Range of byte: "+dtd.bt2);
//the next two lines will give error
//dtd.bt1= -129;
//dtd.bt2 = 128;
}
}