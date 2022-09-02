class Mic {
	private String model, color;
	private float volume;

	public void setColor(String s) {
		color = s;
	}

	//nested method cuz it's a private which gets called by the public show()
	private String getColor() {
		return color;
	}
	public void show() {
		System.out.println("color is " + getColor());
	}

}

class MicMain {
	public static void main(String[] args) {
		Mic myMic = new Mic();
		myMic.setColor("black");
		myMic.show();
	}
}