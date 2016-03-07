package com.gus;

import com.gus.conf.RootConfig;
import com.gus.dao.impl.MatchEntityDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;


public class EntryPoint {
    public static void main(String[] args) throws Exception{
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
        DataSource source = context.getBean(DataSource.class);
        MatchEntityDaoImpl matchEntity = context.getBean(MatchEntityDaoImpl.class);
        context.close();
    }
}
