package com.serviceapi.sendEmail;

import com.serviceapi.utils.SendEmail;
import com.serviceapi.utils.sendEmail.MailSenderInfo;
import com.serviceapi.utils.sendEmail.SimpleMailSender;

public class SendEmailTest {

	public static void main(String[] args) {
		//工具类 发送邮件  已调整
		SendEmail();
		//工具包 发送邮件  未调整，网上源码
		MyAuthenticator();
	}

	// SendEmail 测试 com.serviceapi.utils
	private static void SendEmail() {
		SendEmail.sendEmail("Java", "详细内容见附件！", "wushangang@ebaolife.com,1210460667@qq.com", "pom.xml");
	}

	// MyAuthenticator 测试 com.serviceapi.utils.sendEmail
	private static void MyAuthenticator() {
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
	}

}
