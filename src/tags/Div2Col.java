package tags;

import javax.management.BadAttributeValueExpException;
import java.util.ArrayList;
import java.util.List;

public class Div2Col extends Tag{
    List<Tag> left = new ArrayList<>();
    List<Tag> right = new ArrayList<>();

    public String toHTML(){
        String resultHTML = "<div style=\"display: flex; gap: 5px;\"> <div style=\"border: 2px solid red;\">";
        for ( Tag tag : left) {
            resultHTML += tag.toHTML();
        }
        resultHTML += "</div><div style=\"border: 2px solid red;\">";
        for ( Tag tag : right) {
            resultHTML += tag.toHTML();
        }
        return resultHTML + "</div> </div>" ;
    }



    public void addToLeft(Tag t){
        left.add(t);
    }

    public void addToRight(Tag t){
        right.add(t);
    }

    public static void main(String[] args) throws BadAttributeValueExpException {

        Div2Col d = new Div2Col();
        Div2Col d2 = new Div2Col();
        //Paragraph p =new Paragraph();
        d.addToLeft(new Paragraph("Voila un paragraphe à gauche"));
        d.addToLeft(new Paragraph("Celui ci aussi"));
        d.addToLeft(new Paragraph("un autre paragraphe"));
        d.addToLeft(new Paragraph("un 4eme paragraphe"));
        d.addToLeft(new Paragraph("un 5eme paragraphe"));
        d.addToLeft(new Paragraph("un 6eme paragraphe"));

        d.addToRight(new Paragraph("Voila un paragraphe à droite"));

        d2.addToLeft(new Title("Colone gauche de div dans div",1));
        d2.addToRight(new Img("https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png", "logo de google"));
        d2.addToRight(new Title("Titre à droite", 1));

        d.addToRight(d2);

        System.out.println(d.toHTML());
    }
}
