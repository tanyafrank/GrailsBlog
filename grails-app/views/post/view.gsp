<%--
  Created by IntelliJ IDEA.
  User: tanyafrank29
  Date: 3/6/20
  Time: 8:26 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>${post.title}</title>
</head>
<body>
    <h1>${post.title}</h1>
    <p>${post.teaser}</p>
    <div>${post.content}</div>

<g:form action="submitComment" controller="post" id="commentForm">

    <g:textField name="comment" value="${comment}"/>
    <g:link action="PostComment">
        <input type="button" value="Comment" class="post"/>
    </g:link>
</g:form>


<g:each in="${post.comments}" var="comment">
    <div class="comment">
        <p>${comment.comment}</p>
        <p>Made by: ${comment.who.name} on ${comment.dateCreated}</p>
    </div>
</g:each>
</body>
</html>