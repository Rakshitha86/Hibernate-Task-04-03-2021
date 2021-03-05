package com.xworkz.sevices;

import com.xworkz.dao.SpeakerDAO;
import com.xworkz.dto.SpeakerDTO;

public class SpeakerServiceImpl implements SpeakerServices {
	private SpeakerDAO dao;

	public SpeakerServiceImpl(SpeakerDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(SpeakerDTO speakerDTO) {
		boolean validData = false;
		if (speakerDTO != null) {
			System.out.println("dto is not null, can validate");
			int id = speakerDTO.getId();
			if (id > 0) {
				System.out.println("id is valid");
				validData = true;
			} else {
				System.out.println("id is not valid");
				validData = false;
			}
			if (validData) {
				String brand = speakerDTO.getBrand();
				if (brand != null && !brand.isEmpty() && !brand.contentEquals(" ")) {
					System.out.println("brand is valid");
					validData = true;
				} else {
					System.out.println("brand is not valid");
					validData = false;
				}
			}
			if (validData) {
				String color = speakerDTO.getColor();
				if (color != null && !color.isEmpty() && !color.contentEquals(" ")) {
					System.out.println("color is valid");
					validData = true;
				} else {
					System.out.println("color is not valid");
					validData = false;
				}
			}
			if (validData) {
				double cost = speakerDTO.getCost();
				if (cost != 0 && cost > 100) {
					System.out.println("cost is valid");
					validData = true;
				} else {
					System.out.println("cost is not valid");
					validData = false;
				}
			}
			if (validData) {
				String size = speakerDTO.getSize();
				if (size != null && !size.isEmpty() && !size.contentEquals(" ")) {
					System.out.println("size is valid");
					validData = true;
				} else {
					System.out.println("size is not valid");
					validData = false;
				}
			}
			if(validData) {
				System.out.println("Invoke save method, data is valid");
				dao.saveSpeaker(speakerDTO);
			}

		}else {
			System.out.println("dto is null, invalid data");
		}
		return false;
	}

}
