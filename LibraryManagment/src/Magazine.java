public class Magazine extends MediaItem {

    private int issueNumber ;

Magazine(int issueNumber){
    this.issueNumber = issueNumber ;
}

Magazine (int id , String title , String author,int issueNumber){
    super(id , title , author );
    this.issueNumber = issueNumber ;
}


    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }


}
