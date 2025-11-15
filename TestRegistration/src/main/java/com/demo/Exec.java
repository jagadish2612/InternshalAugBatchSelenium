package com.demo;

public class Exec {

    public static void main(String[] args) {


        A a = new A()
        {
          public void add()
          {
              System.out.println("add");
          }
        };

        a.add();

    }
}

interface A
{
    public void add();

}

class B implements A
{
    public void add() {
        System.out.println("add");
    }
}
