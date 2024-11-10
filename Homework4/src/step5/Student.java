package step5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Student {
    private String id; // 学号
    private int scoreA; // 成绩A
    private int scoreB; // 成绩B
    private int scoreC; // 成绩C

    public static Student[] readFromFile(String path, int num) {
        Scanner scanner = null;
        try{
           scanner = new Scanner(new File(path));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0; i < num; i++) {
            String line = scanner.nextLine();
            //System.out.println(line);
            String[] fields = line.split(",");
            students.add(new Student(
                    fields[0],
                    Integer.parseInt(fields[1]),
                    Integer.parseInt(fields[2]),
                    Integer.parseInt(fields[3])
            ));
        }
        scanner.close();
        return students.toArray(new Student[0]);
        // 待完成
    }

    public int totalScore() {
        return scoreA + scoreB + scoreC;
        // 待完成
    }

    public static void sortByTotalScore(Student[] s) {
        Comparator<Student> c = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.totalScore() - o2.totalScore();
            }
        };
        Arrays.sort(s, c);
        // 待完成
    }

    public Student(String id, int scoreA, int scoreB, int scoreC) {
        this.id = id;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
        this.scoreC = scoreC;
        // 待完成
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScoreA() {
        return scoreA;
    }

    public void setScoreA(int scoreA) {
        this.scoreA = scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }

    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
    }

    public int getScoreC() {
        return scoreC;
    }

    public void setScoreC(int scoreC) {
        this.scoreC = scoreC;
    }

    public String toString() {
        return id + "," + scoreA + "," + scoreB + "," + scoreC + "," + totalScore();
    }
}
