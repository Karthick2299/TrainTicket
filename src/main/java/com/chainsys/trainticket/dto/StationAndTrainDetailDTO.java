package com.chainsys.trainticket.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.chainsys.trainticket.model.Station;
import com.chainsys.trainticket.model.TrainDetail;

public class StationAndTrainDetailDTO {
	private Optional<Station> station;
	private List<TrainDetail> traindetail = new ArrayList<TrainDetail>();
	public Optional<Station> getStation() {
		return station;
	}
	public void setStation(Optional<Station> station2) {
		this.station = station2;
	}
	public List<TrainDetail> getTraindetail() {
		return traindetail;
	}
	public void addTrainDetail(TrainDetail trainDetail) {
		traindetail.add(trainDetail);
	}
	

}
