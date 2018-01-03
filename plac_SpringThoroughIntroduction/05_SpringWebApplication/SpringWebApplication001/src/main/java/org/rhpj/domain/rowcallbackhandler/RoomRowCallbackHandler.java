package org.rhpj.domain.rowcallbackhandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.util.StringUtils;

public class RoomRowCallbackHandler  implements RowCallbackHandler {
	@Override
	public void processRow(ResultSet rs) throws SQLException {
		System.out.println("一時ファイルパス： " + System.getProperty("java.io.tmpdir"));
		 try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				 new FileOutputStream(File.createTempFile("room_", ".csv")), "UTF-8"))) { 
			 while(rs.next()) {
				 Object[] array = new Object[] {
						 rs.getString("room_id"),
						 rs.getString("room_name"),
						 rs.getInt("capacity")};
				 String reportRow = StringUtils.arrayToCommaDelimitedString(array);
				 writer.write(reportRow);
				 writer.newLine();
			 }
		 }catch(IOException e) {
			 throw new SQLException(e); 
		 }
	 }
}
