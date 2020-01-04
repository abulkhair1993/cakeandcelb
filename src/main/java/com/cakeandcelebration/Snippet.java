package com.cakeandcelebration;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;

import be.quodlibet.boxable.BaseTable;
import be.quodlibet.boxable.Cell;
import be.quodlibet.boxable.Row;

public class Snippet {

	public static void main(String[] args) throws IOException {

		PDPage myPage = new PDPage(PDRectangle.A4);
		PDDocument mainDocument = new PDDocument();

		// Dummy Table
		float margin = 50;
		// starting y position is whole page height subtracted by top and bottom margin
		float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
		// we want table across whole page width (subtracted by left and right margin
		// ofcourse)
		float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);

		boolean drawContent = true;
		float yStart = yStartNewPage;
		float bottomMargin = 70;
		// y position is your coordinate of top left corner of the table
		float yPosition = 550;

		BaseTable table = new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth, margin, mainDocument,
				myPage, true, drawContent);
		String[] str = { "ShopName", "ProductName", "Quantity" };
		String[] val = { "Margapatta", "Chewberry", "3", "Magarpatta", "Cake", "1" };

	
		 Row<PDPage> headerRow = table.createRow(15f);
		    table.addHeaderRow(headerRow);
		    
		for (int i = 0; i < 3; i++) {
			Cell<PDPage> cell = headerRow.createCell(20, str[i]);
		}

		    int count = 0;
		    for (int j = 0; j < 2; j++) {
		    	Row<PDPage> row = table.createRow(12);
		    	for(int k = 0; k<3; k++) {
		    		Cell<PDPage> cell = row.createCell(20, val[count++]);
		    		
		    	}
		    	
		    }
		table.draw();
		mainDocument.addPage(myPage);
		mainDocument.save("C:\\Users\\user\\Desktop\\testfile.pdf");
		mainDocument.close();
	}

	
}
