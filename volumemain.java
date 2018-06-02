class volume
{
int a,b,c;
void vc(int a)
{
double volume=a*a*a;
System.out.println("volume of the cube"+volume);
}
void vc(int r,int h)
{
double volume=(3.14*r*r*h);
System.out.println("volume of the cylinder"+volume);
}
}
class volumemain
{
public static void main(String args[])
{
volume v1=new volume();
v1.vc(3);
v1.vc(4,5);
}
}