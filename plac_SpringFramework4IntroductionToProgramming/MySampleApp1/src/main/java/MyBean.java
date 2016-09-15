import java.util.Calendar;
import java.util.Date;

public class MyBean implements MyBeanInterface {
	private Date date;
	private String message;
	
	public MyBean() {
		super();
		this.date = Calendar.getInstance().getTime();
	}
	public MyBean(String message) {
		this();
		this.message = message;
	}

	/* (non-Javadoc)
	 * @see MyBeanInterface#getDate()
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/* (non-Javadoc)
	 * @see MyBeanInterface#getMessage()
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/* (non-Javadoc)
	 * @see MyBeanInterface#setMessage(java.lang.String)
	 */
	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MyBean [message=" + message + ", date=" + date + "]";
	}
}
