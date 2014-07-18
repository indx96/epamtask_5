<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<form action="controller" method="post">
    <input type="hidden" name="command" value="parsing">
    <jsp:text>Choose parser, ${username}</jsp:text>
    <br/>
    <select name="parser-type">
        <option value="stax">STaX</option>
        <option value="sax">SAX</option>
        <option value="dom" selected>DOM</option>
    </select>
    <input type="submit" value="parse">
</form>

</html>
