package com.mani.StudentMarks.Service;

import com.mani.StudentMarks.Entity.MarksEntity;
import com.mani.StudentMarks.Repository.MarksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksService {

    @Autowired
    MarksRepo repo;

    public void addMarks(MarksEntity me) {
        me.setSem1Total(me.getSem1Theory()+me.getSem1Practicals());
        me.setSem2Total(me.getSem2Theory()+me.getSem2Practicals());
        repo.save(me);
    }

    public void addAllMarks(List<MarksEntity> mar) {
        for (MarksEntity ma:mar){
            ma.setSem1Total(ma.getSem1Theory()+ma.getSem1Practicals());
            ma.setSem2Total((ma.getSem2Theory()+ma.getSem2Practicals()));
            repo.save(ma);
        }
    }

    public MarksEntity getById(int rollNo) {
        return repo.findByRollNo(rollNo);
    }
}
