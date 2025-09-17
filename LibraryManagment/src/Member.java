import java .util.*;
public class Member  {


    private int id ;
    private String name ;
    private List <MediaItem> borrowItems ;

    Member(int id , String name ){
    this.id = id ;
    this.name = name ;
    this.borrowItems = new ArrayList<>();
    }


    public void borrow (MediaItem item){
    borrowItems.add(item);
    }

    public void returnItem(MediaItem item) {
      borrowItems.remove(item);
    }

    public void displayAllBorrowedItem(){
      if(borrowItems.isEmpty()){
          System.out.println(name+" has no borrowed items ");
      }else {
          System.out.println(name+"borrwed :");
          for(MediaItem item : borrowItems){
              System.out.println(item.getTitle());
          }
      }

    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", borrowItems=" + borrowItems +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getBorrowItems() {
        return borrowItems;
    }

    public void setBorrowItems(List borrowItems) {
        this.borrowItems = borrowItems;
    }
}
