/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-17 08:24:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("  <title>KIT ADMIN</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/layui/css/layui.css\" media=\"all\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/font-awesome/css/font-awesome.min.css\" media=\"all\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/build/css/app.css\" media=\"all\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"layui-layout layui-layout-admin kit-layout-admin\">\r\n");
      out.write("  <div class=\"layui-header\">\r\n");
      out.write("    <div class=\"layui-logo\">KIT ADMIN</div>\r\n");
      out.write("    <div class=\"layui-logo kit-logo-mobile\">K</div>\r\n");
      out.write("    <ul class=\"layui-nav layui-layout-left kit-nav\" kit-one-level>\r\n");
      out.write("      <li class=\"layui-nav-item\"><a href=\"javascript:;\">控制台</a></li>\r\n");
      out.write("      <li class=\"layui-nav-item\"><a href=\"javascript:;\">商品管理</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"layui-nav layui-layout-right kit-nav\">\r\n");
      out.write("      <li class=\"layui-nav-item\"><a href=\"javascript:;\" id=\"pay\"><i class=\"fa fa-gratipay\" aria-hidden=\"true\"></i> 捐赠我</a></li>\r\n");
      out.write("      <li class=\"layui-nav-item\">\r\n");
      out.write("        <a href=\"javascript:;\">\r\n");
      out.write("          <img src=\"http://m.zhengjinfan.cn/images/0.jpg\" class=\"layui-nav-img\"> Van\r\n");
      out.write("        </a>\r\n");
      out.write("        <dl class=\"layui-nav-child\">\r\n");
      out.write("          <dd><a href=\"javascript:;\">基本资料</a></dd>\r\n");
      out.write("          <dd><a href=\"javascript:;\">安全设置</a></dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"layui-nav-item\"><a href=\"javascript:;\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i> 注销</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"layui-side layui-bg-black kit-side\">\r\n");
      out.write("    <div class=\"layui-side-scroll\">\r\n");
      out.write("      <div class=\"kit-side-fold\"><i class=\"fa fa-navicon\" aria-hidden=\"true\"></i></div>\r\n");
      out.write("      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->\r\n");
      out.write("      <ul class=\"layui-nav layui-nav-tree\" lay-filter=\"kitNavbar\" kit-navbar>\r\n");
      out.write("        <li class=\"layui-nav-item\">\r\n");
      out.write("          <a class=\"\" href=\"javascript:;\"><i class=\"fa fa-plug\" aria-hidden=\"true\"></i><span> 基本元素</span></a>\r\n");
      out.write("          <dl class=\"layui-nav-child\">\r\n");
      out.write("            <dd>\r\n");
      out.write("              <a href=\"javascript:;\" kit-target data-options=\"{url:'./test',icon:'&#xe6c6;',title:'表格',id:'1'}\">\r\n");
      out.write("                <i class=\"layui-icon\">&#xe6c6;</i><span> 表格</span></a>\r\n");
      out.write("            </dd>\r\n");
      out.write("            <dd>\r\n");
      out.write("              <a href=\"javascript:;\" data-url=\"./form\" data-icon=\"fa-user\" data-title=\"表单\" kit-target data-id='2'><i class=\"fa fa-user\" aria-hidden=\"true\"></i><span> 表单</span></a>\r\n");
      out.write("            </dd>\r\n");
      out.write("            <dd>\r\n");
      out.write("              <a href=\"javascript:;\" data-url=\"./nav\" data-icon=\"&#xe628;\" data-title=\"导航栏\" kit-target data-id='3'><i class=\"layui-icon\">&#xe628;</i><span> 导航栏</span></a>\r\n");
      out.write("            </dd>\r\n");
      out.write("            <dd>\r\n");
      out.write("              <a href=\"javascript:;\" data-url=\"./list4\" data-icon=\"&#xe614;\" data-title=\"列表四\" kit-target data-id='4'><i class=\"layui-icon\">&#xe614;</i><span> 列表四</span></a>\r\n");
      out.write("            </dd>\r\n");
      out.write("            <dd>\r\n");
      out.write("              <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&#xe658;</i><span> 百度一下</span></a>\r\n");
      out.write("            </dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"layui-nav-item\">\r\n");
      out.write("          <a href=\"javascript:;\"><i class=\"fa fa-plug\" aria-hidden=\"true\"></i><span> 组件</span></a>\r\n");
      out.write("          <dl class=\"layui-nav-child\">\r\n");
      out.write("            <dd><a href=\"javascript:;\" kit-target data-options=\"{url:'./navbar',icon:'&#xe658;',title:'Navbar',id:'6'}\"><i class=\"layui-icon\">&#xe658;</i><span> Navbar</span></a></dd>\r\n");
      out.write("            <dd><a href=\"javascript:;\" kit-target data-options=\"{url:'./tab',icon:'&#xe658;',title:'TAB',id:'7'}\"><i class=\"layui-icon\">&#xe658;</i><span> Tab</span></a></dd>\r\n");
      out.write("            <dd><a href=\"javascript:;\" kit-target data-options=\"{url:'./onelevel',icon:'&#xe658;',title:'OneLevel',id:'50'}\"><i class=\"layui-icon\">&#xe658;</i><span> OneLevel</span></a></dd>\r\n");
      out.write("            <dd><a href=\"javascript:;\" kit-target data-options=\"{url:'./app',icon:'&#xe658;',title:'App',id:'8'}\"><i class=\"layui-icon\">&#xe658;</i><span> app.js主入口</span></a></dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"layui-nav-item\">\r\n");
      out.write("          <a href=\"javascript:;\" data-url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/components/table/table.jsp\" data-name=\"table\" kit-loader><i class=\"fa fa-plug\" aria-hidden=\"true\"></i><span> 表格(page)</span></a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"layui-nav-item\">\r\n");
      out.write("          <a href=\"javascript:;\" data-url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/views/form.jsp\" data-name=\"form\" kit-loader><i class=\"fa fa-plug\" aria-hidden=\"true\"></i><span> 表单(page)</span></a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"layui-body\" id=\"container\">\r\n");
      out.write("    <!-- 内容主体区域 -->\r\n");
      out.write("    <div style=\"padding: 15px;\">主体内容加载中,请稍等...</div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"layui-footer\">\r\n");
      out.write("    <!-- 底部固定区域 -->\r\n");
      out.write("    2017 &copy;\r\n");
      out.write("    <a href=\"http://kit.zhengjinfan.cn/\">kit.zhengjinfan.cn/</a> MIT license\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  var cnzz_protocol = ((\"https:\" == document.location.protocol) ? \" https://\" : \" http://\");\r\n");
      out.write("  document.write(unescape(\"%3Cspan id='cnzz_stat_icon_1264021086'%3E%3C/span%3E%3Cscript src='\" + cnzz_protocol + \"s22.cnzz.com/z_stat.php%3Fid%3D1264021086%26show%3Dpic1' type='text/javascript'%3E%3C/script%3E\"));\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/layui/layui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("  var message;\r\n");
      out.write("  layui.config({\r\n");
      out.write("    base: 'build/js/'\r\n");
      out.write("  }).use(['app', 'message'], function() {\r\n");
      out.write("    var app = layui.app,\r\n");
      out.write("            $ = layui.jquery,\r\n");
      out.write("            layer = layui.layer;\r\n");
      out.write("    //将message设置为全局以便子页面调用\r\n");
      out.write("    message = layui.message;\r\n");
      out.write("    //主入口\r\n");
      out.write("    app.set({\r\n");
      out.write("      type: 'iframe'\r\n");
      out.write("    }).init();\r\n");
      out.write("    $('#pay').on('click', function() {\r\n");
      out.write("      layer.open({\r\n");
      out.write("        title: false,\r\n");
      out.write("        type: 1,\r\n");
      out.write("        content: '<img src=\"/build/images/pay.png\" />',\r\n");
      out.write("        area: ['500px', '250px'],\r\n");
      out.write("        shadeClose: true\r\n");
      out.write("      });\r\n");
      out.write("    });\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
