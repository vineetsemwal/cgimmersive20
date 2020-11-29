package org.cap.apps.studentbootjparest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JsonTest {
    @Test
    public void testJson() throws Exception{
        Map<Integer,Integer>map=new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        ObjectMapper objectMapper=new ObjectMapper();
        String requestDataJson=objectMapper.writeValueAsString(map);
        System.out.println(requestDataJson);
    }
}
