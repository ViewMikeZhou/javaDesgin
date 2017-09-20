package com.zhou.javaDesign.briging;

/**
 * Created by zhou on 2017/9/20.
 */

public class Mysql implements  SqlBase {
    @Override
    public String getSqlData() {
        return "mysql中的数据";
    }
}
