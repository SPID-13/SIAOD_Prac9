package prac9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue<Element> queue = new LinkedList<>();
        Scanner sc = new Scanner (System.in);
        int number;
        int kol = 0;

        System.out.print("Практическая работа №9.\n\n");

        do {
            System.out.print("< 1 > Добавить элемент в очередь\n< 2 > Удалить элемент\n< 3 > Пуста ли очередь\n< 4 > Полна ли очередь\n< 5 > Задание из варианта 25" +
                    "\n< 0 > Выйти\n\n");
            number = sc.nextInt();
            switch (number) {

                case 1: {
                    if (kol < 5) {
                        System.out.print("Введите элемент: \n");
                        queue.offer(new Element(sc.nextInt()));
                        kol++;
                        System.out.print("Элемент добавлен в очередь\n\n");
                    } else
                        System.out.print("Очередь переполнена\n\n");
                } break;

                case 2: {
                    if (queue.peek() != null) {
                        queue.poll();
                        kol--;
                        System.out.print("Элемент удален из очереди\n\n");
                    } else
                        System.out.print("Очередь пустая\n\n");
                } break;

                case 3: {
                    if (queue.peek() == null)
                        System.out.print("Очередь пустая\n\n");
                    else
                        System.out.print("Очередь непустая\n\n");
                } break;

                case 4: {
                    if (kol == 5)
                        System.out.print("Очередь полна\n\n");
                    else
                        System.out.print("Очередь неполная\n\n");
                } break;

                case 5: {

                    System.out.println();
                    Employee queue_ex = new Employee();
                    Application application1 = new Application('P', 1, 30);
                    Application application2 = new Application('M', 2, 15);
                    Application application3 = new Application('K', 3, 25);
                    Application application4 = new Application('M', 4, 5);
                    queue_ex.insert(application1);
                    queue_ex.insert(application2);
                    queue_ex.insert(application3);
                    queue_ex.insert(application4);
                    queue_ex.information();
                    queue_ex.realizationTime();
                    System.out.println();

                } break;

                case 0: break;

                default:
                    System.out.print("Неверный ввод\n\n");
                    break;

            }

        } while (number != 0);

    }

}
