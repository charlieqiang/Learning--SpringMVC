<%--
  Created by IntelliJ IDEA.
  User: Charlie
  Date: 2020/4/13
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>start game</title>

</head>
<body>
    <h1>hello springmvc</h1>
<%--
    <a href="helloworld">world</a>
--%>
    <a href="testRequestMapping">comment</a><br/>
    <a href="param/testServlet">openapi</a><br/>
    <a href="anno/testRequestParam?name=char">RequestParam</a><br/>
    <a href="anno/testPathVariable/10">testPathVariable</a><br/>
    <a href="user/testString">testPathVariable</a><br/>
    <a href="user/testModelAndView">testModelAndView</a><br/>
    <a href="user/testException">testException</a><br/>
    <a href="user/testInterceptor">testInterceptor</a><br/>
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
<%--
    <form action="param/saveUser" method="post">
        name:<input type="text" name="username"/><br/>
        pswd:<input type="password" name="password"/><br/>
        date:<input type="text" name="date"/><br/>


        <input type="submit" value="submit"/>
    </form>
--%>
<%--
    <form action="anno/testRequestBody" method="post">
        name:<input type="text" name="username"/><br/>

        uage:<input type="text" name="age"/><br/>

        <input type="submit" value="submit"/>
    </form>

    <button id="btn">send ajax request</button>
--%>
    <h1>fileupload</h1>
    <form action="user/fileupload" method="post" enctype="multipart/form-data">
        chose:<input type="file" name="upload" /><br/>
        <input type="submit" value="upload">
    </form>
</body>

<script type="text/JavaScript" src="${pageContext.request.contextPath }/js/jquery-3.4.1.js"></script>
<script>
    $(function () {
        $("#btn").click(function () {
            // alert("hello");
            $.ajax({
                url:"user/testAjax",
                contentType:"application/json;charset=UTF-8",
                data:'{"uname":"charlie","age":"21","date":"null"}',
                dataType:"json",
                type:"post",
                success:function (data) {
                    alert(data.date);
                }
            });
        });
    });
</script>
</html>
