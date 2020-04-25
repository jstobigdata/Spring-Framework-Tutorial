package c.jbd.saop.cjp.sm.gettingstarted.model;

/**
 * @author Jstobigdata.com
 * The Message model used by home controller.
 */
public class Message {

  private String title;
  private String subTitle;
  private String body;

  public Message() {
  }

  public String getTitle() {
    return title;
  }

  public Message setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getSubTitle() {
    return subTitle;
  }

  public Message setSubTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

  public String getBody() {
    return body;
  }

  public Message setBody(String body) {
    this.body = body;
    return this;
  }
}

