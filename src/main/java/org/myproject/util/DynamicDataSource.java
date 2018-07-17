package org.myproject.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by zhao_xinhu
 * On 2018/6/27
 */
public class DynamicDataSource extends AbstractRoutingDataSource {


//    public void setCustomerType(String customerType){
//        CustomContextHolder.setCustomerType(customerType);
//    }

    @Override
    protected Object determineCurrentLookupKey() {
        String sourceType = CustomContextHolder.getCustomerType();
        return sourceType;
    }
}
