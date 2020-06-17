package exampleApp;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import exampleApp.PayNet;
import org.json.simple.parser.ParseException;

public class exampleApp {
    public static void main(String[] args) throws UnsupportedEncodingException, ParseException {
        PayNet paynet = new PayNet();
        /*
        *   API authentication
        */
        String response  = paynet.authentication_request("");
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(response);
        System.out.println(json.get("response_code")+"\n");     
        
        /*
        *   API Create Payment Page request
        */
        String urlParameters;
        urlParameters = 
                "&cc_first_name=" + URLEncoder.encode("John", "UTF-8") 
                + "&cc_last_name=" + URLEncoder.encode("Doe", "UTF-8") 
                + "&cc_phone_number=" + URLEncoder.encode("00973", "UTF-8") 
                + "&phone_number=" + URLEncoder.encode("33878768", "UTF-8") 
                + "&billing_address=" + URLEncoder.encode("juffair manama bahrain", "UTF-8") 
                + "&city=" + URLEncoder.encode("manama", "UTF-8") 
                + "&state=" + URLEncoder.encode("manama", "UTF-8") 
                + "&postal_code=" + URLEncoder.encode("00973", "UTF-8") 
                + "&country=" + URLEncoder.encode("BHR", "UTF-8") 
                + "&address_shipping=" + URLEncoder.encode("juffair manama bahrain", "UTF-8") 
                + "&city_shipping=" + URLEncoder.encode("manama", "UTF-8") 
                + "&state_shipping=" + URLEncoder.encode("manama", "UTF-8") 
                + "&postal_code_shipping=" + URLEncoder.encode("00973", "UTF-8") 
                + "&country_shipping=" + URLEncoder.encode("BHR", "UTF-8") 
                + "&email=" + URLEncoder.encode("mustafeez@PayNet.com", "UTF-8") 
                + "&amount=" + URLEncoder.encode("101.00", "UTF-8") 
                + "&currency=" + URLEncoder.encode("USD", "UTF-8") 
                + "&title=" + URLEncoder.encode("Testing Java Code", "UTF-8") 
                + "&discount=" + URLEncoder.encode("0.0", "UTF-8") 
                + "&msg_lang=" + URLEncoder.encode("en", "UTF-8") 
                + "&quantity=" + URLEncoder.encode("1 || 1 || 1", "UTF-8") 
                + "&unit_price=" + URLEncoder.encode("2 || 2 || 6", "UTF-8") 
                + "&products_per_title=" + URLEncoder.encode("Product1 || Product 2 || Product 4", "UTF-8") 
                + "&paypage_info=" + URLEncoder.encode("12331", "UTF-8") 
                + "&reference_no=" + URLEncoder.encode("122333", "UTF-8") 
                + "&site_url=" + URLEncoder.encode("http://192.168.11.104/multivendor", "UTF-8") 
                + "&return_url=" + URLEncoder.encode("http://192.168.11.104/multivendor/return", "UTF-8") 
                + "&cms_with_version=" + URLEncoder.encode("JavaCode1.0", "UTF-8") 
                + "&other_charges=" + URLEncoder.encode("91.00", "UTF-8") 
                + "&shipping_first_name=" + URLEncoder.encode("Mustafeez", "UTF-8") 
                + "&shipping_last_name=" + URLEncoder.encode("Aslam", "UTF-8")
                + "&ip_customer=" + URLEncoder.encode("192.168.11.1", "UTF-8")
                + "&ip_merchant=" + URLEncoder.encode("192.168.11.1", "UTF-8");
        response  = PayNet.create_payment_request(urlParameters);
        JSONParser parser1 = new JSONParser();
        JSONObject json1 = (JSONObject) parser1.parse(response);
        System.out.println(json1.get("response_code")+"\n");        
    }
    

}