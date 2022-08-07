package com.chainsys.trainticket.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Stations")
public class Station {
	@Id
	@Column(name="station_id")
	private String stationId;
	@Column(name="station_name")
	private String stationName;
	@Column(name="station_address")
	private String stationAddress;
	@OneToMany(mappedBy="station",fetch=FetchType.LAZY)
	private List<TrainDetail> trainDetail;
	
	public List<TrainDetail> getTrainDetail() {
		return trainDetail;
	}
	public void setTrainDetail(List<TrainDetail> trainDetail) {
		this.trainDetail = trainDetail;
	}
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
	
	
	
}
