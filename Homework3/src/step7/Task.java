package step7;

import java.util.Arrays;
import java.util.Comparator;

public class Task implements Comparable<Task> {
    private int priorityLevel = 0; // 数值越大优先级越高
    private int cost = 0; // 任务消耗的时间

    public Task(int p, int c) {
        // 待完成
        priorityLevel = p;
        cost = c;
    }

    @Override
    public int compareTo(Task o) {
        return -(priorityLevel - o.priorityLevel);
        // 待完成
    }

    // 根据优先级排序，优先级高则排列在前
    public static void sortByPriority(Task[] tasks) {
        Arrays.sort(tasks);

        // 待完成
    }

    // 根据消耗排序，消耗越低则排列在前
    public static void sortByCost(Task[] tasks) {
        Arrays.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.cost - o2.cost;
            }
        });

        // 待完成
    }

    // 待完成：标准名称胡Getter和Setter方法
    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
