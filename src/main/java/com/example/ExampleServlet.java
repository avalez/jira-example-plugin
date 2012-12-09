package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atlassian.templaterenderer.TemplateRenderer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExampleServlet extends HttpServlet
{
	private static final long serialVersionUID = -1070578716351115012L;
	private static final String TEMPLATE = "templates/example.vm";

	private final TemplateRenderer renderer;

    public ExampleServlet(TemplateRenderer renderer) {
		this.renderer = renderer;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        final Map<String, Object> context = new HashMap<String, Object>();
        res.setContentType("text/html;charset=utf-8");
        renderer.render(TEMPLATE, context, res.getWriter());
    }
}
