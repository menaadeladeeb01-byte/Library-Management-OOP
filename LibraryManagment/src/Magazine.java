public class Magazine extends MediaItem {

    private String issueNumber ;

Magazine(String issueNumber){
    this.issueNumber = issueNumber ;
}

Magazine (int id , String title , String author,String issueNumber){
    super(id , title , author );
    this.issueNumber = issueNumber ;
}


    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }


}
