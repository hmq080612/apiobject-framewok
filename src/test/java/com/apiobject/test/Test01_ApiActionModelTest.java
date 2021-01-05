package com.apiobject.test;

import com.apiobject.framework.actions.ApiActionModel;
import com.apiobject.framework.global.GlobalVariables;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @description: 对ApiAction对象实现的单元测试
 **/
public class Test01_ApiActionModelTest {
    public static final Logger logger = LoggerFactory.getLogger(Test01_ApiActionModelTest.class);

    @Test
    void runTest(){
        ArrayList<String> actualParameter = new ArrayList<>();
        actualParameter.add("ww9f8ef8c02c9d780a");
        actualParameter.add("HngeWZcbdZYysVowVb0b1Hyt_Hd1oiy5MOKYx-WDr3g");


        ApiActionModel apiActionModel = new ApiActionModel();
        apiActionModel.setUrl("https://qyapi.weixin.qq.com/cgi-bin/${x}");
        HashMap<String ,String> globalVariables = new HashMap<>();

        globalVariables.put("x","gettoken");
        GlobalVariables.setGlobalVariables(globalVariables);

        ArrayList<String> formalParameter = new ArrayList<>();

        formalParameter.add("corpid");
        formalParameter.add("corpsecret");
        apiActionModel.setFormalParam(formalParameter);

        HashMap<String ,String> query = new HashMap<>();
        query.put("corpid","${corpid}");
        query.put("corpsecret","${corpsecret}");

        apiActionModel.setQuery(query);

        Response response = apiActionModel.run(actualParameter);
    }

}