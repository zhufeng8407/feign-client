package org.crazyit.cloud;

import java.beans.XMLEncoder;

import org.crazyit.cloud.entity.Police;

import feign.Feign;
import feign.gson.GsonEncoder;

public class PoliceMain {

	public static void main(String[] args) {
		testCreatePolice();
	}
	
	private static void testCreatePolice() {
		PoliceClient policeClient = Feign.builder()
				.encoder(new GsonEncoder())
                .target(PoliceClient.class, "http://localhost:9001");
		Police police = new Police();
		police.setId("2001");
		police.setName("zhangsan");
		police.setMessage("show me the meaning");
		System.out.println(policeClient.createPolice(police));
	}
	
	private static void testCreateXML() {
		PoliceClient policeClient = Feign.builder()
//				.encoder(new XMLEncoder())
                .target(PoliceClient.class, "http://localhost:9001");
	}

}
