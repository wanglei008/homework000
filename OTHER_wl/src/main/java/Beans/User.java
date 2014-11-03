package Beans;

public class User {
	private int Code;
	private String CardId;
	private String TrueName;
	private String PassWord;
	private int Flag;
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	public String getCardId() {
		return CardId;
	}
	public void setCardId(String cardId) {
		CardId = cardId;
	}
	public String getTrueName() {
		return TrueName;
	}
	public void setTrueName(String trueName) {
		TrueName = trueName;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public int getFlag() {
		return Flag;
	}
	public void setFlag(int flag) {
		Flag = flag;
	} 
}
