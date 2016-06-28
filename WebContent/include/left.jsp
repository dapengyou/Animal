<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <script src="../jquery/jquery.js"></script>
<script type="text/JavaScript">
	$(document).ready(function(){
		//页面载入时隐蔽除第一个元素外所有元素
		$("#accordion > li > a + *:not(:first)").hide();
		//对所有元素的标题绑定点击动作
		$("#accordion > li > a").click(function(){
			$(this).parent().parent().each(function(){
				$("> li > a + *",this).slideUp();  //隐蔽所有元素
			});
			$("+ *",this).slideDown();  //展开当前点击的元素
		});
	});
</script>
 <div class="sidebar1">
					<ul id="accordion">	
					<li>
					<a href="#">管理用户</a>
					<ul>
					
					<li><a href="../bus/index">查看用户</a></li>
					<li><a href="userDelete">删除用户</a></li>
				
				</ul>
			</li>
			<li>
				<a href="#">司机管理</a>
				<ul>
				<li><a href="../driver/todriver">添加司机信息</a></li>
				<li><a href="updateDriver">修改司机信息</a></li>
				<li><a href="../driver/driver">查看司机信息</a></li>
				
				</ul>
			</li>
			<li>
				<a href="#">管理公交线路</a>
				<ul>
					<li><a href="../stationLine/tostationLine">添加线路</a></li>
					<li><a href="modfybus.do">修改线路</a></li>
					<li><a href="addbus.jsp">查看线路</a></li>
					<li><a href="delbus.do">删除线路</a></li>
				
				</ul>
			</li>
			<li>
			<a href="#">管理车辆信息</a>
			<ul>
				<li><a href="../buses/tobus">添加信息</a></li>
				<li><a href="addstation.jsp">查看信息</a></li>
				<li><a href="delstation.do">删除信息</a></li>
				<li><a href="modfystation.do">修改信息</a></li>	
	
			</ul>
		</li>
	</ul>
	</div>

