package com.kh;

public class ThreadExample {
  public static void main(String[] args) {


    
    //병렬로 실행할 작업 정의를 run메소드 안에 정의
    Runnable jobA = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 5; i++) {
          System.out.println("jobA = " + i);

          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    };
    //2)스레드객체의 매개값으로 병렬로 실행할 작업을 전달
    Thread threadA = new Thread(jobA);

    //3)병렬작업실행
    threadA.start();

    //병렬로 실행할 작업 정의를 run메소드 안에 정의
    Runnable jobC = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 5; i++) {
          System.out.println("jobC = " + i);
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    };
    //2)스레드객체의 매개값으로 병렬로 실행할 작업을 전달
    Thread threadC = new Thread(jobC);

    //3)병렬작업실행
    threadC.start();

    for (int i = 0; i < 5; i++) {
      System.out.println("jobB = " + i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
