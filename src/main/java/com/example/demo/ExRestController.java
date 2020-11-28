package com.example.demo;

import com.example.demo.repository.ExRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExRestController {

    private ExImp exImp;
    private ExRepostiory exRepostiory;
    private ExService exService;

    @Autowired
    public void setExService(ExService exService) {
        this.exService = exService;
    }

    @Autowired
    public void setExRepostiory(ExRepostiory exRepostiory) {
        this.exRepostiory = exRepostiory;
    }

    @Autowired
    public void setExImp(ExImp exImp) {
        this.exImp = exImp;
    }

    @GetMapping("/")
    public ResponseEntity getAll(){
        return ResponseEntity.ok(exImp.getAll());
    }
}
