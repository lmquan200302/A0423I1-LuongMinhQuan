<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form method="post" action="display-discount">
    <h1>Product Discount Calculator</h1>
    <div>
        <label>Product Description</label>
        <input type="text" name="Product_Description" placeholder="Mo ta san pham">
    </div>
    <div>
        <label>List Price</label>
        <input type="text" name="List_Price" placeholder="Nhap gia san pham">
    </div>
    <div>
        <labe>Discount Percent</labe>
        <input type="text" name="Discount_Percent" placeholder="Nhap ty le chiet khau">
    </div>
    <button type="submit">Calculate Discount</button>
</form>
</body>
</html>