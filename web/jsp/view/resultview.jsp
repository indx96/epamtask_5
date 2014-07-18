<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<table>
    <tr>
        <td>Name</td>
        <td>Length</td>
        <td>Height</td>
        <td>Wingspan</td>
        <td>Fly range</td>
        <td>Tank Size</td>
        <td>Crew Amount</td>
        <td>Passengers Amount</td>
        <td>Weapons On Board</td>
    </tr>
    <c:forEach var="plane" items="${planes}">
        <tr>
            <td>"${plane.name}"</td>
            <td>"${plane.length}"</td>
            <td>"${plane.height}"</td>
            <td>"${plane.wingspan}"</td>
            <td>"${plane.flyRange}"</td>
            <td>"${plane.tankeSize}"</td>
            <td>"${plane.crewAmount}"</td>
            <td>"${plane.passengersAmount}"</td>
            <td>"${plane.weaponsOnBoard}"</td>
        </tr>
    </c:forEach>
</table>
</html>
