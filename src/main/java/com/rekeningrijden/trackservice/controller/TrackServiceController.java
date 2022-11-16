package com.rekeningrijden.trackservice.controller;
import com.rekeningrijden.trackservice.model.DataPoint;
import com.rekeningrijden.trackservice.repository.DataPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TrackServiceController {

    @Autowired
    DataPointRepository dataPointRepository;

    @PostMapping("post")
    public ResponseEntity<DataPoint> StoreDataPoint(@RequestBody DataPoint dataPoint) {
        try{
            DataPoint _dataPoint = dataPointRepository.save(dataPoint);
            return new ResponseEntity<>(_dataPoint, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping()
    public ResponseEntity<String> StoreDataPoint() {
        return new ResponseEntity<>("kank", HttpStatus.FOUND);
    }
}
