package com.nt.main;

import com.nt.util.JwtUtils;

import io.jsonwebtoken.Claims;

public class JwtTokenClass {

	public static void main(String[] args) {
		String token = JwtUtils.generateToken("25egt857", "Mashreq", "5789876543");
		System.out.println(token);
		System.out.println();
	
	//======================================Get Token details=======================
//String token="eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIyNWVndDg1NyIsInN1YiI6Ik1hc2hyZXEiLCJpc3MiOiJFaWRpa28iLCJpYXQiOjE2NTE1NzE3NjksImV4cCI6MTY1MTU3MjM2OX0.aq-fQTwpXJW08HHpVdnHyy3FIhiFe0heeIZC1RemDhE";
	
		Claims claims = JwtUtils.getClaims("5789876543",token);
	System.out.println(claims);
	System.out.println("subject/username:"+claims.getSubject());
	System.out.println("client Id :"+claims.getId());
	System.out.println("expiry date,time :"+claims.getExpiration());
	System.out.println("user/subject name:"+claims.getIssuedAt());
	System.out.println();
	
//======================================validate Token=======================
	System.out.println("Is this token valid :"+JwtUtils.isTokenValid("5789876543", token));
	
	
	//======================================get subject/username=======================
		System.out.println("user/subject name :"+JwtUtils.getSubject("5789876543", token));
	
	//======================================get Expiry date of token=======================
	System.out.println("get Expiry Date and Time :"+JwtUtils.getExpiryDate("5789876543", token));
	
	}
}
