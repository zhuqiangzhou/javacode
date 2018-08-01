package com.zqz.service;

import com.zqz.bean.Girl;
import com.zqz.dao.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 96300 on 2018/7/29.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("F");
        girlA.setAge(14);
        girlRepository.save(girlA);

        int i = 1/0;

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(16);
        girlRepository.save(girlB);

    }
}
