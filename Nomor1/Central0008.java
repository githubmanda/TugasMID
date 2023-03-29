/*NAMA                      : Rika Ramanda
  NIM                       : 13020210008*/

interface A {
    public void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0084 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0084 obj = new Central0008();
        obj.aaa();
        System.out.println("main");
    }
}