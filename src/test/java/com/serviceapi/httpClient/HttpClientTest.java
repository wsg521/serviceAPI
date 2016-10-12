package com.serviceapi.httpClient;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

import com.serviceapi.utils.SSL;

public class HttpClientTest {
	
	public static HttpClient httpClient = SSL.CreatHttpClient();
	public static HttpPost httpPost = null;
	public static HttpGet httpGet = null;
	public static HttpResponse httpResp = null;
	
	public static void main(String[] args) throws Exception {
		
		httpPost = new HttpPost("https://login.360.cn/");
		
		httpPost.setHeader(new BasicHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8"));
		httpPost.setHeader(new BasicHeader("Accept-Encoding", "gzip, deflate, br"));
		httpPost.setHeader(new BasicHeader("Accept-Language", "zh-CN,zh;q=0.8"));
		httpPost.setHeader(new BasicHeader("Cache-Control", "no-cache"));
		httpPost.setHeader(new BasicHeader("Connection", "keep-alive"));
		httpPost.setHeader(new BasicHeader("Content-Type", "application/x-www-form-urlencoded"));
		httpPost.setHeader(new BasicHeader("Host", "login.360.cn"));
		httpPost.setHeader(new BasicHeader("Origin", "http://c-c.yunpan.360.cn"));
		httpPost.setHeader(new BasicHeader("Host", "login.360.cn"));
		httpPost.setHeader(new BasicHeader("Pragma", "no-cache"));
		httpPost.setHeader(new BasicHeader("Referer", "http://yunpan.360.cn/"));
		httpPost.setHeader(new BasicHeader("Upgrade-Insecure-Requests", "1"));
		httpPost.setHeader(new BasicHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.82 Safari/537.36"));
		
		List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
		list.add(new BasicNameValuePair("src", "pcw_cloud"));
		list.add(new BasicNameValuePair("from", "pcw_cloud"));
		list.add(new BasicNameValuePair("charset", "UTF-8"));
		list.add(new BasicNameValuePair("requestScema", "https"));
		list.add(new BasicNameValuePair("o", "sso"));
		list.add(new BasicNameValuePair("m", "login"));
		list.add(new BasicNameValuePair("lm", "0"));
		list.add(new BasicNameValuePair("captFlag", "1"));
		list.add(new BasicNameValuePair("rtype", "data"));
		list.add(new BasicNameValuePair("validatelm", "0"));
		list.add(new BasicNameValuePair("isKeepAlive", ""));
		list.add(new BasicNameValuePair("captchaApp", "i360"));
		list.add(new BasicNameValuePair("userName", "1210460667@qq.com"));
		list.add(new BasicNameValuePair("type", "normal"));
		list.add(new BasicNameValuePair("account", "1210460667@qq.com"));
		list.add(new BasicNameValuePair("password", "3f07c8fffe0adbf0a20c936ae44b137b"));
		list.add(new BasicNameValuePair("captcha", ""));
		list.add(new BasicNameValuePair("token", ""));
		list.add(new BasicNameValuePair("proxy", "http://yunpan.360.cn/psp_jump.html"));
		list.add(new BasicNameValuePair("callback", "QiUserJsonp762741203"));
		list.add(new BasicNameValuePair("func", "QiUserJsonp762741203"));
		HttpEntity requestEntity = new UrlEncodedFormEntity(list, "gbk");
	}
	
}
