package com.zhou.javaDesign.briging;

/**
 * Created by zhou on 2017/9/20.
 */

public abstract class  FileFormat {
    protected  SqlBase sql ;
    public void setSql(SqlBase sql){        //设置需要处理的数据库
        this.sql = sql;
    }
    public abstract void processFile();
}
