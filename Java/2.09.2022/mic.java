class Mic {
	private String model, color;
	private float volume;

	public void setColor(String s) {
		color = s;
	}
	public String getColor() {
		return color;
	}

}

class MicMain {
	public static void main(String[] args) {
		Mic myMic = new Mic();
		myMic.setColor("black");
		System.out.println(myMic.getColor());
	}
}