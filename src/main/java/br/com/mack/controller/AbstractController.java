package br.com.mack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AbstractController implements Controller{
    private String returnPage;
    private HttpServletRequest request;
    private HttpServletResponse response;

    @Override
    public void init(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    @Override
    public String getReturnPage() {
        return this.returnPage;
    }
    
    public void setReturnPage(String returnPage){
        this.returnPage = returnPage;
    }
    
    public HttpServletRequest getRequest(){
        return this.request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }
    
    
    
}