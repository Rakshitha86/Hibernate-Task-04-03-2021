package com.xworkz.tester;

import com.xworkz.dao.SpeakerDAO;
import com.xworkz.dao.SpeakerDAOImpl;
import com.xworkz.dto.SpeakerDTO;
import com.xworkz.sevices.SpeakerServiceImpl;

public class Tester {
	public static void main(String[] args) {

		SpeakerDAO speakerDAO = new SpeakerDAOImpl();
		SpeakerServiceImpl speakerService = new SpeakerServiceImpl(speakerDAO);
		SpeakerDTO speakerDTO = new SpeakerDTO(04, "Samsung", "black", 4000, "large", true);
//		speakerDAOImpl.saveSpeaker(speakerDTO);
		
		speakerService.validateAndSave(speakerDTO);
		
		
	}
}
