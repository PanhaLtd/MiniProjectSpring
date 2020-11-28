package com.example.demo;

import com.example.demo.repository.ExRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExImp implements ExService{

    private ExRepostiory exRepostiory;

    @Autowired
    public void setExRepostiory(ExRepostiory exRepostiory) {
        this.exRepostiory = exRepostiory;
    }

    @Override
    public List<ExModel> getAll() {
        return exRepostiory.getAll();
    }
}
