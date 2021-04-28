package org.obrii.mit.dp2021.hairdresserproject.instagram;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;  
import java.io.InputStreamReader; 
import static java.lang.System.out;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;
 

public class Send_Curl_Req {

    public  Insta_Profile call_me(String code) throws Exception {

		String url = "https://api.instagram.com/oauth/access_token";
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
	 	con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

		String urlParameters = "client_id="+commonthings.CLIENT_ID+"&client_secret="+commonthings.CLIENT_SECRET+"&grant_type=authorization_code&redirect_uri=https:"+commonthings.AUTHORIZATION_REDIRECT_URI+"&code="+code+"";

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
		
		  
		
		Insta_Profile obj_Insta_Profile=new Insta_Profile();
		
		JSONObject jsonObject = new JSONObject(response.toString());
		
		JSONObject myResponse = jsonObject.getJSONObject("user");
	 	
	 	obj_Insta_Profile.setFull_name(myResponse.getString("full_name"));
		obj_Insta_Profile.setId(myResponse.getString("id"));
		obj_Insta_Profile.setProfile_picture(myResponse.getString("profile_picture"));
		obj_Insta_Profile.setUsername(myResponse.getString("username"));
		 
		
		return obj_Insta_Profile;
		
		 
		 

	}
    
    
}