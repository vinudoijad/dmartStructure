package com.DMartSections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class DMart {
	
	public static void main(String[] args) {
		
		ArrayList<String> FoodSection=new ArrayList<String>();
		
		FoodSection.add("Cookies");
		FoodSection.add("Masala");
		FoodSection.add("Rice");
		
		ArrayList<String> ClothSection= new ArrayList<String>();
		
		ClothSection.add("InnerWear");
		ClothSection.add("Outfit");
		ClothSection.add("BabyCloths");
		
		ArrayList<String> ColdDrinksSection= new ArrayList<String>();
		
		ColdDrinksSection.add("String");
		ColdDrinksSection.add("CocoCola");
		ColdDrinksSection.add("Pepci");
		
        ArrayList<String> SareeSection= new ArrayList<String>();
		
		SareeSection.add("Kanchipuram");
		SareeSection.add("Paithani");
		SareeSection.add("Nauvari");
	
		HashMap<String , ArrayList<String>> section= new HashMap<String, ArrayList<String>>();
		
		section.put("Food Category", FoodSection);
		section.put("Cloth Category", ClothSection);
		section.put("Drinks Category" , ColdDrinksSection);
		section.put("Saree Category", SareeSection);
		
		HashMap<String, HashMap<String, ArrayList<String>>> D_Mart= new HashMap<String, HashMap<String, ArrayList<String>>>();
		
		D_Mart.put("D-Mart Sections", section);
		
		Set<String> s= D_Mart.keySet();
		
		for(String str: s) {
			System.out.println(str);
			System.out.println(D_Mart.get(str));
		}
	}

}
