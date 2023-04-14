<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/4/2023
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View update</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div class="col-7 offset-4">
        <h1>Quản Lý Của Hàng</h1>
        <form action="/TEMPLATE_FINAL_war_exploded/cua-hang/update" method="post">
            <div class="row mt-3">
                <div class="col-7">
                    <label>Mã :</label>
                    <input type="text" name="ma" value="${ch.ma}" class="form-control">
                </div>
            </div>

            <div class="row mt-3">
                <div class="col-7">
                    <label>Tên :</label>
                    <input type="text" name="ten" value="${ch.ten}" class="form-control">
                </div>
            </div>

            <div class="row mt-3">
                <div class="col-7">
                    <label>Thành phố :</label>
                    <select class="form-select" name="thanhPho">
                        <option value="Hà nội" ${ch.thanhPho == "Hà nội"? "selected" : ""}>Hà nội</option>
                        <option value="Thái Bình" ${ch.thanhPho == "Thái Bình"? "selected" : ""}>Thái Bình</option>
                        <option value="Nam Định" ${ch.thanhPho == "Nam Định"? "selected" : ""}>Nam Định</option>
                    </select>

                </div>
            </div>

            <div class="row mt-3">
                <div class="col-7">
                    <label>Địa chỉ :</label>
                    <input type="text" name="diaChi" value="${ch.diaChi}" class="form-control">
                </div>
            </div>

            <div class="row mt-3">
                <div class="col-7">
                    <button type="submit" class="btn btn-success">update</button>
                </div>
            </div>


        </form>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
        integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"
        integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD"
        crossorigin="anonymous"></script>
</body>
</html>
