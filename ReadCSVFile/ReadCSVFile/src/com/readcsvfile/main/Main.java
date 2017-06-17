package com.readcsvfile.main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.readcsvfile.utils.ReadDataUtils;

public class Main {

	public static void main(String[] args) {
		File document = ReadDataUtils.ReadFile("Select CSV file", null, "Only CSV Files", "csv");
		CSVReader reader = null;
		List<Object[]> data = new ArrayList<>();
		try {
			reader = new CSVReader(new FileReader(document));
			String[] line;
			while ((line = reader.readNext()) != null) {
				/// System.out.println(line[1] + "\t" + line[2]);
				data.add(line);
				if(line[1].equals("QUICK SUB")){
					System.out.println(line[0] + "\t" + line[1] + "\t" + line[2]);
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*System.out.println(data.get(0)[1] + "\t" + data.get(0)[2]);
		System.out.println(data.get(1)[1] + "\t" + data.get(1)[2]);*/
	}

}
