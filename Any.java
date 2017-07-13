
package com.mycompany.app;
import java.util.ArrayList;
import java.util.List;
 
public class Any{
 
    private String name;
    private int id;
    private String author;
     
    public Any(int id, String name, String author){
        this.id = id;
        this.name = name;
        this.author = author;
    }
     
    public boolean equals(Object obj){
        Any gm = (Any) obj;
        boolean status = false;
        if(this.name.equalsIgnoreCase(gm.name)
                && this.id == gm.id
                && this.author == gm.author){
            status = true;
        }
        return status;
    }
     
    public static List<Any> getList(){
        List<Any> gm = new ArrayList<Any>();
       gm.add(new Any(1, "Abc", "prethi"));
        gm.add(new Any(2, "Bcd", "ramya"));
        gm.add(new Any(3, "Cde", "priya"));
        return gm;
    }
     
    public int hashCode(){
        return this.id;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public String getauthor() {
        return author;
    }
    public void setauthor(String author) {
        this.author = author;
    }
}