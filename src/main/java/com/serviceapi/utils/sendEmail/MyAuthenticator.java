package com.serviceapi.utils.sendEmail;

import javax.mail.*;

public class MyAuthenticator extends Authenticator {
	String userName = null;
	String password = null;

	public MyAuthenticator() {
	}

	public MyAuthenticator(String username, String password) {
		this.userName = username;
		this.password = password;
	}

	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(userName, password);
	}

	public static void main(String[] args) {
		// 这个类主要是设置邮件
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.qq.com");
		mailInfo.setMailServerPort("465");
		mailInfo.setValidate(true);
		mailInfo.setUserName("1210460667@qq.com"); // 自己的邮箱
		mailInfo.setPassword("hxeuagjeshgdbabb");// 自己的邮箱密码，用于验证 （授权码）

		mailInfo.setFromAddress("1210460667@qq.com"); /// 自己的邮箱
		mailInfo.setToAddress("wushangang@ebaolife.com"); /// 对方的邮箱
		mailInfo.setSubject("设置邮箱标题");
		mailInfo.setContent("设置邮箱内容");

		// 这个类主要来发送邮件
		SimpleMailSender sms = new SimpleMailSender();

		if (sms.sendTextMail(mailInfo)) { // 发送文体格式
			System.out.println("发送成功！");
		}
		// sms.sendHtmlMail(mailInfo);//发送html格式

	}

}
