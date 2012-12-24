package org.gradle.examples.web;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet
{
   public void doGet(HttpServletRequest request,
                     HttpServletResponse response)
      throws IOException
   {
      PrintWriter pw = response.getWriter();
      pw.println("hello, world");
      pw.close();
   }
}