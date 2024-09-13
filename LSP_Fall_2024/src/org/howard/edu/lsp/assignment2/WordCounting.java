/**
 * Name: Matthew Getachew
 */
package org.howard.edu.lsp.assignment2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounting {
	public static void main(String[] args) {
		
		String filePath = "src/org/howard/edu/lsp/assignment2/words.text";
				
		try {
			
			List<String> lines = Files.readAllLines(Paths.get(filePath));
			
			Map<String, Integer> wordCountMap = new HashMap<>();
			
			for (String line : lines) {
				
				String[] words = line.toLowerCase().split("\\W+");
					
				for (String word : words) {
					
					if (word.length() > 3) {
						
						wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
					}
				}
			}
			
			for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
				System.out.println(entry.getKey() + "\t" + entry.getValue());
			}
			
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}
