package com.epam.webparsers.controllers;

import com.epam.airline.parsing.ParserFactory;
import com.epam.airline.parsing.PlaneParser;
import com.epam.airline.planes.Plane;
import com.epam.webparsers.commands.Command;
import com.epam.webparsers.commands.CommandFactory;
import com.epam.webparsers.logging.WebLogger;
import org.apache.log4j.Priority;
import org.apache.log4j.PropertyConfigurator;
import org.xml.sax.SAXException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;

/**
 * Created by ivan on 7/14/14.
 */

@WebServlet(
        name = "controller",
        urlPatterns = "/controller")
public class Controller extends HttpServlet {

    @Override
    public void init() throws ServletException {
        String pathToProperties = getServletContext().getRealPath("/resources/log4j.properties");
        PropertyConfigurator.configure(pathToProperties);
        WebLogger.init();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Command command = CommandFactory.defineCommand(request);
        String page = command.execute(request);
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }

}
