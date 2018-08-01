package com.zqz.dao;

import com.zqz.bean.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 96300 on 2018/7/29.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    //通过年龄来查询
    public List<Girl> findByAge(Integer age);


}
