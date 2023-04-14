<%--
  Created by IntelliJ IDEA.
  User: hangnt
  Date: 14/03/2023
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div col-8 setoff-3>
        <form action="" method="post">
            <div class="row mt-3">
                <div class="col-7">
                    <label>Mã :</label>
                    <input type="text" name="ma" class="form-control">
                </div>
            </div>

            <div class="row mt-3">
                <div class="col-7">
                    <label>Tên :</label>
                    <input type="text" name="ten" class="form-control">
                </div>
            </div>

            <div class="row mt-3">
                <div class="col-7">
                    <label>Thành phố :</label>
                    <select class="form-select">
                        <option value="Hà nội">Hà nội</option>
                        <option value="Thái Bình">Thái Bình</option>
                        <option value="Nam Định">Nam Định</option>
                    </select>

                </div>
            </div>

            <div class="row mt-3">
                <div class="col-7">
                    <label>Địa chỉ :</label>
                    <input type="text" name="diaChi" class="form-control">
                </div>
            </div>

            <div class="row mt-3">
                <div class="col-6">
                    <a href="/TEMPLATE_FINAL_war_exploded/cua-hang/viewadd" class="btn btn-primary">Add</a>
                </div>
                <div class="col-6">
                    <a href="/TEMPLATE_FINAL_war_exploded/cua-hang/hienthi" class="btn btn-success">Hiển thị</a>
                </div>
            </div>
        </form>

        </div>

    <hr>
        <table class="table mt-3" style="text-align: center">
            <thead class="table-dark">
                <tr>
                    <th>#</th>
                    <th>Ma</th>
                    <th>Tên</th>
                    <th>Địa chỉ</th>
                    <th>Thành phố</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${ListCH}" var="ch" varStatus="i">
                <tr>
                    <td>${i.index}</td>
                    <td>${ch.ma}</td>
                    <td>${ch.ten}</td>
                    <td>${ch.diaChi}</td>
                    <td>${ch.thanhPho}</td>
                    <td>
                        <a href="/TEMPLATE_FINAL_war_exploded/cua-hang/detail?ma=${ch.ma}" class="btn btn-secondary">Detail</a>
                        <a href="" class="btn btn-primary">Update</a>
                        <a href="/TEMPLATE_FINAL_war_exploded/cua-hang/delete?ma=${ch.ma}" class="btn btn-danger">Delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    <hr>

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