<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: basik
  Date: 08/11/2018
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link rel=“stylesheet” href=“https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css”
          integrity=“sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO” crossorigin=“anonymous”>
    <title>Konwenter jednostek</title>
  </head>
  <body>

  <h1>Przelicznik miar</h1>
  <form action="/calcmeter" method="post" >
    <div class="form-group">
      <input type="String" class="form-control" name="metry" placeholder="metry">
    </div>
    <div class="form-group">
      <input type="String" class="form-control" name="centymetry" placeholder="centymetry">
    </div>
    <div class="form-group">
      <input type="String" class="form-control" name="milimetry" placeholder="milimetry">
    </div>
    <button type="submit" class="btn btn-primary">Przelicz miarę</button>
  </form>



  <h1>Przelicznik wag</h1>
  <form action="/calcmeter" method="post" >
    <div class="form-group">

      <input type="String" class="form-control" name="kilogramy" placeholder="kilogramy">
    </div>
    <div class="form-group">

      <input type="String" class="form-control" name="dekagramy" placeholder="dekagramy">
    </div>
    <div class="form-group">

      <input type="String" class="form-control" name="gramy" placeholder="gramy">
    </div>
    <button type="submit" class="btn btn-primary">Przelicz wagę</button>
  </form>

  </body>
</html>
