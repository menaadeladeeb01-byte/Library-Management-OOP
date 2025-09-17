import java.util.*;

public class Library {
    private HashMap < Integer , MediaItem > mediaCollection ;
    private List <Member> members ;

    Library(){
        mediaCollection = new HashMap<>();
        members = new ArrayList<>();

    }

    public HashMap<Integer, MediaItem> getMediaCollection() {
        return mediaCollection;
    }

    public void addItem(MediaItem item){
        mediaCollection.put(item.getId() , item);
    }

    public void removeItem(int id){
        mediaCollection.remove(id);
    }

    public void registerMember(Member member){
        members.add(member);
    }
    public Member findMember (int memberId){
        for(Member m :members){
            if(m.getId() == memberId){
               return m ;
            }
        }
        return null;
    }

    public void borrowItem( int itemId , int memberId ){
        Member member = findMember(memberId);
        MediaItem item = mediaCollection.get(itemId);

        if(member != null && item != null && item.isAvailable()){
            member.borrow(item);
            item.setAvailable(false);
            System.out.println(" item borrowed successfully ");
        }else {
            System.out.println("cannot borrow item (member not found or item not available ");
        }

    }
    public void returnItem(int itemId , int memberId){
        Member member = findMember(memberId);
        MediaItem item = mediaCollection.get(itemId);

        if(member != null && item != null ){
            member.returnItem(item);
            item.setAvailable(true);
            System.out.println("item is returned ");
        }
        else{
            System.out.println("cannot return item ");
        }

    }
    public void listAvailableItem(){
        for(MediaItem item :mediaCollection.values()){
            if(item.isAvailable()){
                System.out.println(item);
            }
        }
    }

    public void setMediaCollection(HashMap <Integer, MediaItem> mediaCollection) {
        this.mediaCollection = mediaCollection;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}

