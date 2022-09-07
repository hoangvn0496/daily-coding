package com.learning;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


@SpringBootApplication
public class Learning {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Learning.class, args);
//        Pageable pageable = PageRequest.of(2, 10);
//        Page<Account> page = aRe.findAll(pageable);	
        
        Pageable pageable = PageRequest.of(8, 10, Sort.by("updated").descending());
        List<String> username = Arrays.asList("admin", "hoang");
        System.out.println("");
    }

}
