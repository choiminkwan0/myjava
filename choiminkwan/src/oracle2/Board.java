package oracle2;

public class Board {
    private String bTitle;
    private String bContent;
    private String bWriter;
    private String bDate;
    private String bFileName;

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }
    public void setbContent(String bContent) {
        this.bContent = bContent;
    }
    public void setbWriter(String bWriter) {
        this.bWriter = bWriter;
    }
    public void setbDate(String bDate) {
        this.bDate = bDate;
    }
    public void setbFileName(String bFileName) {
        this.bFileName = bFileName;
    }
    public String getbTitle() {
        return bTitle;
    }
    public String getbContent() {
        return bContent;
    }
    public String getbWriter() {
        return bWriter;
    }
    public String getbDate() {
        return bDate;
    }
    public String getbFileName() {
        return bFileName;
    }

    @Override
    public String toString() {
        return bTitle + " " + bContent + " " + bWriter + " " +
        bDate + " " + bFileName;
    }

}
