package com.gnavin.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

  static String HTML = "<HTML><head><title>First parse</title></head>"
      + "<body><img src=\"smiley.jpg\"/><img src=\"smiley2.jpg\"/>"
      + "<img src=\"smiley3.jpg\"/></body></HTML>";

  public static void main(String[] args) {
    // write your code here

    Document doc = Jsoup.parse(HTML);

    final Elements img = doc.getElementsByTag("img");

    for (Element element : img) {

      System.out.println("element = " + element);
      final Attributes attributes = element.attributes();

      for (Attribute attribute : attributes) {
        System.out.println("attributes = " + attributes);
      }

      final String srcAttr = element.attr("src");
      System.out.println(srcAttr);

    }

  }
}
