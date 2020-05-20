package service;

import model.User;

// Type your code
public class AstroCalculator{
	
public String toString(User user) 
{
	return "Name:"+user.getName()+"\nGender:"+user.getGender()+"\nDOB:"+user.getDob();
}

public String findSign(User user) {
String[] date1=user.getDob().split("-");
System.out.println(date1);
int date=Integer.parseInt(date1[0]);
int month=Integer.parseInt(date1[1]);

System.out.println(date);
System.out.println(month);
		if(month==12) {
			if(date<22)
				 return "Sagittarius";
			else
				return "Capricorn";
		}
		else if(month==1) {
			if(date<20)
				return "Capricorn";
			else
				return"Aquarius";
		}
		else if(month==2) {
			if(date<19)
				return "Aquarius";
			else
				return "Pisces";
		}
		else if(month==3) {
			if(date<21)
				return "Pisces";
			else
				return "Aries";
		}
		else if(month==4) {
			if(date<20) 
				return "Aries";
			else
				return "Taurus";
		}
		else if(month==5) {
			if(date<21)
				return "Taurus";
			else
				return "Gemini";
		}
		else if(month==6) {
			if(date<21) 
				return "Gemini";
			else
				return "Cancer";
		}
		else if(month==7) {
			if(date<23)
				return "Cancer";
			else
				return "Leo";
		}
		else if(month==8) {
			if(date<23)
				return "Leo";
			else
				return "Virgo";
		}
		else if(month==9) {
			if(date<23)
				return "Virgo";
			else
				return "Libra";
		}
		else if(month==10) {
			if(date<23)
				return "Libra";
			else
				return "Scorpio";
		}
		else if(month==11) {
			if(date<22)
				return "Scorpio";
			else
			return "Sagittarius";		
		}
		return "Values missing";
		
	}
}