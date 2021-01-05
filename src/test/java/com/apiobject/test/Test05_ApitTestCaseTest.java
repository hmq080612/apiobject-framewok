package com.apiobject.test;
import  com.apiobject.framework.global.ApiLoader;
import  com.apiobject.framework.testcase.ApiTestCaseModel;
import  org.junit.jupiter.api.BeforeAll;
import  org.junit.jupiter.api.Test;
import  org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description: 对ApiAction对象实现的单元测试
 **/
import java.io.IOException;
public class Test05_ApitTestCaseTest {
    public static final Logger logger = LoggerFactory.getLogger(Test05_ApitTestCaseTest.class);
    @BeforeAll
    static void loadTest() throws IOException{
        ApiLoader.load("src/test/resources/api");
        logger.info("debugger！");
    }
    @Test
    void loadApiTest() throws IOException{
        ApiTestCaseModel apiTestCaseModel = ApiTestCaseModel.load("src/test/resources/testcase/testcase_department.yaml");
        logger.info("debugger!");

    }
    @Test
    void runTest() throws IOException{
        ApiTestCaseModel  apiTestCaseModel =ApiTestCaseModel.load("src/test/resources/testcase/testcase_department.yaml");
        apiTestCaseModel.run();
        logger.info("Debugger!");
    }
}
