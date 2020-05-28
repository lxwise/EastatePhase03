package com.cn.wanxi.servlet;

import com.cn.wanxi.domain.CompanyDto;
import com.cn.wanxi.domain.ImgDto;
import com.cn.wanxi.domain.NavDto;
import com.cn.wanxi.domain.NewsDto;
import com.cn.wanxi.io.CompanyIO;
import com.cn.wanxi.io.ImgIO;
import com.cn.wanxi.io.NavIO;
import com.cn.wanxi.io.NewsIO;
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
 * @create 2020-05-23 21:13
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* //--------------将公司信息存入首页-------------------
        CompanyModel companyModel = new CompanyModel();
        request.setAttribute("companyModel",companyModel);
        //--------------将首页概况公司信息存入首页-------------------
        List<CompanyModel> cpList = companyModel.getCpList();
        request.setAttribute("cpList",cpList);


        //-----------------将导航信息存入首页-----------------------------
        NavModel navModel = new NavModel();
        List<NavModel> navModelList = navModel.getNavModelList();
        request.setAttribute("navModelList",navModelList);
    //-----------------------小案例--------------------
        ImgModel imgModel = new ImgModel();
        List<ImgModel> list = imgModel.getList();
        //-----------------------大案例--------------------
        List<ImgModel> imgList = imgModel.getImgList();
        request.setAttribute("list",list);
        request.setAttribute("imgList",imgList);

//--------------------------新闻---------------------------
        NewsModel newsModel = new NewsModel();
        List<NewsModel> homenewsList = newsModel.getHomeList();
        request.setAttribute("homenewsList",homenewsList);*/
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

        //*************首页公司概述********************
        ImgIO imgIO = new ImgIO();
        List<ImgDto> cpList = imgIO.getCompanyModel();
        request.setAttribute("cpList",cpList);
        //-----------------------小案例--------------------
        List<ImgDto> imgModel = imgIO.getImgModel();
        request.setAttribute("list",imgModel);
        //-----------------------大案例--------------------
        List<ImgDto> caseList = imgIO.getImgModel1();
        request.setAttribute("caseList",caseList);
        //--------------------------新闻---------------------------
        NewsIO newsIO = new NewsIO();
        List<NewsDto> homenewsList = newsIO.getCompanyModel();
        request.setAttribute("homenewsList",homenewsList);

        //请求转发到首页
        request.getRequestDispatcher("/jsp/home.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
