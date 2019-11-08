package com.geely.design.pattern.structural.proxy.db;


import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 17:34 2019/11/8
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}
