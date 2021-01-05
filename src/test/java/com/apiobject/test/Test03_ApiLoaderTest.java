package com.apiobject.test;

import com.apiobject.framework.global.ApiLoader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @description: 对ApiAction对象实现的单元测试
 **/
public class Test03_ApiLoaderTest {
    public static final Logger logger = LoggerFactory.getLogger(Test03_ApiLoaderTest.class);

    @BeforeAll
    static void loadTest() throws IOException {
        ApiLoader.load("src/test/resources/api");
        logger.info("debugger!");
    }
    @Test
    void getActionTest()  {
        ArrayList<String> actualParameter = new ArrayList<>();
        actualParameter.add("ww9f8ef8c02c9d780a");
        actualParameter.add("HngeWZcbdZYysVowVb0b1Hyt_Hd1oiy5MOKYx-WDr3g");
        ApiLoader.getAction("tokenhelper","getToken").run(actualParameter);
    }
}