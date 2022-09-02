<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title><%= controllerName %>.<%= actionName %></title>
</head>
<body>

<h1><%= controllerName %>.<%= actionName %></h1>
<p>You are: <em><%= username ?: 'N/A' %></em></p>

<p><g:link action="index">Index (permitAll)</g:link></p>
<p><g:link action="user">User (ROLE_USER)</g:link></p>
<p><g:link action="admin">Admin (ROLE_ADMIN)</g:link></p>
<hr/>
<p><g:link url="/logoff">LOGOUT</g:link></p>

</body>
</html>
