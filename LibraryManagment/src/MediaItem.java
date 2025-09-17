public abstract class MediaItem {

    private int id ;
    private String title ;
    private String author ;
    private boolean isAvailable ;

    MediaItem(){};

    MediaItem(int id , String title , String author ){
        this.author = author ;
        this.id = id ;
        this.title = title ;
        this.isAvailable = true  ;

    }


    public boolean borrow(){
        if(isAvailable){
            isAvailable = false ;
                return true ;
                                }
        else{
            return false ;
                                }
                                    }
                                    public void returnItem(){
                                isAvailable = true ;

}
public void displayInfo(){



}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "MediaItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
