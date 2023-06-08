package com.example.springTest.JDBCexampleWithoutSpring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class JDBCwithSpring {
  JdbcTemplate jdbc;
  public String getData(){
    jdbc.execute("insert into user(name,email)values('javatpoint','java@javatpoint.com");
    return"data inserted Successfully";

//    Read below link to read relation data from database using Spring JDBC

//    String selectQuery = "select * from Student";
//    List <Student> students = jdbcTemplateObject.query(selectQuery, new StudentMapper());
//    https://www.tutorialspoint.com/springjdbc/springjdbc_read_query.htm

  }
}
