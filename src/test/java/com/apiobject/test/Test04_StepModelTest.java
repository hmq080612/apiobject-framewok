package com.apiobject.test;
import com.apiobject.framework.global.ApiLoader;
import com.apiobject.framework.steps.AssertModel;
import com.apiobject.framework.steps.StepModel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * @description: 对ApiAction对象实现的单元测试
 **/
public class Test04_StepModelTest {
    public static final Logger logger = LoggerFactory.getLogger(Test04_StepModelTest.class);
    @BeforeAll
    static void loadTest() throws IOException{
        ApiLoader.load("src/test/resources/api");
        logger.info("debugger!");
    }
    @Test
    void runTest(){
        //实参
        ArrayList<String> actualParameter = new ArrayList<>();
        actualParameter.add("ww9f8ef8c02c9d780a");
        actualParameter.add("HngeWZcbdZYysVowVb0b1Hyt_Hd1oiy5MOKYx-WDr3g");
        //断言
        ArrayList<AssertModel> asserts = new ArrayList<>();
        AssertModel assertModel = new AssertModel();
        assertModel.setActual("errcode");
        assertModel.setExpect("2");
        assertModel.setMatcher("equalTo");
        assertModel.setReason("getToken错误校验01");
        asserts.add(assertModel);
        //save
        HashMap<String,String> save = new HashMap<>();
        save.put("accesstoken","access_token");
        //globalsave
        HashMap<String,String> globalsave = new HashMap<>();
        globalsave.put("accesstoken","access_token");
        StepModel stepModel = new StepModel();
        stepModel.setApi("tokenhelper");
        stepModel.setAction("getToken");
        stepModel.setActualParameter(actualParameter);
        stepModel.setAsserts(asserts);
        stepModel.setSave(save);
        stepModel.setSaveGlobal(globalsave);
        stepModel.run(null);
        logger.info("Debugger!");

    }
}
