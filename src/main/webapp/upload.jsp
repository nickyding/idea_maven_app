<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Upload</title>
</head>
<body>
    <form action="/sp/saveuploads" method="post" enctype="multipart/form-data">
        <input type="file" name="file"/>
        <input type="submit" value="Submit"/>
    </form>
</body>
</html>
