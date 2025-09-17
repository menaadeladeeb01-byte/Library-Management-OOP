public class Book extends MediaItem implements Reservable {

    private String genre ;
    boolean isReserved;


    Book (int id , String title , String author,String genre, boolean isReserved){
        super(id , title , author );
        this.genre = genre ;
        this.isReserved = false ;
    }
@Override
    public boolean reserve (){
        if( !isReserved && isAvailable()) {
            isReserved = true;
            return true;
        }
            return false ;
    }
@Override
    public void cancerReserve(){
        isReserved = false;
    }
@Override
    public void isReserved(){

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
