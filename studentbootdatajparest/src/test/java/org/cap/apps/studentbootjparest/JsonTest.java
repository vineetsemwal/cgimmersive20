package org.cap.apps.studentbootjparest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class JsonTest {
    @Test
    public void testJson() throws Exception{
        Set<String> roles=new HashSet<>();
        roles.add("manager");
        roles.add("admin");
        ObjectMapper objectMapper=new ObjectMapper();
        String requestDataJson=objectMapper.writeValueAsString(roles);
        System.out.println(requestDataJson);
    }
}
