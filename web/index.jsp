<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/4 0004
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>城市</title>
    <style>
      div{
        margin-left: 34%;
        margin-top: 100px;
        width: 80%;
        height: auto;
      }
      option{
        width: auto;
      }
    </style>
    <script src="js/jquery.min.js"></script>
    <script>
      //使用异步Ajax来从后端查询数据
      $(function () {
          showArea(0,"#provience")
      })
      function showArea(val,selectID) {
        $.ajax({
          type:"GET",
          url:"areacontroller.do",
          data:{parentid:val},
          dataType:"json",
          success:function (areas) {
            $(selectID).html('<option>-请选择-</option>');
            $.each(areas,function (i,e) {
              $(selectID).append('<option value="'+e.areaid+'">'+e.areaname+'</option>')
            })
            if (selectID=="#city"){
              $("#area").html('<option>-请选择-</option>');
            }
          }
        })
      }

    </script>
  </head>
  <body>
    <div>   <%--onchange 是当前的值发生改变时,做出事件的绑定`  --%>
      籍贯<select id="provience" onchange='showArea(this.value,"#city")'>
        <option >-请选择-</option>
      </select>
      城市<select id="city" onchange='showArea(this.value,"#area")'>
        <option>-请选择-</option>
      </select>
      县区<select id="area">
        <option>-请选择-</option>
      </select>
    </div>
  </body>
</html>
