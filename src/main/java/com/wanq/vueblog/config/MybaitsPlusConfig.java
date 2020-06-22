package com.wanq.vueblog.config;


import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
//开启扫描端口
@MapperScan("com.wanq.vueblog.dao.mapper")
public class MybaitsPlusConfig {

    //添加分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor1=new PaginationInterceptor();
                return paginationInterceptor1;
    }
}
