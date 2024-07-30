package com.mani.StudentMarks.Controller;

import com.mani.StudentMarks.Entity.MarksEntity;
import com.mani.StudentMarks.Service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarksController {
@Autowired
    MarksService serv;
@PostMapping("/addmarks")
    public ResponseEntity<MarksEntity> addMarks(@RequestBody MarksEntity me){
    serv.addMarks(me);
    return ResponseEntity.status(HttpStatus.OK).body(me);
}
    @PostMapping("/addAll")
    public ResponseEntity<List<MarksEntity>> addAll(@RequestBody List<MarksEntity> mar){
        serv.addAllMarks(mar);
        return ResponseEntity.status(HttpStatus.OK).body(mar);
    }
    @GetMapping("/getbyid/{rollNo}")
    public ResponseEntity<MarksEntity> getbyid(@PathVariable int rollNo){
   MarksEntity ms= serv.getById(rollNo);
    return  ResponseEntity.status(HttpStatus.OK).body(ms);
    }



}
