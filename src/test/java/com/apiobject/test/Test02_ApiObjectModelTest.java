package com.apiobject.test;

import com.apiobject.framework.api.ApiObjectModel;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @description: 对ApiAction对象实现的单元测试
 **/
public class Test02_ApiObjectModelTest {
    public static final Logger logger = LoggerFactory.getLogger(Test02_ApiObjectModelTest.class);

    @Test
    void loadTest() throws IOException {
        ArrayList<String> actualParameter = new ArrayList<>();
        actualParameter.add("ww9f8ef8c02c9d780a");
        actualParameter.add("HngeWZcbdZYysVowVb0b1Hyt_Hd1oiy5MOKYx-WDr3g");

        ApiObjectModel apiObjectModel= ApiObjectModel.load("src/test/resources/api/tokenhelper.yaml");
        apiObjectModel.getActions().get("getToken").run(actualParameter);
    }

}