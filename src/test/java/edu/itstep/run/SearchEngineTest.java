package edu.itstep.run;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SearchEngineTest {
 private final int [] array = new int[1_000_000];
 SearchEngine se;
    @BeforeEach
    void setUp() {
      se = new SearchEngine();
//        Random random = new Random();
//        random.setSeed(1L);
//        for(int i = 0; i < array.length; i++){
//          array[i] = random.nextInt();
//          System.out.println(array[i]);
//        }
    }

    @Test
    void linearSearch() {

       assertEquals(0, se.linearSearch(431529176, array));
    }


}