package com.epam.webparsers.commands;

import com.epam.airline.parsing.ParserFactory;
import com.epam.airline.parsing.PlaneParser;
import com.epam.webparsers.logging.WebLogger;
import com.epam.webparsers.logic.PlaneWrapper;
import org.apache.log4j.Priority;
import org.xml.sax.SAXException;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by ivan on 7/16/14.
 */
public class ParsingCommand implements Command {

    @Override
    public String execute(HttpServletRequest request) {
        PlaneParser planeParser = ParserFactory.getParser(ParserFactory.Type.valueOf(request
                .getParameter("parser-type")
                .toUpperCase()));
        try {
            String pathXML = request.getServletContext().getRealPath("/resources/planes.xml");
            WebLogger.log(Priority.DEBUG, pathXML);
            String pathXSD =  request.getServletContext().getRealPath("/resources/planes.xsd");
            WebLogger.log(Priority.DEBUG, pathXSD);

            ArrayList<PlaneWrapper> planeWrappers = new ArrayList<>();
            planeParser.parse(pathXML, pathXSD)
                    .forEach((plane) -> planeWrappers.add(new PlaneWrapper(plane)));
            request.setAttribute("planes", planeWrappers);
            return "/jsp/view/resultview.jsp";
        } catch (SAXException | ParserConfigurationException | XMLStreamException | IOException e) {
            WebLogger.log(Priority.ERROR, e.toString());
            String errorMessage = request.getServletContext().getInitParameter("parsingerrormessage");
            request.setAttribute("errorMessage", errorMessage);
            return "/jsp/authentication/login.jsp";
        }
    }
}
