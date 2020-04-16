<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
    Cours disponibles
</h1>
<%
List result= (List) request.getAttribute("cours");
Iterator it = result.iterator();
out.println("<br>Contenu <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>
</body>
</html>