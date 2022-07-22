/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;



import Frame.DBClass;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;


public class JSONRead {

    public static void main(String[] args) {
        try {
            JSONRead.call_me("/wp-json/wc/v3/orders");
        } catch (java.net.UnknownHostException e) {
            System.out.println("java.net.UnknownHostException");
        } catch (java.net.ConnectException e) {
            System.out.println("Please Connect to INTERNET");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void call_me(String URL) throws Exception {

        String usernameColonPassword = "ck_3dfd43c9db2d7dcb6fada05324974dd3d6e9e572:cs_f978fe0cc2946942f0400eed217d50482e73c110";
        String basicAuthPayload = "Basic " + Base64.getEncoder().encodeToString(usernameColonPassword.getBytes());

        //  String URL = "/wp-json/wc/v3/orders";
        String url = "https://www.siddha.lk" + URL;
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        con.addRequestProperty("Authorization", basicAuthPayload);

        //add request header
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        StringBuilder response;
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
        }
        //print in String
        System.out.println(response.toString());

        //Read JSON response and print
        Gson g = new Gson();
        if (URL.equals("/wp-json/wc/v3/orders")) {
            odersDto[] oders = g.fromJson(response.toString(), odersDto[].class);
            for (odersDto invoice : oders) {
                //    save all_oder
                DBClass.putData("insert into all_oder (_id,date) values('" + invoice.getId() + "',"
                        + "'"+invoice.getDate_modified() + "' ");

                System.out.println(invoice.getId() + "    ----->>> ");
                System.out.println(invoice.getCustomer_id());
                System.out.println(invoice.getDate_modified());

                System.out.println(invoice.getBilling().getCity());
                System.out.println(invoice.getBilling().getEmail());

                System.out.println("+++++++++++");
                String s1 = invoice.getLine_items().toString();

                for (line_itemsListDto li : invoice.getLine_items()) {
                    System.out.println("id :" + li.getId());
                    System.out.println("product id :" + li.getProduct_id());
                    System.out.println("name :" + li.getName());
                    System.out.println("qty :" + li.getQuanity());
                    System.out.println("total :" + li.getTotal());

                }

                System.out.println("****************");
            }
        }
        
        
    }
}

