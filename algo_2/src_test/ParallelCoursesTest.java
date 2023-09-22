import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParallelCoursesTest {
    @Test
    public void test(){
        int n = 3;
        int[][] relation={{1,2}, {2,3}, {3,1}};

        ParallelCourses pc = new ParallelCourses();
        assertEquals(-1, pc.minimumSemesters(n, relation));

        int[][] relation1 = {{1,3}, {2,3}};
        assertEquals(2, pc.minimumSemesters(n, relation1));

        int[][] relation2 = {{1,2}, {2,3}};
        assertEquals(3, pc.minimumSemesters(n, relation2));

    }

}