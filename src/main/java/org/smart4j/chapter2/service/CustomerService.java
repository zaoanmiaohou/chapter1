package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.util.PropsUtil;

import java.sql.*;
import java.util.*;

public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
    private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    static {
        Properties conf = PropsUtil.loadProps("config.properties");
        DRIVER = conf.getProperty("jdbc.driver");
        URL = conf.getProperty("jdbc.url");
        USERNAME = conf.getProperty("jdbc.username");
        PASSWORD = conf.getProperty("jdcn.password");

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            LOGGER.error("can not load jdbc driver",e);
        }
    }

    /**
     * 获取用户列表
     */
    public List<Customer> getCustomerList() {

        Connection conn = null;
        try {
            List<Customer> customerList = new ArrayList<Customer>();
            String sql = "SELECT * FROM customer";
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
        } catch (SQLException e) {
            LOGGER.error("execute sql failure",e);
        }

        //TODO
        return null;
    }

    /**
     * 获取客户
    */
    public Customer getCustomer(long id) {
        //TODO
        return null;
    }

    /**
     * 创建客户
     */
    public boolean createCustomer(Map<String,Object> fieldMap){
        //TODO
        return false;
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        //TODO
        return false;
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id){
        //TODO
        return false;
    }

}
