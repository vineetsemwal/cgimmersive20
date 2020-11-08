package com.cg.apps.testdemo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import java.util.List;

public class ListTest {

    @Test
    public void testDemo_1(){
        List<Integer> list= mock(List.class);
       when(list.get(0)).thenReturn(10);
       when(list.get(1)).thenReturn(20);

       int element1=list.get(0);
       int element2=list.get(1);
       System.out.println("element1="+element1+" element2="+element2);
    }

}
