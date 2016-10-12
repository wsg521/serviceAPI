package com.test;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.activation.*;

public class test {
	
	public static void main(String[] args) {
		try {
			Properties props = new Properties();
	        // 开启debug调试
	        props.setProperty("mail.debug", "true");
	        // 发送服务器需要身份验证
	        props.setProperty("mail.smtp.auth", "true");
	        // 设置邮件服务器主机名
	        props.setProperty("mail.host", "smtp.qq.com");
	        // 发送邮件协议名称
	        props.setProperty("mail.transport.protocol", "smtp");
	
	        MailSSLSocketFactory sf = new MailSSLSocketFactory();
	        sf.setTrustAllHosts(true);
	        props.put("mail.smtp.ssl.enable", "true");
	        props.put("mail.smtp.ssl.socketFactory", sf);
	        props.put("mail.smtp.port", "465");
	
	        Session session = Session.getInstance(props);
	
	        Message msg = new MimeMessage(session);
	        msg.setSubject("seenews 错误");
	        StringBuilder builder = new StringBuilder();
	        builder.append("url = " + "http://blog.csdn.net/never_cxb/article/details/50524571");
	        builder.append("\n页面爬虫错误");
	        builder.append("\n时间 " + new Date().getTime());
	        msg.setText(builder.toString());
	        msg.setFrom(new InternetAddress("1210460667@qq.com"));
	
	        Transport transport = session.getTransport();
	        transport.connect("smtp.qq.com", "1210460667@qq.com", "hxeuagjeshgdbabb");
	
	        transport.sendMessage(msg, new Address[] { new InternetAddress("wushangang@jianbaolife.com") });
	        transport.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
