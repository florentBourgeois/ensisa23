package tags;

public class Paragraph extends Tag {
    private String text;

    // Default constructor -> no parameters produit toujours le même résultat
    public Paragraph(){
        this.text = "Paragraphe par défaut il est beau il est frais. C'est un paragraphe incroyable";
    }

    // Constructor with parameters -> les paramettres permettent de personaliser le résultat
    public Paragraph(String text){
        this.text = text;
    }

    // Copy constructor -> permet de copier un objet
    public Paragraph(Paragraph p){
        this.text = p.getText();
    }


    public String getText(){
        return this.text;
    }

    public String getHTML(){
        return "<p>" + this.text + "</p>";
    }

    @Override
    public String toHTML() {
        return getHTML();
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "text='" + text + '\'' +
                "} -> produces following html: " + this.getHTML();
    }
}