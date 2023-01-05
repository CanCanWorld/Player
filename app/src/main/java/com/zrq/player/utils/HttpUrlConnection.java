//package com.zrq.player.utils;
//
//import net.sf.json.JSONObject;
//
//import org.json.JSONObject;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.*;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.URLEncoder;
//import java.util.Map;
//
//
///**
// * @author txp
// * @description 发起http请求的工具类 功能发起httppost请求与get请求并得到字符串类型返回结果
// * @create 2019-07-08-10:50
// */
//public class HttpUrlConnection {
//
//    private static final Logger logger = LoggerFactory.getLogger(HttpUrlConnection.class);
//
//    public static String httpPostRequest(String url, Map<String, Object> params) {
//        String result = null;
//        try {
//            InputStream is = httpRequestToStream(url, params);
//            BufferedReader in = new BufferedReader(new InputStreamReader(is,
//                    "UTF-8"));
//            StringBuffer buffer = new StringBuffer();
//            String line = "";
//            while ((line = in.readLine()) != null) {
//                buffer.append(line);
//            }
//            result = buffer.toString();
//        } catch (Exception e) {
//            logger.error("输入流异常");
//            return null;
//        }
//        return result;
//    }
//
//    public static String httpPostRequest(String url, String xml) {
//        String result = null;
//        try {
//            InputStream is = httpPostXML(url, xml);
//            BufferedReader in = new BufferedReader(new InputStreamReader(is,
//                    "UTF-8"));
//            StringBuffer buffer = new StringBuffer();
//            String line = "";
//            while ((line = in.readLine()) != null) {
//                buffer.append(line);
//            }
//            result = buffer.toString();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//        return result;
//    }
//
//    public static String httpPostRequest(String url, JSONObject json) {
//        String result = null;
//        try {
//            InputStream is = httpPostJson(url, json);
//            BufferedReader in = new BufferedReader(new InputStreamReader(is,
//                    "UTF-8"));
//            StringBuffer buffer = new StringBuffer();
//            String line = "";
//            while ((line = in.readLine()) != null) {
//                buffer.append(line);
//            }
//            result = buffer.toString();
//        } catch (Exception e) {
//            logger.error("输入流异常" + e.toString());
//            return null;
//        }
//        return result;
//    }
//
//    private static InputStream httpPostXML(String url, String xml) {
//        InputStream is = null;
//
//        PrintWriter out = null;
//        try {
//            URL u;
//            u = new URL(url);
//            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
//            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//            conn.setConnectTimeout(20000);
//            conn.setReadTimeout(20000);
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            conn.setUseCaches(false);
//            conn.setRequestMethod("POST");
//            OutputStreamWriter outWriter = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
//            out = new PrintWriter(outWriter);
//            out.print(xml);
//            out.flush();
//            out.close();
//            is = conn.getInputStream();
//        } catch (Exception e) {
//
//            e.printStackTrace();
//        }
//
//        return is;
//    }
//
//    private static InputStream httpRequestToStream(String url, Map<String, Object> params) {
//        InputStream is = null;
//        String parameters = "";
//        boolean hasParams = false;
//
//        for (String key : params.keySet()) {
//            String value = "";
//            if (params.get(key) != null
//                    && !params.get(key).toString().equals("")) {
//                try {
//                    value = URLEncoder.encode(params.get(key) + "", "UTF-8");
//                } catch (UnsupportedEncodingException e) {
//                    logger.error("params拼接异常", e);
//                }
//                parameters += key + "=" + value + "&";
//                hasParams = true;
//            }
//        }
//        if (hasParams) {
//            parameters = parameters.substring(0, parameters.length() - 1);
//        }
//        System.out.println("这个参数" + parameters);
//        try {
//            System.out.println("网络url：" + url);
//            URL u;
//            u = new URL(url);
//            System.out.println();
//            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
//            conn.setRequestProperty("Content-Type",
//                    "application/x-www-form-urlencoded");
//            conn.setRequestProperty("Accept-Charset", "UTF-8");
//            conn.setRequestProperty("contentType", "utf-8");
//            conn.setConnectTimeout(20000);
//            conn.setReadTimeout(20000);
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            conn.setUseCaches(false);
//            conn.setRequestMethod("POST");
//            DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
//            dos.writeBytes(parameters);
//            dos.flush();
//            dos.close();
//            is = conn.getInputStream();
//        } catch (Exception e) {
//
//            logger.error("连接后台异常", e);
//        }
//
//        return is;
//    }
//
//    private static InputStream httpPostJson(String url, JSONObject json) {
//        InputStream is = null;
//
//        PrintWriter out = null;
//        try {
//
//            URL u;
//            u = new URL(url);
//            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
//            conn.setRequestProperty("Content-Type",
//                    "application/x-www-form-urlencoded");
//            conn.setConnectTimeout(20000);
//            conn.setReadTimeout(20000);
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            conn.setUseCaches(false);
//            conn.setRequestMethod("POST");
//            OutputStreamWriter outWriter = new OutputStreamWriter(
//                    conn.getOutputStream(), "utf-8");
//            out = new PrintWriter(outWriter);
//            out.print(json.toString());
//            out.flush();
//            out.close();
//
//            is = conn.getInputStream();
//        } catch (Exception e) {
//
//            logger.error("连接后台异常", e);
//        }
//
//        return is;
//    }
//
//    public static String httpGetRequest(String url, Map<String, Object> params) {
//        String result = null;
//        try {
//            InputStream is = httpGetRequestToStream(url, params);
//            BufferedReader in = new BufferedReader(new InputStreamReader(is,
//                    "UTF-8"));
//            StringBuffer buffer = new StringBuffer();
//            String line = "";
//            while ((line = in.readLine()) != null) {
//                buffer.append(line);
//            }
//            result = buffer.toString();
//        } catch (Exception e) {
//            return null;
//        }
//
//        return result;
//    }
//
//    private static InputStream httpGetRequestToStream(String url, Map<String, Object> params) {
//        InputStream is = null;
//        try {
//            String parameters = "";
//            boolean hasParams = false;
//            for (String key : params.keySet()) {
//                String value = URLEncoder.encode(params.get(key) + "", "UTF-8");
//                parameters += key + "=" + value + "&";
//                hasParams = true;
//            }
//            if (hasParams) {
//                parameters = parameters.substring(0, parameters.length() - 1);
//            }
//
//            url += "?" + parameters;
//
//            URL u = new URL(url);
//            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
//            conn.setRequestProperty("Content-Type",
//                    "application/x-www-form-urlencoded");
//            conn.setRequestProperty("Accept-Charset", "UTF-8");
//            conn.setRequestProperty("contentType", "utf-8");
//            conn.setConnectTimeout(20000);
//            conn.setReadTimeout(20000);
//            conn.setDoInput(true);
//            conn.setRequestMethod("GET");
//
//            is = conn.getInputStream();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return is;
//    }
//
//    public static void main(String[] args) {
//        String line = HttpUrlConnection.httpPostRequest("https://www.baidu.com", "");
//        System.out.println(line);
//    }
//}
