import org.testng.annotations.Test;

public class TimelineTest extends Base{

    @Test (enabled = false)
    public void timeline() throws InterruptedException {  /* go to post */
        TimelinePage timeline = new TimelinePage(driver);
        timeline.goToPost();
    }

    @Test (enabled = false)
    public void writeComment() throws InterruptedException { /* write a comment */
        TimelinePage timeline = new TimelinePage(driver);
        timeline.writeAComment();
    }

    @Test (enabled = false)
    public void publicPost() throws InterruptedException { /* create public post*/
        TimelinePage timeline = new TimelinePage(driver);
        timeline.createPublicPost();
    }



}
