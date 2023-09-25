package tags;

public class Title extends Tag{

    private String text;

    private int lvl;

    public Title(String text, int lvl) {
        this.text = text;
        this.lvl = lvl;
        if(this.lvl<1)
            this.lvl = 1;
        if(this.lvl>6)
            this.lvl = 6;
    }

    public String getText(){
        return this.text;
    }

    public int getLvl(){
        return this.lvl;
    }

    public String getHTML(){
        return "<h" + this.lvl + ">" + this.text + "</h" + this.lvl + ">";
    }

    @Override
    public String toHTML() {
        return getHTML();
    }


}
