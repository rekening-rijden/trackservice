package com.rekeningrijden.trackservice.repository;

import java.util.List;

import com.rekeningrijden.trackservice.model.DataPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataPointRepository extends JpaRepository<DataPoint, Long> {
}
