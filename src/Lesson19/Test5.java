package Lesson19;

public class Test5 {
    public static void main(String[] args) {
        String [] students = {"Иванов", "Петров", "Сидоров"};
        String [] exams = {"Мат. Анализ", "Философия"};

        for (String s : students){
            for (String ex : exams){
                System.out.println("Студенты: " + s + " Экзамены: " + ex);
            }

        }
    }
}
