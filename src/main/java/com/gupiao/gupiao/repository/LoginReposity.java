package com.gupiao.gupiao.repository;
import com.gupiao.gupiao.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LoginReposity extends JpaRepository<Login,Integer> {
    /**
     * 查询方法以get|find|read开头
     * 条件的属性用条件关键字连接，条件属性以首字母大写
     */
    // 根据catName进行查询
    Login findByAccountAndPassword(String Account,String Password);
//    /**
//     * 如何编写JPQL语句
//     * Hibernate == HQL语句
//     * JPQL 语句和HQL语句是类似的
//     */
//    @Query("from Login where ACCOUNT=:Account and PASSWORD=:Password")
//    Login login(@Param("Account") String Account);
}
