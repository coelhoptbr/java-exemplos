/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.servrod.threads;

/**
 *
 * @author rodrigo
 */
class ThreadExemploRunnable implements Runnable {
    public char c;
    
    public ThreadExemploRunnable(char c) {
        this.c = c;
    }
    
    @Override
    public void run() {
        System.out.println("Thread executando " + Thread.currentThread().getName());
        for(int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}
