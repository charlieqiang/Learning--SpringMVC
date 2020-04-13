<%--
  Created by IntelliJ IDEA.
  User: Charlie
  Date: 2020/4/13
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>start game</title>
</head>
<body>
    <h1>hello springmvc</h1>
<%--
    <a href="helloworld">world</a>
--%>
    <a href="testRequestMapping">comment</a>
    <a href="param/testServlet">openapi</a>
<%--
    request for params

    <a href="param/testParam?username=charlie">request for params</a>

--%>

<%--

    <form action="param/saveAccount" method="post">
        name:<input type="text" name="username"/><br/>
        pswd:<input type="password" name="password"/><br/>
        mony:<input type="text" name="money"/><br/>
        unam:<input type="text" name="user.uname"/><br/>
        uage:<input type="text" name="user.age"/><br/>
        <input type="submit" value="submit"/>
    </form>

--%>
<%--
    <form action="param/saveAccount" method="post">
        name:<input type="text" name="username"/><br/>
        pswd:<input type="password" name="password"/><br/>
        mony:<input type="text" name="money"/><br/>

        unam:<input type="text" name="list[0].uname"/><br/>
        uage:<input type="text" name="list[0].age"/><br/>

        unam:<input type="text" name="map['one'].uname"/><br/>
        uage:<input type="text" name="map['one'].age"/><br/>

        <input type="submit" value="submit"/>
    </form>
--%>
    <form action="param/saveUser" method="post">
        name:<input type="text" name="username"/><br/>
        pswd:<input type="password" name="password"/><br/>
        date:<input type="text" name="date"/><br/>


        <input type="submit" value="submit"/>
    </form>


</body>
</html>
