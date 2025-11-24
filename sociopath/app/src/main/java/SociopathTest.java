import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.*;

public class SociopathTest {
    @Test
    void testEveryoneLikesTwo(){
        Sociopath s = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        Assertions.assertEquals(2, s.findTheSociopath(2, likeList));
    }

    @Test
    void testNoOneLikesThree(){
        Sociopath s = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        Assertions.assertEquals(-1, s.findTheSociopath(3, likeList));
    }

    @Test
    void testEveryoneLikesThree(){
        Sociopath s = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        likeList.add(new int[]{1, 3});
        likeList.add(new int[]{2, 3});
        Assertions.assertEquals(3, s.findTheSociopath(3, likeList));
    }

    @Test
    void testEachPersonLikesSomeoneElse(){
        Sociopath s = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 3});
        likeList.add(new int[]{2, 3});
        likeList.add(new int[]{3, 1});
        Assertions.assertEquals(-1, s.findTheSociopath(3, likeList));
    }

    @Test
    void testInvalidGroupSize(){
        Sociopath s = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        Assertions.assertEquals(-1, s.findTheSociopath(0, likeList));
    }

    @Test
    void testIsNotAPerson(){
        Sociopath s = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 0});
        Assertions.assertEquals(-1, s.findTheSociopath(3, likeList));
    }
}
