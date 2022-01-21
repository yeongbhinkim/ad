package com.kh;

public class ThreadExample2 {
  public static void main(String[] args) {

    new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("jobA = " + i);
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();

    new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("jobB = " + i);
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();

    new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("jobC = " + i);
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();

  }
}
