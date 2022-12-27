package com.driver;

  class A {

 public String meth() {
  return "Invoking method from class A";
 }
}
  class B extends A {


@Override
  public String meth()
  {
      super.meth();
   return "Method is overridden in Extendend class B";
  }

 }

 public class Main
 {
  public static void main(String[] args) {


    B c=new B();
    c.meth();

  }


}