package com.baidu.ruleng.service.singleton;

import org.junit.Test;

public class Singleton {
   private Singleton(){
	   System.out.println("Singletom is create!");
   }
   
   private static Singleton instance=new Singleton();
   
   public static Singleton getInstance(){
	   return instance;
   }
   
   @Test
   public void testSingleton(){
	   Singleton.getInstance();
   }
   
}
