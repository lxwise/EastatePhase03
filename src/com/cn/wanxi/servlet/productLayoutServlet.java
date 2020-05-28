package com.cn.wanxi.servlet;

import com.cn.wanxi.domain.CompanyDto;
import com.cn.wanxi.domain.NavDto;
import com.cn.wanxi.domain.ProductLayoutDto;
import com.cn.wanxi.io.CompanyIO;
import com.cn.wanxi.io.NavIO;
import com.cn.wanxi.io.ProductLayoutIO;
import com.cn.wanxi.model.CompanyInfoModel;
import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.NavModel;
import com.cn.wanxi.model.ProductLayoutModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-24 16:06
 */
@WebServlet("/productLayout")
public class productLayoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//--------------将公司信息存入首页-------------------
      /*  CompanyModel companyModel = new CompanyModel();
        request.setAttribute("companyModel",companyModel);

        //-----------------将导航信息存入首页-----------------------------
        NavModel navModel = new NavModel();
        List<NavModel> navModelList = navModel.getNavModelList();
        request.setAttribute("navModelList",navModelList);*/

        //-------------------公司布局存入-------------------------
//        ProductLayoutModel productLayoutModel = new ProductLayoutModel();
//        /*List<ProductLayoutModel> productLayoutModelList = productLayoutModel.getList();*/
//        request.setAttribute("productLayoutModel",productLayoutModel);

        //**********************文本版***********************************************************************
        response.setContentType("text/html;charset=UTF-8");
        CompanyIO companyIO = new CompanyIO();//新建一个IO流对象，
        //通过IO流对象里面的方法得到公司信息CompanyModel
        CompanyDto companyDto = companyIO.getCompanyModel();
        request.setAttribute("companyModel",companyDto);

        //-----------------将导航信息存入首页-----------------------------
        NavIO navIO = new NavIO();
        List<NavDto> navModelList = navIO.getCompanyModel();
        request.setAttribute("navModelList",navModelList);
        //-------------------公司布局存入-------------------------
        ProductLayoutIO layoutIO = new ProductLayoutIO();
        ProductLayoutDto productLayoutModel = layoutIO.getCompanyModel();
        request.setAttribute("productLayoutModel",productLayoutModel);

        //请求转发到公司信息也
        request.getRequestDispatcher("/jsp/productLayout.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
