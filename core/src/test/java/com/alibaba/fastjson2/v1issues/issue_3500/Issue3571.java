package com.alibaba.fastjson2.v1issues.issue_3500;

import com.alibaba.fastjson2.JSON;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Issue3571 {
    @Test
    public void test_for_issue() throws Exception {
        Bean1 bean = new Bean1();
        bean.id1 = 101;
        bean.id2 = 102;
        bean.id3 = 103;

        assertEquals("{\"id1\":101,\"id2\":102,\"id3\":103}", JSON.toJSON(bean).toString());
    }

    @Test
    public void test_for_issue_2() throws Exception {
        Bean2 bean = new Bean2();
        bean.id1 = 101;
        bean.id2 = 102;
        bean.id3 = 103;

        assertEquals("{\"id1\":101,\"id2\":102,\"id3\":103}", JSON.toJSON(bean).toString());
    }

    public static class Bean1 {
        public int id2;
        public int id1;
        public int id3;
    }

    public static class Bean2 {
        public int id2;
        public int id1;
        public int id3;
    }
}
