package com.lz.mhl.utils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 */
public class Test {
    public static void main(String[] args) throws SQLException {
//        System.out.print("请输入数子");
//        int i = Utility.readInt();
//        System.out.println(i);

        //测试JDBCUtilsByDruid
        Connection connection = JDBCUtilsByDruid.getConnection();
        System.out.println(connection);

    }
}
