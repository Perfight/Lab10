import java.util.Scanner;

abstract class human{
    String full_name;
    String data;
    String salary;
    abstract void printName();
    abstract void printData();
    abstract void printSalary();
}

class direct extends human{
    direct(String full_name, String data, String salary){
        this.full_name = full_name;
        this.data = data;
        this.salary = salary;
    }

    @Override
    void printName() {
        System.out.println(full_name);
    }

    @Override
    void printData() {
        System.out.println(data);
    }

    @Override
    void printSalary() {
        System.out.println(salary);
    }
}


class head extends human{
    head(String full_name, String data, String salary){
        this.full_name = full_name;
        this.data = data;
        this.salary = salary;
    }

    @Override
    void printName() {
        System.out.println(full_name);
    }

    @Override
    void printData() {
        System.out.println(data);
    }

    @Override
    void printSalary() {
        System.out.println(salary);
    }
}

class worker extends human {
    worker(String full_name, String data, String salary) {
        this.full_name = full_name;
        this.data = data;
        this.salary = salary;
    }

    @Override
    void printName() {
        System.out.println(full_name);
    }

    @Override
    void printData() {
        System.out.println(data);
    }

    @Override
    void printSalary() {
        System.out.println(salary);
    }
}

public class Main {

    static String[] input(){
        Scanner in = new Scanner(System.in);
        String[] arr = new String[3];
        arr[0] = in.next();
        arr[1] = in.next();
        arr[2] = in.next();
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = input();
        human[] workers = new human[3];
        workers[0] = new direct(arr[0], arr[1], arr[2]);
        arr = input();
        workers[1] = new head(arr[0], arr[1], arr[2]);
        arr = input();
        workers[2] = new worker(arr[0], arr[1], arr[2]);
        for (human worker : workers) {
            worker.printData();
            worker.printName();
            worker.printSalary();
        }

    }
}