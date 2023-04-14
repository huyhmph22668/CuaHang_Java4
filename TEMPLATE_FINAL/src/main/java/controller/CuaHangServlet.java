package controller;

import entity.CuaHang;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import services.impl.CuaHangServicesImpl;

import java.io.IOException;

@WebServlet({
        "/cua-hang/show",
        "/cua-hang/hienthi",
        "/cua-hang/viewadd",
        "/cua-hang/add",
        "/cua-hang/detail",
        "/cua-hang/delete",
        "/cua-hang/viewupdate",
        "/cua-hang/update",
})
public class CuaHangServlet extends HttpServlet {
    private CuaHangServicesImpl impl = new CuaHangServicesImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if(uri.contains("hienthi")){
            this.hienthi(request,response);
        }   else if(uri.contains("show")){
            this.show(request,response);
        }else if(uri.contains("viewadd")){
            this.viewadd(request,response);
        }else if(uri.contains("detail")){
            this.detail(request,response);
        }else if(uri.contains("viewupdate")){
            this.viewupdate(request,response);
        }else{
            this.delete(request,response);
        }
    }

    private void show(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/fe/view/trang-chu.jsp").forward(request,response);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String ma = request.getParameter("ma");
        impl.delete(this.impl.finByMa(ma));
        request.getRequestDispatcher("/cua-hang/hienthi").forward(request,response);
    }

    private void viewupdate(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewadd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/fe/view/view-add.jsp").forward(request,response);
    }

    private void hienthi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("ListCH",this.impl.finByAllCuaHang());
        request.getRequestDispatcher("/fe/view/trang-chu.jsp").forward(request,response);
    }

    private void detail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        request.setAttribute("ch",this.impl.finByMa(ma));
        request.getRequestDispatcher("/fe/view/view-update.jsp").forward(request,response);
    }
   

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if(uri.contains("add")){
            this.add(request,response);
        }else if(uri.contains("update")){
            this.update(request,response);
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");
        String diaChi= request.getParameter("diaChi");
        String thanhPho = request.getParameter("thanhPho");

        CuaHang ch = impl.finByMa(ma);
        ch.setTen(ten);
        ch.setDiaChi(diaChi);
        ch.setThanhPho(thanhPho);
        this.impl.update(ch);
        response.sendRedirect("/TEMPLATE_FINAL_war_exploded/cua-hang/hienthi");

    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");
        String diaChi= request.getParameter("diaChi");
        String thanhPho = request.getParameter("thanhPho");


        System.out.println(ma);
        System.out.println(ten);
        System.out.println(thanhPho);
        System.out.println(diaChi);

        CuaHang ch = new CuaHang(ma,ten,diaChi,thanhPho);
        impl.insert(ch);
        response.sendRedirect("/TEMPLATE_FINAL_war_exploded/cua-hang/hienthi");


    }
}
