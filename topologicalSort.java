import java.io.*;
import java.util.*;

public class topologicalSort {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int[] indegree = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < prerequisites.length; i++) {
            indegree[prerequisites[i][0]]++;
        }

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.add(i);
        }

        int count = 0;
        while (!q.isEmpty()) {

            int current = q.poll();

            for (int i = 0; i < prerequisites.length; i++) {

                if (prerequisites[i][1] == current) {
                    indegree[prerequisites[i][0]]--;
                    if (indegree[prerequisites[i][0]] == 0) {
                        q.add(prerequisites[i][0]);
                    }

                }
            }
            count++;
        }
        return count == numCourses;
    }
}
