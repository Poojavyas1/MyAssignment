package week.day1;

public class Mobile {

	public void sendSms() {
		System.out.println("SendSms");

	}
  void AllowVoiceCall() {
	System.out.println("AllowVoiceCall");

}
private void TakeVideo() {
	System.out.println("TakeVideo");

}

	public static void main(String[] args) {
	Mobile obj =new Mobile();
	
obj.sendSms();

obj.AllowVoiceCall();

obj.TakeVideo();
	}

}
