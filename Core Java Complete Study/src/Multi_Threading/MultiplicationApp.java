package Multi_Threading;

import java.util.Scanner;

class Table {

    private int num;


    public void showTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    public void setTable(int x) {
        this.num = x;
    }
}

class Two extends Thread {
    private Table table;

    public void setTwo(Table tab) {
        this.table = tab;
    }

    public void run() {
        table.showTable();
    }
}

class Three extends Thread {
    private Table table;

    public void setThree(Table tab) {
        this.table = tab;
    }

    public void run() {
        table.showTable();
    }
}

public class MultiplicationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the table you want to print:");
        int num = sc.nextInt(); 
        int num2 = sc.nextInt();
        
        
        Table t = new Table();
        t.setTable(num);
        
        
        
        Two t2 = new Two();
        t2.setTwo(t);
        t2.start();
        
        Table tab= new Table();
        tab.setTable(num2);
        Three t3 = new Three();
        
        t3.setThree(tab);
        t3.start();

        sc.close(); 
    }
}
