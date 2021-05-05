package org.obrii.mit.dp2021.hairdresserproject.instagram;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;  
import java.io.InputStreamReader; 
import static java.lang.System.out;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;
import org.obrii.mit.dp2021.hairdresserproject.user.User;
 

public class Send_Curl_Req {

    public  User call_me(String code) throws Exception {

		String url = "https://api.instagram.com/oauth/access_token";
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
	 	con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

		String urlParameters = "client_id="+commonthings.CLIENT_ID+"&client_secret="+commonthings.CLIENT_SECRET+"&grant_type=authorization_code&redirect_uri=https://hairdresserproject.herokuapp.com/inst&code="+code+"";

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		out.println("\nSending 'POST' request to URL : " + url);
		out.println("Post parameters : " + urlParameters);
		out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		  
		System.out.println(response.toString());
		
		  
		
		
		
		JSONObject jsonObject = new JSONObject(response.toString());
		
		
                User newUser = new User(String.valueOf(jsonObject.getInt("user_id")),this.getUserName(jsonObject.getString("access_token")) );
	 			 		
		return newUser;
		
		 
		 

	}
    public  String getUserName(String access_token) throws Exception {
        String url = "https://graph.instagram.com/me?fields=id,username&access_token="+access_token+"";
        URL obj = new URL(url);
	HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("GET");	

		int responseCode = con.getResponseCode();
		out.println("\nSending 'Get' request to URL : " + url);
		out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		  
		System.out.println(response.toString());
		
		  
		
		
		
		JSONObject jsonObject = new JSONObject(response.toString());
		 
		
		return jsonObject.getString("username");
    
    
    
    }
}