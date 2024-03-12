package ua.com.cbs.trelloPractice.oop.infoStudents;

import java.util.ArrayList;

/**
 * Фамилия
 * Группа
 * Физика
 * Информ
 * История
 * <p>
 * Определить средний бал оценок по всем предметам, и вывести сведения о студентах, средний балл которых больше 4.
 */

public class Main {

  public static void main(String[] args) {
    ArrayList<Students> students = new ArrayList<>();
    students.add(new Students("Johnson", "6A", 2, 9, 6));
    students.add(new Students("Biden", "6A", 7, 4, 8));
    students.add(new Students("Macron", "5B", 6, 3, 5));
    students.add(new Students("Sholz", "44", 10, 4, 9));
    students.add(new Students("Braun", "7", 4, 8, 8));

    int acceptableStudent = 0;

    System.out.println("Student with average grade more than 4.0 :");
    for (Students student : students) {
      if (student.getAvrMark() > 4.0) {
        System.out.println(student);
        acceptableStudent++;
      }
    }
    if (acceptableStudent == 0) {
      System.out.println("No one!");
    }
  }
}

