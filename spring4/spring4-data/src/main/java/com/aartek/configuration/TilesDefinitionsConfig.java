package com.aartek.configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.tiles.Attribute;
import org.apache.tiles.Definition;
import org.apache.tiles.definition.DefinitionsFactory;
import org.apache.tiles.request.Request;

public final class TilesDefinitionsConfig implements DefinitionsFactory {

	private static final Map<String, Definition> tilesDefinitions = new HashMap<String, Definition>();
	
	public static final Attribute BASE_TEMPLATE = new Attribute("/WEB-INF/layout/defaultLayout.jsp");

	public Definition getDefinition(String name, org.apache.tiles.request.Request tilesContext) {

		return tilesDefinitions.get(name);
	}

	private static void addDefaultLayoutDef(String name, String body,String menu, String header, String footer) {

		Map<String, Attribute> attributes = new HashMap<String, Attribute>();

		attributes.put("header", new Attribute(header));
		attributes.put("menu", new Attribute(menu));
		attributes.put("body", new Attribute( "/WEB-INF/jsp/" + "" + body + "" + ".jsp"));
		attributes.put("footer", new Attribute(footer));
		tilesDefinitions.put(name, new Definition(name, BASE_TEMPLATE, attributes));

	}

	public static void addDefinitions() {

		// Admin pages
		addDefaultLayoutDef("welcome", "welcome","/WEB-INF/layout/menu.jsp","/WEB-INF/layout/header.jsp", "/WEB-INF/layout/footer.jsp");

		addDefaultLayoutDef("login", "login","/WEB-INF/layout/menu.jsp","/WEB-INF/layout/header.jsp", "/WEB-INF/layout/footer.jsp");
		
		addDefaultLayoutDef("registration", "registration","/WEB-INF/layout/menu.jsp","/WEB-INF/layout/header.jsp", "/WEB-INF/layout/footer.jsp");

		addDefaultLayoutDef("deshboard", "deshboard", "/WEB-INF/layout/menu.jsp","/WEB-INF/layout/header.jsp", "/WEB-INF/layout/footer.jsp");
		
		addDefaultLayoutDef("editRegistration", "editRegistration", "/WEB-INF/layout/menu.jsp","/WEB-INF/layout/header.jsp", "/WEB-INF/layout/footer.jsp");
	}

	public static void addUserLayoutDef(String name, String body,String menu, String header, String footer) {
		addDefaultLayoutDef(name, body,menu, header, footer);

	}
}