package tags;

public class Img extends Tag {
    //<img src="edapzdapzdokaz" alt="azdadazdadaz az dazd az "/>

    private String src;
    private String alt;

    public Img(String src, String alt) {
        this.src = src;
        this.alt = alt;
    }

    public String getAlt() {
        return alt;
    }

    public String getSrc(){
        return this.src;
    }


    public String getHTML(){
        return "<img src='" + this.src + "' alt='" + this.alt + "'/>";
    }

    @Override
    public String toHTML() {
        return getHTML();
    }
}
