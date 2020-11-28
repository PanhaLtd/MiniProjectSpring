package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExService {

    List<ExModel> getAll();

}
