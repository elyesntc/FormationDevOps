<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
    Contenu du cours
</h1>
<%
List result= (List) request.getAttribute("cours");
Iterator it = result.iterator();
//out.println("<br>Contenu <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>
</body>
</html>