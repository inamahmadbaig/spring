package com.target_sbean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class MusicBand {
	private String bandName;
	private List<Instrument> instruments;
	@Autowired
	public MusicBand(String bandName, List<Instrument> instruments) {
		super();
		this.bandName = bandName;
		this.instruments = instruments;
	}
	
	public void showBandDetails() {
		System.out.println(" Music Band: "+bandName);
		System.out.println("Instruments Used:");

		for(Instrument inst : instruments) {
			inst.showInstrument();
		}
	}
}
