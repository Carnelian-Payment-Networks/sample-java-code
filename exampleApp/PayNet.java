package exampleApp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import sun.rmi.runtime.Log;

public class PayNet {
    String PayNetUrl = "https://merchants.paynet.co.in/apipaynet/";
    String merchantEmail = "email@example.com";
    String merchantSecretKey = "bZ7U3SCxz1XC1Aeby05WCDknKQTfZ9na9v5dnHKWIIyJjNVRO1OqE9OoZIEZS1a1xffUWZRFIqp1dlT2mIt1RipR04QS60UDg9yd";
    
   
    String authentication_request(String urlParameters) throws UnsupportedEncodingException, ParseException {
        urlParameters = "merchant_email=" + URLEncoder.encode(merchantEmail, "UTF-8") + "&secret_key="
                    + URLEncoder.encode(merchantSecretKey, "UTF-8");
        return connection_request("authenticate_key/", urlParameters);
    }
    
    String create_payment_request(String urlParameters) throws UnsupportedEncodingException, ParseException {
        return connection_request("generate_payment_page/", urlParameters);
    }

    String connection_request(String targetURL, String urlParameters) throws ParseException {
        URL url;
        HttpURLConnection connection = null;
        try {
            url = new URL(PayNetUrl +targetURL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            String mendatoryParameters
                    = "merchant_email=" + URLEncoder.encode(merchantEmail, "UTF-8") + "&secret_key=" + URLEncoder.encode(merchantSecretKey, "UTF-8");
            urlParameters = mendatoryParameters + urlParameters ;
            System.out.println(urlParameters +" \n");
            connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");

            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);

            //Send request
            DataOutputStream wr = new DataOutputStream(
                    connection.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.flush();
            wr.close();
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                System.out.println("Output from Server .... \n" +connection.getResponseCode());
            }

            //Get Response	
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            System.out.println("Output from Server .... \n");
            while ((line = rd.readLine()) != null) {
                return line;
            }
            rd.close();

        } catch (IOException ex) {
            System.err.println("An IOException was caught!");
            ex.printStackTrace();
        } finally {

            if (connection != null) {
                connection.disconnect();
            }
        }
        return "";
    }
}