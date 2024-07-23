package com.codingvishalrai.springBoot.Configruations;

import com.codingvishalrai.springBoot.DB;
import com.codingvishalrai.springBoot.prodDB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCoding {
@Bean
    public DB getBean(){
    return (DB) new prodDB();
}



}
