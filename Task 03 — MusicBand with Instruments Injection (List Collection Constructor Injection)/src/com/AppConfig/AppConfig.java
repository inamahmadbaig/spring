package com.AppConfig;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.target_sbean.Instrument;
import com.target_sbean.MusicBand;

@Configuration
public class AppConfig {
	@Bean
	public Instrument guitar() {
		return new Instrument("Guitar", "String");
	}
	@Bean
	public Instrument drums() {
		return new Instrument("drums", "Percussion");
	}
	@Bean
	public Instrument keyboard() {
		return new Instrument("keyboard", "Electronic");
	}
	
	@Bean
    public MusicBand musicBand() {
        List<Instrument> instruments = Arrays.asList(
                guitar(),
                drums(),
                keyboard()
        );
        return new MusicBand("RockNation", instruments);
    }
}
