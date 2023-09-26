package main;

import tags.Paragraph;
import tags.Tag;
import tags.Title;

import java.util.ArrayList;
import java.util.List;

public class Page {

    private List<Tag> contents = new ArrayList<>();

    public void addTag(Tag t){
        this.contents.add(t);
    }

    public String toHTML(){
        String s = "";
        for (Tag t: this.contents) {
            s += t.toHTML();
        }
        return s;
    }


    public static void main(String[] args) {
        Page p = new Page();
        p.addTag(new Title("Hello", 1));
        p.addTag(new Paragraph("paragraphe"));
        p.addTag(new Paragraph("paragraphe"));
        p.addTag(new Title("Hello2", 2));
        p.addTag(new Paragraph("paragraphe"));
        p.addTag(new Paragraph("paragraphe"));
        p.addTag(new Paragraph("paragraphe"));


        System.out.println(p.toHTML());

    }
}
