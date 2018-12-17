package br.com.servrod.threads;


public class ThreadTeste {
    /*
    public static void main(String[] args) {
        // testa a threadexemplo
        System.out.println(Thread.currentThread().getName());
        ThreadExemplo t1 = new ThreadExemplo('A');
        ThreadExemplo t2 = new ThreadExemplo('B');
        ThreadExemplo t3 = new ThreadExemplo('C');
        ThreadExemplo t4 = new ThreadExemplo('D');
        ThreadExemplo t5 = new ThreadExemplo('E');
        ThreadExemplo t6 = new ThreadExemplo('F');
        t1.start(); //ou run - não executa paralelamente
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }*/
    
    public static void main(String[] args) {
        // testa a threadexemplorunnable
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(new ThreadExemploRunnable('A'));
        Thread t2 = new Thread(new ThreadExemploRunnable('B'));
        Thread t3 = new Thread(new ThreadExemploRunnable('C'));
        Thread t4 = new Thread(new ThreadExemploRunnable('D'));
        Thread t5 = new Thread(new ThreadExemploRunnable('E'));
        Thread t6 = new Thread(new ThreadExemploRunnable('F'));
        t1.start(); //ou run - não executa paralelamente
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
    
}