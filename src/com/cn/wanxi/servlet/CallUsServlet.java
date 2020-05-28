package com.cn.wanxi.servlet;

import com.cn.wanxi.domain.CallUsDto;
import com.cn.wanxi.domain.CompanyDto;
import com.cn.wanxi.domain.CompanyInfoDto;
import com.cn.wanxi.domain.NavDto;
import com.cn.wanxi.io.CallUsIO;
import com.cn.wanxi.io.CompanyIO;
import com.cn.wanxi.io.CompanyInfoIO;
import com.cn.wanxi.io.NavIO;
import com.cn.wanxi.model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-25 9:58
 */
@WebServlet("/callUs")
public class CallUsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //--------------将公司信息存入首页-------------------
//        CompanyModel companyModel = new CompanyModel();
//        request.setAttribute("companyModel",companyModel);
//
//        //-----------------将导航信息存入首页-----------------------------
//        NavModel navModel = new NavModel();
//        List<NavModel> navModelList = navModel.getNavModelList();
//        request.setAttribute("navModelList",navModelList);

        //--------------------公司信息----------------
//        CallUsModel callUsModel = new CallUsModel();
//       // --------------------导航版块------------
//        List<CallUsModel> callUsModelList = callUsModel.getList();
//        request.setAttribute("callUsModelList",callUsModelList);
//        //---------------------图片--------------------
//        List<CallUsModel> callimgList = callUsModel.getimgList();
//        request.setAttribute("callimgList",callimgList);
//
//        request.setAttribute("callUsModel",callUsModel);


        //**************************文本版****************************************
        response.setContentType("text/html;charset=UTF-8");
        CompanyIO companyIO = new CompanyIO();//新建一个IO流对象，
        //通过IO流对象里面的方法得到公司信息CompanyModel
        CompanyDto companyDto = companyIO.getCompanyModel();

        request.setAttribute("companyModel",companyDto);
        //-----------------将导航信息存入首页-----------------------------
        NavIO navIO = new NavIO();
        List<NavDto> navModelList = navIO.getCompanyModel();
        request.setAttribute("navModelList",navModelList);

        //-------------------集团荣誉导航栏-------------------------------
        CompanyInfoIO infoIO = new CompanyInfoIO();
        List<CompanyInfoDto> callUsModelList = infoIO.getCompanyModel1();
        request.setAttribute("callUsModelList",callUsModelList);
        //---------------------图片--------------------
        CallUsIO callUsIO = new CallUsIO();
        List<CallUsDto> callimgList = callUsIO.getCompanyModel();
        request.setAttribute("callimgList",callimgList);
        //--------------------公司信息----------------
        CallUsDto callUsModel = callUsIO.getCompanyModel1();
        request.setAttribute("callUsModel",callUsModel);

        //请求转发到公司地址也
        request.getRequestDispatcher("/jsp/callus.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
