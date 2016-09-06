package com.serviceapi.utils;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/**
 * https
 * @author Administrator
 *
 */
public class SSL {
	
//	private static HttpClient httpclient = new DefaultHttpClient(new PoolingClientConnectionManager());
//	private static SSLContext ctx;	
//	private static SSLSocketFactory ssf;
//	private static CookieStore cookieStore = new BasicCookieStore();
//	// Create local HTTP context
//    private static HttpClientContext localContext = HttpClientContext.create();
//	//在本地上下问中绑定一个本地存储
//	private static ClientConnectionManager ccm;
//	//register https protocol in httpclient's scheme registry
//	private static SchemeRegistry sr;	
//	private static X509TrustManager tm = new X509TrustManager() {
//		
//		public void checkClientTrusted(X509Certificate[] xcs,
//				String string) throws CertificateException {
//		}
//
//		public void checkServerTrusted(X509Certificate[] xcs,
//				String string) throws CertificateException {
//		}
//
//		public X509Certificate[] getAcceptedIssuers() {
//			return null;
//		}
//	};
	
	/**
	 * 创建HttpClient
	 * @return
	 */
	public static HttpClient CreatHttpClient() {
		HttpClient httpclient = new DefaultHttpClient(new PoolingClientConnectionManager());
		SSLContext ctx;	
		SSLSocketFactory ssf;
		CookieStore cookieStore = new BasicCookieStore();
		// Create local HTTP context
	    HttpClientContext localContext = HttpClientContext.create();
		//在本地上下问中绑定一个本地存储
		ClientConnectionManager ccm;
		//register https protocol in httpclient's scheme registry
		SchemeRegistry sr;	
		X509TrustManager tm = new X509TrustManager() {
			
			public void checkClientTrusted(X509Certificate[] xcs,
					String string) throws CertificateException {
			}

			public void checkServerTrusted(X509Certificate[] xcs,
					String string) throws CertificateException {
			}

			public X509Certificate[] getAcceptedIssuers() {
				return null;
			}
		};
		try {
			ctx = SSLContext.getInstance("SSL");
			ctx.init(null, new TrustManager[] { tm }, null);
			ssf = new SSLSocketFactory(ctx);
			//在本地上下问中绑定一个本地存储
			localContext.setAttribute(ClientContext.COOKIE_STORE, cookieStore);
			ccm = httpclient.getConnectionManager();
			sr = ccm.getSchemeRegistry();
			sr.register(new Scheme("https", 443, ssf));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return httpclient;
		}
	}
	
}
