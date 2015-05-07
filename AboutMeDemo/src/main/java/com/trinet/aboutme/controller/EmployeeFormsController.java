package com.trinet.aboutme.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This class provides utility for downloading different forms
 *
 * @author Swapna Ayyalaraju
 * @version 1.0
 */
@Controller
@RequestMapping("/employeeformsapi")
public class EmployeeFormsController {

	static final Logger logger = Logger.getLogger(EmployeeFormsController.class);
	/**
	   * this method finds the PDF from realpath and returns the byte code.
	   * @param  module_name String
	   * @param emp_no String
	   * @param file_name String
	   * @return  void 
	   */
	@RequestMapping(value = "/{file_name}/{emp_no}",produces="application/pdf")
	public void getFile(
		    @PathVariable("file_name") String fileName,
		    HttpServletResponse response,HttpServletRequest request,@PathVariable("emp_no") String employeeNo) {
		    String filePath =  "/reports/"+fileName+".pdf";
		    ServletContext context = request.getServletContext();
	        String appPath = context.getRealPath("");
	        System.out.println("appPath =====>" + appPath);
	        // construct the complete absolute path of the file
	        String fullPath = appPath + filePath; 
	        File downloadFile = new File(fullPath);
	        try {
	        FileInputStream inputStream = new FileInputStream(downloadFile);
	        // get MIME type of the file
	        String mimeType = context.getMimeType(fullPath);
	        if (mimeType == null) {
	            // set to binary type if MIME mapping not found
	            mimeType = "application/octet-stream";
	        }
	        System.out.println("MIME type: " + mimeType);
	 
	        // set content attributes for the response
	        response.setContentType(mimeType);
	        response.setContentLength((int) downloadFile.length());
	 
	        // set headers for the response
	        String headerKey = "Content-Disposition";
	        String headerValue = String.format("attachment; filename=\"%s\"",
	                fileName+".pdf");
	        response.setHeader(headerKey, headerValue);
	       
	        // get output stream of the response
	        OutputStream outStream = response.getOutputStream();
	        byte[] buffer = new byte[4096];
	        int bytesRead = -1;
	        // write bytes read from the input stream into the output stream
	        while ((bytesRead = inputStream.read(buffer)) != -1) {
					outStream.write(buffer, 0, bytesRead);
				} 
	        inputStream.close();
	        outStream.close();
	        }
	        catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
