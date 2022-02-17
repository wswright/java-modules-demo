package com.example.modules;
import com.example.lib.ExampleClass;
import com.example.lib.NameProvider;

import java.util.ServiceLoader;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    ExampleClass exampleClass = new ExampleClass(42, "Scott", true);
    exampleClass.doAThing();

    //Load the NameProvider service
    Iterable<NameProvider> services = ServiceLoader.load(NameProvider.class);
    NameProvider service = services.iterator().next();
    String clownName = service.getName();
    System.out.printf("My clown name is %s.%n", clownName);
  }
}