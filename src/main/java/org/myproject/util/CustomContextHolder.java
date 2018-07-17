package org.myproject.util;

/**
 * Created by zhao_xinhu
 * On 2018/6/27
 */
public class CustomContextHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    public static final String DATA_SOURCE_FROM = "dataSource";//对应动态数据源配置中的key
    public static final String DATA_SOURCE_TO = "dataSourceRemote";

    public static void setCustomerType(String customerType) {
        contextHolder.set(customerType);
    }

    public static String getCustomerType() {
        return contextHolder.get();
    }

    public static void clearCustomerType() {
        contextHolder.remove();

    }
}