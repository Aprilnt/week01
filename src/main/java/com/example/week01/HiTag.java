package com.example.week01;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class HiTag extends SimpleTagSupport {

	@Override
	public void doTag ( ) throws JspException, IOException {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes ();
		HttpServletResponse response = attributes.getResponse ();
		response.setHeader ( "headers", "hello world" );
		//获取context对象
		JspContext context = getJspContext ();
        //获取out对象
		JspWriter out = getJspContext ().getOut ();
        //获取pageContext对象
		PageContext pageContext = (PageContext) this.getJspContext ();
        //打印Hello World
		out.print ( "Hello World!" );
		System.out.println ( "hello world" );
	}
}