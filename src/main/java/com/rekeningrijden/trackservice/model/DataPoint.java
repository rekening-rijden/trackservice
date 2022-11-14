package com.rekeningrijden.trackservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "datapoints")
@AllArgsConstructor
@NoArgsConstructor
public class DataPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
//    private String routeId;
    private String roadType;
    private String laneSpeed;
    private int vehicleId;
    private Date timeStamp;
    private double lat;
    private double lng;

}
