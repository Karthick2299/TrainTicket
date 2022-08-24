package com.chainsys.trainticket.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="Stations")
public class Station {
	@Id
	@Column(name="station_id")
	@Size(max = 10, min = 1, message = "*Id length should be 1 to 10")
	private String stationId;
	
	@Column(name="station_name")
	@Size(max = 50, min = 3, message = "*Name length should be 3 to 50")
	@NotBlank(message = "*Name can't be Empty")
	private String stationName;
	
	@Column(name="station_address")
	@Size(max = 20, min = 3, message = "*Address length should be 3 to 20")
	@NotBlank(message = "*Address can't be Empty")
	private String stationAddress;
	
	@OneToMany(mappedBy="station",fetch=FetchType.LAZY)
	private List<TrainDetail> trainDetail;
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getStationAddress() {
		return stationAddress;
	}
	public void setStationAddress(String stationAddress) {
		this.stationAddress = stationAddress;
	}
	public List<TrainDetail> getTrainDetail() {
		return trainDetail;
	}
	public void setTrainDetail(List<TrainDetail> trainDetail) {
		this.trainDetail = trainDetail;
	}
	
	
	
	
	
}
