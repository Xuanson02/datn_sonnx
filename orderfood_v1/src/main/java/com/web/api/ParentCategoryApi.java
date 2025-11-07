package com.web.api;

import com.web.entity.InvoiceDetail;
import com.web.entity.ParentCategory;
import com.web.repository.InvoiceDetailRepository;
import com.web.repository.ParentCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parent-category")
@CrossOrigin
public class ParentCategoryApi {

    @Autowired
    private ParentCategoryRepository parentCategoryRepository;

    @GetMapping("/public/all")
    public ResponseEntity<?> findAll(){
        List<ParentCategory> response = parentCategoryRepository.findAll();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
