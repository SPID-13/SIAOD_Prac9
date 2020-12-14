package prac9;

import java.util.TreeSet;

class Application implements Comparable<Application>{
    private int priority, number, time;

    public Application(char category, int number, int time) {
        this.number = number;
        this.time = time;
        switch (category){

            case 'M':
                this.priority = 1;
                break;

            case 'K':
                this.priority = 2;
                break;

            case 'P':
                this.priority = 3;
                break;

        }
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }



    @Override
    public int compareTo(Application o) {
        if (priority == o.priority) return 1;
        return priority - o.priority;
    }

    @Override
    public String toString() {
        char category = ' ';
        switch (priority){
            case 1: category = 'M'; break;
            case 2: category = 'K'; break;
            case 3: category = 'P'; break;
        }
        return ("Заявка: категория сотрудника - " + category + "; номер - " + number + "; время выполнения - " + time);
    }

}

public class Employee {

    private TreeSet<Application> list;

    public Employee() {
        list = new TreeSet<>();
    }

    public void insert(Application application){
        list.add(application);
    }

    public void information(){
        for (Application application: list)
            System.out.println(application);
    }

    public void realizationTime(){
        int timeM = 0, timeK = 0, timeP = 0;
        for (Application application: list) {
            if (application.getPriority() == 1)
                timeM += application.getTime();
            else if (application.getPriority() == 2)
                timeK += application.getTime();
            else
                timeP += application.getTime();
        }
        System.out.println("Менеджер (М) = " + timeM + " минут; контролер (K) = " + timeK + " минут; рабочий (Р) = " + timeP + " минут.");
    }

}