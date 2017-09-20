package com.zhou.javaDesign.briging;

/**
 * Created by zhou on 2017/9/20.
 */

public class XmlFile extends FileFormat {
    @Override
    public void processFile() {
        String sqlData = sql.getSqlData();
        System.out.println("将数据"+sqlData+"转换为XMLFile");
    }
}
