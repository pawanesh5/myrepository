package org.niit.model;

public class Author
{
    private int authorid;
    private String authorname;
    private String livewhere;

    public Author(int authorid, String authorname, String livewhere) {
        this.authorid = authorid;
        this.authorname = authorname;
        this.livewhere = livewhere;
    }

    public  Author()
    {

    }

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getLivewhere() {
        return livewhere;
    }

    public void setLivewhere(String livewhere) {
        this.livewhere = livewhere;
    }
}
