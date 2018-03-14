package other;


class OverloadingAmbiguity
{
 public void m1 (int i,float f)
 {
  System.out.println(" int float method");
 }
 
 public void m1(float f,int i)
  {
  System.out.println("float int method");
  }
 
  public static void main(String[]args)
  {
	  OverloadingAmbiguity overloadingAmbiguity=new OverloadingAmbiguity();
	  //overloadingAmbiguity.m1(20,20);//compiler error: The method m1(int, float) is ambiguous for the type OverloadingAmbiguity
  }
}