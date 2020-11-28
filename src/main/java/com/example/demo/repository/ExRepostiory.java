package com.example.demo.repository;

import com.example.demo.ExModel;
import com.example.demo.ExProvide;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExRepostiory {

    @SelectProvider(type = ExProvide.class, method = "getAll")
    List<ExModel> getAll();

}
